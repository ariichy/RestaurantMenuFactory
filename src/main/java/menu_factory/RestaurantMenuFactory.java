package menu_factory;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * This {@code RestaurantMenuFactory} specifies the contract for
 * creating the components for a menu. Classes that implement this
 * interface should provide concrete implementations for creating
 * specific menu items.
 *
 * @author Austin Richardson
 */
public interface RestaurantMenuFactory {

    /**
     * Creates a {@code Drink}
     * @return a new {@code Drink} object
     */
    public Drink createDrink();

    /**
     * Creates a {@code MainCourse}
     * @return a new {@code MainCourse} object
     */
    public MainCourse createMainCourse();

    /**
     * Creates an {@Entree}
     * @return a new {@code Entree} object
     */
    public Entree createEntree();

    /**
     * Creates a {@code Dessert}
     * @return a new {@code Dessert} object
     */
    public Dessert createDessert();
    
}
