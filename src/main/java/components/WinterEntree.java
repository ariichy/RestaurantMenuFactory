package components;

/**
 * This class is a concrete implementation of the {@code Entree} interface.
 * It defines the specific entree's for a Winter menu.
 * @author Austin Richardson
 */
public class WinterEntree implements Entree {

    /**
     * This method defines the specific entree's for the Winter menu.
     * @return a {@code String} of Winter entree's.
     */
    @Override
    public String toString() {
        return """
                Sesame Soy Tartare
                Boston Clam Chowder
                Thai Soup""";
    }

}
