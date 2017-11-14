package DavidTam;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {


    @Test
    public void testItemsAndPricesAreSetupCorrectly(){

        assertEquals(35, Item.valueOf("APPLE").getPrice());
        assertEquals(20, Item.valueOf("BANANA").getPrice());
        assertEquals(50, Item.valueOf("MELON").getPrice());
        assertEquals(15, Item.valueOf("LIME").getPrice());

    }

}
