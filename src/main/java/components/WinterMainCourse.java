
package components;

/**
 * This class is a concrete implementation of the {@code MainCourse} interface.
 * It defines the specific main courses for a Winter menu.
 * @author Austin Richardson
 */
public class WinterMainCourse implements MainCourse {

    /**
     * This method defines the specific main courses for the Winter menu.
     * @return a {@code String} of Winter main courses.
     */
    @Override
    public String toString() {
        return """
                Sirloin
                Salmon Croquettes
                Steak and Fries""";
    }
 
}
