package components;

/**
 * This class is a concrete implementation of the {@code MainCourse} interface.
 * It defines the specific main courses for the Spring menu.
 * @author Austin Richardson
 */
public class SpringMainCourse implements MainCourse {

    /**
     * This method defines the specific main courses for the Spring menu.
     * @return a {@code String} of Spring main courses.
     */
   @Override
    public String toString() {
       return """
               Sunny Rise Burger
               California Spring Salad
               Crispy Chicken Sandwich""";
   }
    
}
