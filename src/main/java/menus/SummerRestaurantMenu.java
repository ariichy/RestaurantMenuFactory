/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * This class is responsible for populating the Summer Menu with relevant menu items.
 * It does this by using the {@code populateMenu()} method which it must implement
 * from the abstract class {@link RestaurantMenu}.
 * @author Austin Richardson
 */
public class SummerRestaurantMenu extends RestaurantMenu {
    
      RestaurantMenuFactory theFactory;

    /**
     * Constructor for {@code SummerRestaurant} that takes a {@link RestaurantMenuFactory} as
     * a parameter.
     * @param factory The {@code RestaurantMenuFactory} that determines which factory
     *                will be used.
     */
    public SummerRestaurantMenu(RestaurantMenuFactory factory) {
        setName("Summer Menu");
        this.theFactory = factory;
    }

    /**
     * Populates the Summer Menu with Summer specific items by using the
     * {@link RestaurantMenuFactory} which returns Summer objects such as {@code SummerEntree},
     * {@code SummerMainCourse}, {@code SummerDessert}, and {@code SummerDrink}.
     */
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
