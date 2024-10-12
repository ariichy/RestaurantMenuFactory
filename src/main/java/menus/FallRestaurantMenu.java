
package menus;

import menu_factory.RestaurantMenuFactory;

/**
 *
 * @author gouraya
 */
public class FallRestaurantMenu extends RestaurantMenu {
    
    RestaurantMenuFactory theFactory;

    public FallRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }


    @Override
    public void populateMenu() {
        System.out.println("Adding items to " + getName());

        // Insert code to assign menu items created
        entree = theFactory.createEntree();
        mainCourse = theFactory.createMainCourse();
        dessert = theFactory.createDessert();
        drink = theFactory.createDrink();

    }
}
