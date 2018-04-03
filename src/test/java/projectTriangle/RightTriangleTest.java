package projectTriangle;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class RightTriangleTest {
    private final double testA;
    private final double testB;
    private final double testC;
    private final boolean expected;

    public RightTriangleTest(final double testA, final double testB, final double testC, final boolean expected) {
        this.testA = testA;
        this.testB = testB;
        this.testC = testC;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static List<Object[]> isEmptyData() {
        return Arrays.asList(new Object [][]{
                {3, 4, 5, true},
                {3, 6, 5, false},
        });
    }
    @Test
    public void testRightTriangle(){
        Triangle triangle = new Triangle(testA,testB,testC);
        Assert.assertEquals(expected,triangle.rightTriangle());
    }
}
