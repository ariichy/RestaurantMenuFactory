
package menu_factory;
import components.*;

/**
 * The {@code SpringRestaurantMenuFactory} class implements the {@code RestaurantMenuFactory} interface
 * to create seasonal menu items for a Spring-themed restaurant.
 * This factory is responsible for producing instances of various menu components
 * including drinks, main courses, entrees, and desserts that reflect Spring flavors and ingredients.
 *
 * <p>This class provides the following methods to create specific menu items:</p>
 * <ul>
 *     <li>{@link #createDrink()} - Creates a new instance of {@code SpringDrink}.</li>
 *     <li>{@link #createMainCourse()} - Creates a new instance of {@code SpringMainCourse}.</li>
 *     <li>{@link #createEntree()} - Creates a new instance of {@code SpringEntree}.</li>
 *     <li>{@link #createDessert()} - Creates a new instance of {@code SpringDessert}.</li>
 * </ul>
 *
 * @see RestaurantMenuFactory
 * @see SpringDrink
 * @see SpringMainCourse
 * @see SpringEntree
 * @see SpringDessert
 *
 * @author Austin Richardson
 */
public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates an instance of {@code Drink}
     * @return {@code SpringDrink}
     */
    @Override
    public Drink createDrink() {
        return new SpringDrink();
    }

    /**
     * Creates an instance of {@code MainCourse}
     * @return {@code SpringMainCourse}
     */
    @Override
    public MainCourse createMainCourse() {
        return new SpringMainCourse();
    }

    /**
     * Creates an instance of {@code Entree}
     * @return {@code SpringEntree}
     */
    @Override    
    public Entree createEntree() {
        return new SpringEntree();
    }

    /**
     * Creates an instance of {@code Dessert}
     * @return {@code SpringDessert}
     */
    @Override    
    public Dessert createDessert() {
        return new SpringDessert();
    } 
}
