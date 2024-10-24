package components;

/**
 * This class is a concrete implementation of the {@code Dessert} interface.
 * It defines the specific desserts for the Spring menu.
 * @author Austin Richardson
 */
public class SpringDessert implements Dessert {

    /**
     * This method defines a specific list of desserts for the Spring menu.
     * @return a {@code String} of Spring desserts.
     */
    @Override
    public String toString() {
       return """
                Vanilla Creme Brulee
                White Chocolate Brownie
                Passion Fruit Fig Tart""";
    }
    
}
