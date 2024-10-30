
package menus_main;
import menu_building.*;
import menus.*;

/**
 * This class is the driver class for the program. It instantiates objects and prints their
 * toString()'s to the console to display the information of each menu.
 * @author Austin Richardson
 */
public class MenuFactoryTest {

        /**
         * The main method that drives the entire program.
         * @param args
         */
        public static void main(String[] args) {

        /*
        Instantiates a FallMenu, WinterMenu, SpringMenu, and SummerMenu.
        Using the factory to pass the correct objects to each menu
         */
        MenuBuilding theBuilding = new ConcreteMenuBuilding();
        
        RestaurantMenu theFallMenu = theBuilding.buildRestaurantMenu("Fall"); 
        System.out.println(theFallMenu);
        
        RestaurantMenu theWinterMenu = theBuilding.buildRestaurantMenu("Winter");
        System.out.println(theWinterMenu);

        RestaurantMenu theSpringMenu = theBuilding.buildRestaurantMenu("Spring");
        System.out.println(theSpringMenu );

        RestaurantMenu theSummerMenu = theBuilding.buildRestaurantMenu("Summer");
        System.out.println(theSummerMenu);
        
    }    
}
