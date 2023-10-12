package org.example.app.view.product;

import org.example.app.view.views_util.InputOutputView;
import org.springframework.stereotype.Component;

@Component
public class ProductDeleteView extends InputOutputView {

    public String[] getData() {
        String title = "Input id: ";
        String id = inputReader.readString(title);
        return new String[]{id};
    }
}
