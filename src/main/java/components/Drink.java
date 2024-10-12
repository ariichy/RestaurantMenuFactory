
package components;

/**
 * This {@code Drink} interface defines the contract for creating a drink.
 * Classes that implement this interface should provide concrete implementations
 * for creating specific drinks.
 *
 * @author Austin Richardson
 */
public interface Drink {

    /**
     * Returns a string representing the drink(s).
     * @return a {@code String} description of the drink(s).
     */
    @Override
    public String toString();

}
