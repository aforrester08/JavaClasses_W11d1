import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void doesDrink() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }
    @Test
    public void doesEmpty() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }
    @Test
    public void doesFill() {
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }


}
