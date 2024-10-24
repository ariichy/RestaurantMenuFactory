package components;

/**
 * This class is a concrete implementation of the {@code Entree} interface.
 * It defines the specific entree's for the Fall menu.
 * @author Austin Richardson
 */
public class FallEntree implements Entree {

    /**
     * This method returns a specific list entree's for the Fall menu.
     * @return a {@code String} of Fall entree's.
     */
    @Override
    public String toString() {
        return """
                Spinach and Atrichoke Dip
                Sesame Soy Tuna Tartare
                Tuscan Bruschetta""";
    }

}
