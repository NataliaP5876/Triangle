package projectTriangle;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Vol4onka on 03.04.2018.
 */
public class TriangleTest {
    @Test
    public void testConstructorDefault(){
        Triangle triangle = new Triangle();
        assertNotNull(triangle);
    }

    @Test
    public void testConstructorCorrectParam(){
        Triangle triangle = new Triangle(6,8,7);
        assertNotNull(triangle);
    }

    @Test
    public void testConstructorCopy(){
        Triangle triangle = new Triangle(5,6,7);
        Triangle triangle1Copy = new Triangle(triangle);
        assertEquals(triangle,triangle1Copy);
    }

    @Test
    public void testToString(){
        Triangle triangle = new Triangle(5,6,7);
        String strTriangle = triangle.toString();
        assertEquals("a = 5.0, b = 6.0, c = 7.0",strTriangle);
    }


}


