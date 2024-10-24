package components;

/**
 * This class is a concrete implementation of the {@code MainCourse} interface.
 * It defines the specific main courses for the Fall menu.
 * @author Austin Richardson
 */
public class FallMainCourse implements MainCourse{

    /**
     * This method defines the specific main courses for the Fall menu.
     * @return a {@code String} of Fall main courses.
     */
    @Override
    public String toString() {
        return """
                Salmon Avocado Toast
                Pesto Chicken Penne Asiago
                Protobello Mushroom Chicken""";
    }
}
