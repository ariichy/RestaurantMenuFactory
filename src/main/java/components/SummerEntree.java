package components;

/**
 * This class is a concrete implementation of the {@code Entree} interface.
 * It defines the specific list of entree's for the Summer menu.
 * @author Austin Richardson
 */
public class SummerEntree implements Entree {

    /**
     * This method defines the specific entree's for the Summer menu.
     * @return a {@code String} of Summer entree's.
     */
    @Override
    public String toString() {
        return """
                Avocado Scramble
                Little Gem Salad
                Miso Cauliflower Soup""";
    }
    
}
