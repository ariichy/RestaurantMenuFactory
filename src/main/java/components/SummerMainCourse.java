package components;

/**
 * This class is a concrete implementation of the {@code MainCourse} interface.
 * It defines the specific main courses for the Summer menu.
 * @author Austin Richardson
 */
public class SummerMainCourse implements MainCourse {

    /**
     * This method defines the specific list of main courses for the Summer menu.
     * @return a {@code String} of Summer main courses.
     */
    @Override
    public String toString() {
        return """
                Beef Tartare
                Spiced Cauliflower
                Chinook Salmon""";
    }

}
