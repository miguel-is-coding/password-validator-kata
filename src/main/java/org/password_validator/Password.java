package org.password_validator;

public class Password {

    public Password() {
    }

    public boolean isValid(String input) {
        return hasValidLenght(input);
    }

    private static boolean hasValidLenght(String input) {
        return input.length() > 8;
    }
}
