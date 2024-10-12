/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        // Add the required code here
        return new SpringDrink();
       // return null;
    }

    /**
     * Creates an instance of {@code MainCourse}
     * @return {@code SpringMainCourse}
     */
    @Override
    public MainCourse createMainCourse() {
        // Add the required code here
        return new SpringMainCourse();
        // return null;
    }

    /**
     * Creates an instance of {@code Entree}
     * @return {@code SpringEntree}
     */
    @Override    
    public Entree createEntree() {
        // Add the required code here
        return new SpringEntree();
        // return null;
    }

    /**
     * Creates an instance of {@code Dessert}
     * @return {@code SpringDessert}
     */
    @Override    
    public Dessert createDessert() {
        // Add the required code here
        return new SpringDessert();
        //return null;
    } 
}
