package org.example.app.view;

import org.example.app.utils.Constants;
import org.springframework.stereotype.Component;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.example.app.utils.Constants.APP_CLOSE_MSG;
import static org.example.app.utils.Constants.PRODUCT_MENU;

@Component
public class AppView {

    Scanner scanner = new Scanner(System.in);

    public String getOption() {
        showMenu();
        String option = "";
        try {
            option = scanner.nextLine().trim();
        } catch (InputMismatchException ime) {
            System.out.println(Constants.INCORRECT_VALUE_MSG);
        }
        return option;
    }

    private void showMenu() {
        System.out.print(PRODUCT_MENU);
    }

    public void close() {
        System.out.println(APP_CLOSE_MSG);
        scanner.close();
        System.exit(0);
    }
}
