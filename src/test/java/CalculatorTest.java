import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void hasAdd() { assertEquals(2, calculator.add(1, 1));}
    @Test
    public void hasSub() { assertEquals(1, calculator.sub(4, 3));}
    @Test
    public void hasMult() { assertEquals(16, calculator.mult(4, 4));}
    @Test
    public void hasDiv() { assertEquals(4.0, calculator.div(20, 5));}
}
