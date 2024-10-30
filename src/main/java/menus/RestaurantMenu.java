
package menus;
import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 *
 * @author gouraya
 */
public abstract class RestaurantMenu {
    
    private String name; // Menu name
    private String period; // Period during which the menu is active
    
    // Newly defined objects that represent the menu items.
    protected Entree entree;
    protected MainCourse mainCourse;
    protected Dessert dessert;
    protected Drink drink;
    
    
    public String getName() {
        // Add the required code here
        return name;
       // return null;
    }
    
    public void setName(String name) {
        // Add the required code here
        this.name = name;
    }
    
    public String getPeriod() {
        // Add the required code here
        return period;
        //return null;
    }
    
    public void setPeriod(String p) {
        // Add the required code here
        this.period = p;
    }
    
    public abstract void populateMenu();
    
    // 
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
