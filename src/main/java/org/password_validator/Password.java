package org.password_validator;

public class Password {

    public Password() {
    }

    public boolean isValid(String input) {
        return hasValidLength(input);
    }

    private static boolean hasValidLength(String input) {
        return input.length() > 8;
    }
}
