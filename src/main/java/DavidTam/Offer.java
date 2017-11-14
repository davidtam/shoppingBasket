package DavidTam;

import java.util.List;
import java.util.function.Function;

import static DavidTam.Item.LIME;
import static DavidTam.Item.MELON;

public enum Offer {

    MELON_OFFER("buy one get one free (MELON)", 50,
            basket -> basket.stream().filter(i -> MELON == i).count() / 2),
    LIME_OFFER("three for the price two (LIME)", 15,
            basket -> basket.stream().filter(i -> LIME == i).count() / 3);

    /**
     * a function that calculate how many time this discount can apply to the given basket
     */
    private final Function<List<Item>, Long> getApplicableDiscount;

    /**
     * the amount saves in pence each time this discount is applied
     */
    private final long discount;

    /**
     * a short description of this discount
     */
    private final String description;

    Offer(String description, int discount, Function<List<Item>, Long> getApplicableDiscount) {
        this.getApplicableDiscount = getApplicableDiscount;
        this.discount = discount;
        this.description = description;
    }

    public long countDiscount(List<Item> basket) {
        return getApplicableDiscount.apply(basket);
    }

    public long getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }
}
