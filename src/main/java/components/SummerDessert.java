package components;

/**
 * This class is a concrete implementation of the {@code Dessert} interface.
 * It defines the specific desserts for the Summer menu.
 * @author Austin Richardson
 */
public class SummerDessert implements Dessert {

    /**
     * This method defines the specific list of dessert items for the Summer menu.
     * @return a {@code String} of Summer desserts.
     */
    @Override
    public String toString() {
        return """
                Lime Pie
                Ultimate Cookie
                Churro Ice Cream Sandwich""";
    }
}
