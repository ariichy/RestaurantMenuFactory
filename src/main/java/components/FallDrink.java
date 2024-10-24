
package components;

/**
 * This class is a concrete implementation of the {@code Drink} interface. It defines the Fall drink list.
 * @author Austin Richardson
 */
public class FallDrink implements Drink {

    /**
     * This method defines the specific drinks for the Fall menu.
     * @return a {@code String} of the Fall drinks.
     */
    public String toString() {
        return """
                Margarita
                Dark Rum
                Orange Juice""";
    }

}
