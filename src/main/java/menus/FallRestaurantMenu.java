
package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * This class is responsible for populating the Fall Menu with relevant menu items.
 * It does this by using the {@code populateMenu()} method which it must implement
 * from the abstract class {@link RestaurantMenu}.
 * @author Austin Richardson
 */
public class FallRestaurantMenu extends RestaurantMenu {
    
    RestaurantMenuFactory theFactory;

    /**
     * Constructor for {@code FallRestaurant} that takes a {@link RestaurantMenuFactory} as
     * a parameter.
     * @param factory The {@code RestaurantMenuFactory} that determines which factory
     *                will be used.
     */
    public FallRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }

    /**
     * Populates the Fall Menu with Fall specific items by using the
     * {@link RestaurantMenuFactory} which returns Fall objects such as {@code FallEntree},
     * {@code FallMainCourse}, {@code FallDessert}, and {@code FallDrink}.
     */
    @Override
    public void populateMenu() {
        System.out.println("Adding items to " + getName());

        entree = theFactory.createEntree();
        mainCourse = theFactory.createMainCourse();
        dessert = theFactory.createDessert();
        drink = theFactory.createDrink();

    }
}
