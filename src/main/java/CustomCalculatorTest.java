import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator = new CustomCalculator();

    @Test
    public void addCheck() {
        int result = customCalculator.add(3, 4);
        assertTrue(result == 7);
    }

    @Test
    public void subCheck() {
        int result = customCalculator.subtract(10, 8);
        assertTrue(result == 2);
    }
}