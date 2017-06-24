package com.ds;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Boris on 20.6.17.
 */
public class MaxTest {

    private Max max = new Max();

    @Test
    public void testIntMax() {
        Max max = new Max();
        int m = max.intMax(1, 2, 3);
        Assert.assertEquals(3, m);
    }

    @Test
    public void testMaxSpan() {
        Max max = new Max();
        int[] span = {1, 2, 1, 1, 3};
        int m = max.maxSpan(span);
        Assert.assertEquals(4, m);
    }

}