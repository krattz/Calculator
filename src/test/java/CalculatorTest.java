import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void addit()
    {
       assertEquals(Calculator.add(1,2), 3);
    }

    @Test
    public void product()
    {
        assertEquals(Calculator.multiply(3,4), 12);
    }
}
