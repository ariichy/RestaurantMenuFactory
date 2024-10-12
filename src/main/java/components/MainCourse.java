
package components;

/**
 * This {@code MainCourse} interface defines the contract for creating a main course.
 * Classes that implement this interface should provide concrete implementations
 * for creating specific main courses.
 *
 * @author Austin Richardson
 */
public interface MainCourse {

    /**
     * Returns a string representing the main course(s).
     * @return a {@code String} description of the main course(s).
     */
    @Override
    public String toString();  
}
