package org.password_validator;

public class Length {
    private final int value;

    private Length(int value) {
        this.value = value;
    }

    public static Length lengthOf(int value) {
        return new Length(value);
    }

    public boolean isGreaterThan(Object object) {
        Length other = (Length) object;

        return this.value > other.value;
    }
}
