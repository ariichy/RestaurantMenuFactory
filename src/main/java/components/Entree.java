
package components;

/**
 * This {@code Entree} interface defines the contract for creating an entree.
 * Classes that implement this interface should provide concrete implementations
 * for creating specific entrees.
 *
 * @author Austin Richardson
 */
public interface Entree {

    /**
     * Returns a string representing the entree(s).
     * @return a {@code String} description of the entree(s).
     */
    @Override
    public String toString();
    
}
