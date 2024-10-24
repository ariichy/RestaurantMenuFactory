package components;

/**
 * This class is a concrete implementation of the {@code Entree} interface.
 * It defines the specific entree's for the Spring menu.
 * @author Austin Richardson
 */
public class SpringEntree implements Entree {

    /**
     * This method defines the specific entree's for the Spring menu.
     * @return a {@code String} of Spring entree's.
     */
    @Override
    public String toString() {
        return """
                Lobster Veracruzana
                Organic Ocean Halibut
                Mushroom Soup""";
    }
    
}
