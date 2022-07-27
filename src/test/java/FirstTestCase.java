//import org.junit.annotations.Test;
import org.junit.jupiter.api.Test;

public class FirstTestCase {

    @Test
    void setUp(){
        System.out.println("Opening browser");
    }

    @Test
    void login() {
        System.out.println("Logging in");
    }

    @Test
    void teardown() {
        System.out.println("Closing Browser");
    }

}
