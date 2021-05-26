import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SystemTest {
    @Test
    public void testSystem() {
        SystemCalculator systemCalculator = new SystemCalculator();
        Assertions.assertEquals(8.845299724367935, systemCalculator.calculate(-34.322, 0.0000000001), 0.0000000001);
        Assertions.assertEquals(81.66168111392545, systemCalculator.calculate(45.78, 0.0000000001), 0.0001);
    }
}
