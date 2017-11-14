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

    @Test
    public void calculateWithMelonDiscount(){

        assertEquals(50, calculate(asList(MELON, MELON)));
        assertEquals(105, calculate(asList(MELON, MELON, APPLE, BANANA)));
        assertEquals(135, calculate(asList(MELON, MELON, APPLE, BANANA, LIME, LIME)));
        assertEquals(185, calculate(asList(MELON, MELON, MELON, APPLE, BANANA, LIME, LIME)));
        assertEquals(185, calculate(asList(MELON, MELON, MELON, MELON, APPLE, BANANA, LIME, LIME)));

    }

    @Test
    public void calculateWithLimeDiscount(){

        assertEquals(30, calculate(asList(LIME, LIME)));
        assertEquals(30, calculate(asList(LIME, LIME, LIME)));
        assertEquals(85, calculate(asList(LIME, LIME, LIME, APPLE, BANANA)));
        assertEquals(135, calculate(asList(LIME, LIME, LIME, APPLE, BANANA, MELON)));

    }

    @Test
    public void calculateAMixtureOfBaskets(){

        assertEquals(115, calculate(asList(LIME, LIME, LIME, MELON, APPLE, MELON)));
        assertEquals(220, calculate(asList(LIME, MELON, LIME, LIME, LIME, MELON, APPLE, MELON, BANANA, BANANA)));

    }

}
