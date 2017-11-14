package DavidTam;

import org.junit.Test;

import static DavidTam.BasketCalculator.calculate;
import static DavidTam.Item.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class BasketCalculatorTest {

    @Test
    public void calculateSomeBasketWithoutOffers(){

        assertEquals(130, calculate(asList(APPLE, APPLE, BANANA, BANANA, BANANA)));
        assertEquals(120, calculate(asList(APPLE, BANANA, MELON, LIME)));
        assertEquals(190, calculate(asList(APPLE, APPLE, BANANA, BANANA, MELON, LIME, LIME)));

    }

}
