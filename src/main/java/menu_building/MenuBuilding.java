
package menu_building;
import menus.*;

/**
 * The {@code MenuBuilding} class is an abstract base-class for creating
 * restaurant menus.
 *
 * This class defines {@code buildRestaurantMenu} as a template method for
 * creating a {@code RestaurantMenu}. The concrete subclasses are responsible
 * for implementing the logic for creating season-specific menus.
 *
 * @author Austin Richardson
 */

public abstract class MenuBuilding {

    /**
     * Creates a {@code RestaurantMenu} for a specified season.
     * This method must be implemented by subclasses to determine
     * seasonal menu logic
     *
     * @param season the season for the menu to be created.
     *
     * @return {@code RestaurantMenu} of the specified season.
     */
    protected abstract RestaurantMenu makeMenuBuilding(String season);

    /**
     * Builds a {@code RestaurantMenu} for the specified season. Uses
     * the {@code makeMenuBuilding} method to create a menu, then calls
     * the {@code populateMethod} from {@code RestaurantMenu} to populate
     * the menu with the corresponding seasons menu items.
     *
     * @param season the specified season for the menu to be built
     *
     * @return {@code RestaurantMenu} populated with the specified seasons
     * menu items.
     */
    public RestaurantMenu buildRestaurantMenu(String season) {
        RestaurantMenu theMenu = makeMenuBuilding(season);
        theMenu.populateMenu();
        return theMenu;
    }
    
}