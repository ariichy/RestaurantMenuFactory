
package menu_factory;
import components.*;

/**
 * The {@code FallRestaurantMenuFactory} class implements the {@code RestaurantMenuFactory} interface
 * to create seasonal menu items for a Fall-themed restaurant.
 * This factory is responsible for producing instances of various menu components
 * including drinks, main courses, entrees, and desserts that reflect Fall flavors and ingredients.
 *
 * <p>This class provides the following methods to create specific menu items:</p>
 * <ul>
 *     <li>{@link #createDrink()} - Creates a new instance of {@code FallDrink}.</li>
 *     <li>{@link #createMainCourse()} - Creates a new instance of {@code FallMainCourse}.</li>
 *     <li>{@link #createEntree()} - Creates a new instance of {@code FallEntree}.</li>
 *     <li>{@link #createDessert()} - Creates a new instance of {@code FallDessert}.</li>
 * </ul>
 *
 * @see RestaurantMenuFactory
 * @see FallDrink
 * @see FallMainCourse
 * @see FallEntree
 * @see FallDessert
 *
 * @author Austin Richardson
 */
public class FallRestaurantMenuFactory implements RestaurantMenuFactory {


    /**
     * Creates a new instance of {@code Drink}
     * @return {@code FallDrink}
     */
    @Override
    public Drink createDrink() {
        return new FallDrink();
    }

    /**
     * Creates a new instance of {@code MainCourse}
     * @return {@code FallMainCourse}
     */
    @Override
    public MainCourse createMainCourse() {
        return new FallMainCourse();
    }

    /**
     * Creates a new instance of {@code Entree}
     * @return {@code FallEntree}
     */
    @Override
    public Entree createEntree() {
        return new FallEntree();
    }

    /**
     * Creates a new instance of {@code Dessert}
     * @return {@code FallDessert}
     */
    @Override
    public Dessert createDessert() {
        return new FallDessert();
    }
}
