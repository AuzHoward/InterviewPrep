import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    void twoPlusFourShouldEqualSix(){

        //When
        int actual = cal.addTwoNumbers(2, 4);
        int expected = 6;

        //Then
        assertEquals(actual, expected);
    }

    @Test
    void sevenPlusOneOOneShouldEqualOne0Eight(){
        //when
        int actual = cal.addTwoNumbers(7, 101);
        int expected = 108;

        //Then
        assertEquals(actual, expected);
    }
}
