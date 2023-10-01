package org.password_validator;

import java.util.regex.Pattern;

public class Password {

    public boolean isValid(String input) {
        return hasValidLength(input) && hasCapitalLetter(input) &&
                hasLowerCaseLetter(input) && hasNumber(input) && hasUnderscore(input);
    }

    private static boolean hasValidLength(String input) {
        return input.length() > 8;
    }

    private static boolean hasCapitalLetter(String input) {
        return Pattern.matches(".*[A-Z].*", input);
    }

    private static boolean hasLowerCaseLetter(String input) {
        return Pattern.matches(".*[a-z].*", input);
    }

    private static boolean hasNumber(String input) {
        return Pattern.matches(".*\\d.*", input);
    }

    private static boolean hasUnderscore(String input) {
        return Pattern.matches(".*_.*", input);
    }
}
