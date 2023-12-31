package org.password_validator;

import java.util.regex.Pattern;

import static org.password_validator.Length.lengthOf;

public class Password {

    private static final Length MINIMAL_LENGTH = lengthOf(8);

    public boolean isValid(String input) {
        return hasValidLength(input) && hasCapitalLetter(input) &&
                hasLowerCaseLetter(input) && hasNumber(input) && hasUnderscore(input);
    }

    private static boolean hasValidLength(String input) {
        Length inputLength = lengthOf(input.length());
        return inputLength.isGreaterThan(MINIMAL_LENGTH);
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
