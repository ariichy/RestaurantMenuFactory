package components;

/**
 * This class is a concrete implementation of the {@code Drink} interface.
 * It defines the specific drinks for the Spring menu.
 * @author Austin Richardson
 */
public class SpringDrink implements Drink  {

    /**
     * This method defines the specific drinks for the Spring menu.
     * @return a {@code String} of Spring drinks.
     */
    @Override
    public String toString() {
        return """
                Cucumber Smash
                Lime Juice
                Candy Apple Cider""";
    }

}
