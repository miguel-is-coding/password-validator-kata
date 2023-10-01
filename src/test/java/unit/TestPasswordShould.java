package unit;

import org.junit.Assert;
import org.password_validator.Password;
import org.junit.Test;

public class TestPasswordShould {
    /**
     * A valid password should meet the following requirements:
     *     Have more than 8 characters
     *     Contains a capital letter
     *     Contains a lowercase
     *     Contains a number
     *     Contains an underscore
     */
    @Test
    public void meet_all_the_validations() {
        String input = "Password1_";
        Password password = new Password();

        assert (password.isValid(input));
    }

    @Test
    public void be_invalid_when_has_less_than_eight_characters() {
        String input = "Pass1_";
        Password password = new Password();

        Assert.assertFalse(password.isValid(input));
    }

    @Test
    public void be_invalid_when_does_not_contain_a_capital_letter() {
        String input = "password1_";
        Password password = new Password();

        Assert.assertFalse(password.isValid(input));
    }
}
