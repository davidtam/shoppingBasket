package DavidTam;

import org.junit.Test;

import static DavidTam.Item.LIME;
import static DavidTam.Item.MELON;
import static DavidTam.Offer.LIME_OFFER;
import static DavidTam.Offer.MELON_OFFER;
import static java.util.Arrays.asList;
import static java.util.Collections.nCopies;
import static org.junit.Assert.assertEquals;

public class OfferTest {

    @Test
    public void testOffersAreSetupCorrectly(){

        assertEquals("buy one get one free (MELON)", MELON_OFFER.getDescription());
        assertEquals(50, MELON_OFFER.getDiscount());
        assertEquals(1, MELON_OFFER.countDiscount(asList(MELON, MELON)));
        assertEquals(1, MELON_OFFER.countDiscount(nCopies(3, MELON)));
        assertEquals(2, MELON_OFFER.countDiscount(nCopies(4, MELON)));
        assertEquals(2, MELON_OFFER.countDiscount(nCopies(5, MELON)));

        assertEquals("three for the price two (LIME)", LIME_OFFER.getDescription());
        assertEquals(15, LIME_OFFER.getDiscount());
        assertEquals(0, LIME_OFFER.countDiscount(nCopies(2, LIME)));
        assertEquals(1, LIME_OFFER.countDiscount(nCopies(3, LIME)));
        assertEquals(2, LIME_OFFER.countDiscount(nCopies(6, LIME)));
        assertEquals(2, LIME_OFFER.countDiscount(nCopies(7, LIME)));

    }
}
