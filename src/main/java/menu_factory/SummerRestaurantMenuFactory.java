
package menu_factory;
import components.*;


/**
 * The {@code SummerRestaurantMenuFactory} class implements the {@code RestaurantMenuFactory} interface
 * to create seasonal menu items for a Summer-themed restaurant.
 * This factory is responsible for producing instances of various menu components
 * including drinks, main courses, entrees, and desserts that reflect Summer flavors and ingredients.
 *
 * <p>This class provides the following methods to create specific menu items:</p>
 * <ul>
 *     <li>{@link #createDrink()} - Creates a new instance of {@code SummerDrink}.</li>
 *     <li>{@link #createMainCourse()} - Creates a new instance of {@code SummerMainCourse}.</li>
 *     <li>{@link #createEntree()} - Creates a new instance of {@code SummerEntree}.</li>
 *     <li>{@link #createDessert()} - Creates a new instance of {@code SummerDessert}.</li>
 * </ul>
 *
 * @author Austin Richardson
 *
 * @see RestaurantMenuFactory
 * @see SummerDrink
 * @see SummerMainCourse
 * @see SummerEntree
 * @see SummerDessert
 *
 */
public class SummerRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates an instance of {@code Drink}
     * @return {@code SummerDrink}
     */
    @Override
    public Drink createDrink() {
        return new SummerDrink();
    }

    /**
     * Creates an instance of {@code MainCourse}
     * @return {@code SummerMainCourse}
     */
    @Override
    public MainCourse createMainCourse() {
         return new SummerMainCourse();
    }

    /**
     * Creates an instance of {@code Entree}
     * @return {@code SummerEntree}
     */
    @Override    
    public Entree createEntree() {
         return new SummerEntree();
    }

    /**
     * Creates an instance of {@code Dessert}
     * @return {@code SummerDessert}
     */
    @Override    
    public Dessert createDessert() {
        return new SummerDessert();
    }
    
}
