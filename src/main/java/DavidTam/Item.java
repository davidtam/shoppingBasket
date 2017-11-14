package DavidTam;

public enum Item {

    APPLE(35),
    BANANA(20),
    MELON(50),
    LIME(15);

    private int priceInPence;


    Item(int priceInPence) {
        this.priceInPence = priceInPence;
    }

    /**
     *
     * @return price in Pence
     */
    public int getPrice() {
        return priceInPence;
    }

}
