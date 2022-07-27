import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaScenarioSolutionsTest {

    JavaScenarioSolutions jss = new JavaScenarioSolutions();

    @Test
    void sevenFiveSevenShouldBePalindrome(){
        boolean actual = jss.isIntegerPalindrome(757);
        boolean expected = true;

        assertEquals(actual, expected);
    }
}
