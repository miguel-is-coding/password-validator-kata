package org.password_validator;

import java.util.regex.Pattern;

public class Password {

    public Password() {
    }

    public boolean isValid(String input) {
        return hasCapitalLetter(input) && hasValidLength(input) && hasLowerCaseLetter(input);
    }

    private static boolean hasLowerCaseLetter(String input) {
        return Pattern.matches(".*[a-z].*", input);
    }

    private static boolean hasCapitalLetter(String input) {
        return Pattern.matches(".*[A-Z].*", input);
    }

    private static boolean hasValidLength(String input) {
        return input.length() > 8;
    }
}
