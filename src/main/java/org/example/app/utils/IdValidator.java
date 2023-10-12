package org.example.app.utils;

public class IdValidator {

    // Регулярний вираз.
    // Можна лише цифри, цілі числа.
    private final static String ID_RGX = "[0-9]+";

    public static boolean isIdNotValid(String id) {
        return id.isEmpty() || !id.matches(ID_RGX) || id.equals("0");
    }
}
