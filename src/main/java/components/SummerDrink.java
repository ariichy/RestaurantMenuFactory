package components;

/**
 * This class is a concrete implementation of the {@code Drink} interface.
 * It defines the specific drinks for the Summer menu.
 * @author Austin Richardson
 */
public class SummerDrink implements Drink {

    /**
     * This method defines the specific drinks for the Summer menu.
     * @return a {@code String} of Summer drinks.
     */
    @Override
    public String toString() {
        return """
                Lemonade
                Sangria
                Rum Punch""";
    }

}
