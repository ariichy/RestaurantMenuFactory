/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * This class is responsible for populating the Winter Menu with relevant menu items.
 * It does this by using the {@code populateMenu()} method which it must implement
 * from the abstract class {@link RestaurantMenu}.
 * @author Austin Richardson
 */
public class WinterRestaurantMenu extends RestaurantMenu {
    
    RestaurantMenuFactory theFactory;

    /**
     * Constructor for {@code WinterRestaurant} that takes a {@link RestaurantMenuFactory} as
     * a parameter.
     * @param factory The {@code RestaurantMenuFactory} that determines which factory
     *                will be used.
     */
    public WinterRestaurantMenu(RestaurantMenuFactory factory) {
        setName("Winter Menu");
        this.theFactory = factory;
    }

    /**
     * Populates the Winter Menu with Winter specific items by using the
     * {@link RestaurantMenuFactory} which returns Winter objects such as {@code WinterEntree},
     * {@code WinterMainCourse}, {@code WinterDessert}, and {@code WinterDrink}.
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
