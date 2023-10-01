package unit;

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
}
