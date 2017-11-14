package DavidTam;

import java.util.List;

import static DavidTam.Item.LIME;
import static DavidTam.Item.MELON;
import static java.util.Collections.nCopies;

public enum Offer {

    MELON_OFFER(nCopies(2, MELON), 50, "buy one get one free (MELON)"),
    LIME_OFFER(nCopies(3, LIME), 15, "three for the price two (LIME)");

    private final List<Item> discountPattern;
    private final int discount;
    private final String description;

    Offer(List<Item> items, int discount, String description) {
        this.discountPattern = items;
        this.discount = discount;
        this.description = description;
    }

    public List<Item> getDiscountPattern() {
        return discountPattern;
    }

    public int getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }
}
