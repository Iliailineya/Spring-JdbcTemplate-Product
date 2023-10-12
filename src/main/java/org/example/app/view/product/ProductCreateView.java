package org.example.app.view.product;

import org.example.app.view.views_util.InputOutputView;
import org.springframework.stereotype.Component;

@Component
public class ProductCreateView extends InputOutputView {

    public String[] getData() {
        String title = "Input name: ";
        String name = inputReader.readString(title);

        title = "Input quota: ";
        String quota = inputReader.readString(title);

        title = "Input price: ";
        String price = inputReader.readString(title);

        return new String[]{name, quota, price};
    }
}
