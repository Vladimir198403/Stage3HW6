package Test;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestForStage3HW6Ans2 {

    private Stage3hw6 dz;

    @Before
    public void prepare() {
        dz = new Stage3hw6();
    }

    @Test
    public void testStage3hw6ans2_AmptyArray() {
        Assert.assertThat(dz.ans2(new int[]{}), Is.is(false));
    }

    @Test
    public void testStage3hw6ans2Only1And4() {
        Assert.assertThat(dz.ans2(new int[]{1, 4, 4, 1}), Is.is(true));
    }

    @Test
    public void testStage3hw6ans2Only1And4AndOthers() {
        Assert.assertThat(dz.ans2(new int[]{1, 4, 3, 1}), Is.is(false));
    }

    @Test
    public void testStage3hw6ans2ONo1And4() {
        Assert.assertThat(dz.ans2(new int[]{2, 3, 5}), Is.is(false));
    }
}
