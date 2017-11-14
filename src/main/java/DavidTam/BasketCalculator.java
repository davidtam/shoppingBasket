package DavidTam;

import java.util.EnumSet;
import java.util.List;

public class BasketCalculator {

    public static long calculate(List<Item> basket) {
        // gross amount - total applicable discount
        return basket.stream().
                mapToLong(Item::getPrice).sum() -
                EnumSet.allOf(Offer.class).stream()
                        .mapToLong(offer -> offer.countDiscount(basket) * offer.getDiscount()).sum();
    }
}
