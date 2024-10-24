package components;

/**
 * This class is a concrete implementation of the {@code Dessert} interface.
 * It defines the Fall dessert list.
 * @author Austin Richardson
 */
public class FallDessert implements Dessert {

    /**
     * This method defines the specific Fall dessert items for the Fall menu.
     * @return a {@code String} of the Fall desserts.
     */
    @Override
    public String toString() {
        return """
                Carrot Cake
                White Chocolate Cheesecake
                Apple Pie""";
    }
}
