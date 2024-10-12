
package menu_building;
import menu_factory.*;
import menus.*;

/**
 * The {@code ConcreteMenuBuilding} class is a concrete implementation of the
 * {@code MenuBuilding} abstract class. This class is responsible for creating
 * seasonal restaurant menus based on the specified season.
 * This implementation generates menus for each season. Each menu is created
 * using the corresponding {@code RestaurantMenuFactory} and is populated with
 * a name and period specific to the season.
 *
 * @author Austin Richardson
 */
public class ConcreteMenuBuilding extends MenuBuilding {

    /**
     * Creates a {@RestaurantMenu} for the specified season.
     *
     * @param season is the season for the menu to be created.
     *
     * @return a {@code RestaurantMenu} object for the specified season.
     */
    @Override
    protected RestaurantMenu makeMenuBuilding(String season) {
        RestaurantMenu theMenu = null;
        if ("Fall".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new FallRestaurantMenuFactory();
            theMenu = new FallRestaurantMenu(theFactory);
            theMenu.setName("Fall Menu");
            theMenu.setPeriod("September 1 to November 30.");
        }
        else if ("Winter".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new WinterRestaurantMenuFactory();
            theMenu = new WinterRestaurantMenu(theFactory);
            theMenu.setName("Winter Menu"); 
            theMenu.setPeriod("December 1 to February 28.");
        }
        else if ("Spring".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new SpringRestaurantMenuFactory();
            theMenu = new SpringRestaurantMenu(theFactory);
            theMenu.setName("Spring Menu");
            theMenu.setPeriod("March 1 to May 30.");
        }
        else if ("Summer".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new SummerRestaurantMenuFactory();
            theMenu = new SummerRestaurantMenu(theFactory);
            theMenu.setName("Summer Menu");
            theMenu.setPeriod("June 1 to August 31");
        }
        return theMenu;
    }
    
}
