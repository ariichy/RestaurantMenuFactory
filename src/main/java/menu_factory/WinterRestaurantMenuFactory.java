
package menu_factory;
import components.*;

/**
 * The {@code WinterRestaurantMenuFactory} class implements the {@code RestaurantMenuFactory} interface
 * to create seasonal menu items for a Winter-themed restaurant.
 * This factory is responsible for producing instances of various menu components
 * including drinks, main courses, entrees, and desserts that reflect Winter flavors and ingredients.
 *
 * <p>This class provides the following methods to create specific menu items:</p>
 * <ul>
 *     <li>{@link #createDrink()} - Creates a new instance of {@code WinterDrink}.</li>
 *     <li>{@link #createMainCourse()} - Creates a new instance of {@code WinterMainCourse}.</li>
 *     <li>{@link #createEntree()} - Creates a new instance of {@code WinterEntree}.</li>
 *     <li>{@link #createDessert()} - Creates a new instance of {@code WinterDessert}.</li>
 * </ul>
 *
 * @author Austin Richardson
 *
 * @see RestaurantMenuFactory
 * @see WinterDrink
 * @see WinterMainCourse
 * @see WinterEntree
 * @see WinterDessert
 *
 */
public class WinterRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates an instance of {@code Drink}
     * @return {@code WinterDrink}
     */
    @Override
    public Drink createDrink() {
        return new WinterDrink();
    }

    /**
     * Creates an instance of {@code MainCourse}
     * @return {@code WinterMainCourse}
     */
    @Override
    public MainCourse createMainCourse() {
         return new WinterMainCourse();
    }

    /**
     * Creates an instance of {@code Entree}
     * @return {@code WinterEntree}
     */
    @Override    
    public Entree createEntree() {
         return new WinterEntree();
    }

    /**
     * Creates an instance of {@code Dessert}
     * @return {@code WinterDessert}
     */
    @Override    
    public Dessert createDessert() {
        return new WinterDessert();
    }   
    
}
