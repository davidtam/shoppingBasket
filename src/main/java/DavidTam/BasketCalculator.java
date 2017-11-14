package DavidTam;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;
import static java.util.Arrays.asList;

public class BasketCalculator {

    public static long calculate(List<Item> basket) {
        // gross amount - total applicable discount
        return basket.stream().
                mapToLong(Item::getPrice).sum() -
                EnumSet.allOf(Offer.class).stream()
                        .mapToLong(offer -> offer.countDiscount(basket) * offer.getDiscount()).sum();
    }

    public static void main(String args[]){

        if (args.length != 1){
            System.out.println("Usage:");
            System.out.println("Usage:java DavidTam.BasketCalculator \"APPLE, BANANA\"");
            System.out.println("Usage:");
        } else {
            long totalCost = calculate(asList(args[0].split(",")).stream()
                    .map(str -> str.trim().toUpperCase()).map(name -> Item.valueOf(name)).collect(Collectors.toList()));
            System.out.println(format("Basket of \"%s\" cost %d pence", args[0], totalCost));

        }
    }

}
