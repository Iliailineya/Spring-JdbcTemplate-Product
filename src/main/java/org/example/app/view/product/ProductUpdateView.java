package org.example.app.view.product;

import org.example.app.utils.IdValidator;
import org.example.app.view.views_util.InputOutputView;
import org.springframework.stereotype.Component;

@Component
public class ProductUpdateView extends InputOutputView {

    public String[] getData() {
        String title = "Input id: ";
        String id = inputReader.readString(title);
        if (IdValidator.isIdNotValid(id)) {
            id = "0";
        }

        title = "Input new name: ";
        String name = inputReader.readString(title);

        title = "Input new quota: ";
        String quota = inputReader.readString(title);

        title = "Input new price: ";
        String price = inputReader.readString(title);

        return new String[]{id, name, quota, price};
    }
}
