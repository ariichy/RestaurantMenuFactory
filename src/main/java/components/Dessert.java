
package components;

/**
 * This {@code Dessert} interface defines the contract for creating a dessert.
 * Classes that implement this interface should provide concrete implementations
 * for creating specific desserts.
 *
 * @author Austin Richardson
 */
public interface Dessert {

    /**
     * Returns a string representing the dessert(s).
     * @return a {@code String} description of the dessert(s).
     */
    @Override
    public String toString();
}
