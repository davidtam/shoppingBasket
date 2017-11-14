package DavidTam;

import org.junit.Test;

import static DavidTam.Item.LIME;
import static DavidTam.Item.MELON;
import static DavidTam.Offer.LIME_OFFER;
import static DavidTam.Offer.MELON_OFFER;
import static java.util.Arrays.asList;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class OfferTest {

    @Test
    public void testOffersAreSetupCorrectly(){

        assertEquals("buy one get one free (MELON)", MELON_OFFER.getDescription());
        assertEquals(50, MELON_OFFER.getDiscount());
        assertThat(MELON_OFFER.getDiscountPattern(), equalTo(asList(MELON, MELON)));

        assertEquals("three for the price two (LIME)", LIME_OFFER.getDescription());
        assertEquals(15, LIME_OFFER.getDiscount());
        assertThat(LIME_OFFER.getDiscountPattern(), equalTo(asList(LIME, LIME, LIME)));

    }
}
