import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class UpperCaseCounterTest {

    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    @Test
    private void nullCheck() {
        String str = null;
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
    }

    @Test
    public void isEmpty() {
        String str = "";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
    }

    @Test
    public void up() {
        String str = "ABC";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("Result : " + result);
        assertTrue(result == 3);
        assertFalse(result == 2);
    }

    @Test
    public void updown() {
        String str = "ABCuwhankfjTDET";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("Result : " + result);
        assertTrue(result == 7);
        assertFalse(result == 8);
    }

}