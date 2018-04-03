package projectTriangle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class CreateIllegalTriangleTest {
    private final double testA;
    private final double testB;
    private final double testC;

    public CreateIllegalTriangleTest(final double testA, final double testB, final double testC) {
        this.testA = testA;
        this.testB = testB;
        this.testC = testC;
    }
    @Parameterized.Parameters
    public static List<Object[]> isEmptyData() {
        return Arrays.asList(new Object [][]{
                {1, 1, 4},
                {0, 0, 0},
                {2, 4, 2},
        });
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorParam2(){
        Triangle triangle = new Triangle(testA,testB,testC);
    }
}

