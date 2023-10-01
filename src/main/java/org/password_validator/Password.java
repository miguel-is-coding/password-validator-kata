package org.password_validator;

import java.util.regex.Pattern;

public class Password {

    public Password() {
    }

    public boolean isValid(String input) {
        return hasCapitalLetter(input) && hasValidLength(input);
    }

    private static boolean hasCapitalLetter(String input) {
        return Pattern.matches(".*[A-Z].*", input);
    }

    private static boolean hasValidLength(String input) {
        return input.length() > 8;
    }
}
