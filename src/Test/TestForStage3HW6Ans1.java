package Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestForStage3HW6Ans1 {

    private Stage3hw6 dz;

    @Before
    public void prepare() {
        dz = new Stage3hw6();
    }

    @Test(expected = RuntimeException.class)
    public void testStage3hw6EmptyArray() {
        dz.ans1(new int[0]);
    }

    @Test(expected = RuntimeException.class)
    public void testStage3hw6No4() {
        dz.ans1(new int[]{1, 3, 3});
    }

    @Test
    public void testStage3hw6_4NotLast() {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(new int[]{5, 6, 7}, dz.ans1(data));
    }
}
