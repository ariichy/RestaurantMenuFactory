package components;

/**
 * This class is a concrete implementation of the {@code Drink} interface.
 * It defines the specific drinks for a Winter menu.
 * @author Austin Richardson
 */
public class WinterDrink implements Drink {

    /**
     * This method defines the specific drink list for a Winter menu.
     * @return a {@code String} of Winter drinks.
     */
    @Override
    public String toString() {
        return """
                Mojito
                Alcohol Free Wine
                Tequila""";
    }
    
}
