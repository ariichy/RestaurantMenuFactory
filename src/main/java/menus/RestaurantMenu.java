
package menus;
import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * This clas is responsible for setting the contract that all subclasses must fulfill.
 * Including an abstract method {@code populateMenu}, and a {@code toString()} that
 * formats the console output of each menu that uses it.
 * @author Austin Richardson
 */
public abstract class RestaurantMenu {
    
    private String name; // Menu name
    private String period; // Period during which the menu is active
    
    // Newly defined objects that represent the menu items.
    protected Entree entree;
    protected MainCourse mainCourse;
    protected Dessert dessert;
    protected Drink drink;
    
    /*
    Getters and Setters
     */
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPeriod() {
        return period;
    }
    
    public void setPeriod(String p) {
        this.period = p;
    }
    
    public abstract void populateMenu();

    // Returns the menu contents
    @Override
    public String toString() {
        return """
                
                %s
                Active: %s
                
                Entrees:
                %s
                
                Main Courses:
                %s
                
                Desserts:
                %s
                
                Drinks:
                %s
                """.formatted(getName(), getPeriod(), entree, mainCourse, dessert, drink);
    }

}
