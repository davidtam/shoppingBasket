package DavidTam;

import java.util.List;

public class BasketCalculator {


    public static int calculate(List<Item> basket) {
        return basket.stream().mapToInt(Item::getPrice).sum();
    }
}
