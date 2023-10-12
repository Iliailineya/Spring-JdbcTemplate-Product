package org.example.app.controller.impl;

import org.example.app.controller.BaseController;
import org.example.app.entity.Product;
import org.example.app.service.impl.ProductServiceImpl;
import org.example.app.utils.starter.AppStarter;
import org.example.app.view.AppView;
import org.example.app.view.product.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("productController")
public class ProductControllerImpl implements BaseController {

    @Autowired
    AppView menuView;
    @Autowired
    ProductCreateView createView;
    @Autowired
    ProductReadView readView;
    @Autowired
    ProductReadByIdView readByIdView;
    @Autowired
    ProductUpdateView updateView;
    @Autowired
    ProductDeleteView deleteView;
    @Autowired
    ProductServiceImpl serviceImpl;

    public ProductControllerImpl() {

    }

    public void getOption() {
        String option = menuView.getOption();
        switch (option) {
            case "1" -> create();
            case "2" -> getAll();
            case "3" -> getById();
            case "4" -> update();
            case "5" -> delete();
            case "0" -> menuView.close();
        }
    }

    public void create() {
        String[] data = createView.getData();
        Product product = new Product(null, data[0], data[1], data[2]);
        createView.getOutput(serviceImpl.create(product));
        AppStarter.startApp();
    }

    public void getAll() {
        readView.getOutput(serviceImpl.getAll());
        AppStarter.startApp();
    }

    public void getById() {
        readByIdView.getOutput(serviceImpl
                .getById(readByIdView.getData()[0]));
        AppStarter.startApp();
    }

    public void update() {
        String[] data = updateView.getData();
        Product product = new Product(Integer.parseInt(data[0]), data[1], data[2], data[3]);
        updateView.getOutput(serviceImpl.update(product));
        AppStarter.startApp();
    }

    public void delete() {
        deleteView.getOutput(serviceImpl
                .delete(deleteView.getData()[0]));
        AppStarter.startApp();
    }
}
