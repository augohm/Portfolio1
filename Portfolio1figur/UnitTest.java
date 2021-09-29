import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UnitTest {
    
//RECTANGLE TEST
    @Test
    public void testRectangleArea() {
        Rectangle rectangleTest = new Rectangle(1, 1, 3, 3, 5, 5);

        // double expected, double actual, double delta
        assertEquals(4, rectangleTest.area(), 0);
       
    }
}