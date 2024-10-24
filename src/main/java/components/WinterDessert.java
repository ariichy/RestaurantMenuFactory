package components;

/**
 * This class is a concrete implementation of the {@code Dessert} interface.
 * It defines the specific dessert items for a Winter menu.
 * @author Austin Richardson
 */
public class WinterDessert implements Dessert {

    /**
     * This method defines the specific desserts for the Winter menu.
     * @return a {@code String} of Winter desserts.
     */
    @Override
    public String toString() {
        return """
                Chocolate Mousse
                Caramel Cheesecake
                Chocolate Sponge Cake""";
    }

}
