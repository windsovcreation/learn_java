package ru.paket.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance() {

        Point p1 = new Point(2,-5);
        Point p2 = new Point(-4,3);
        Assert.assertEquals(p1.distance(p2),10.0);

    }
}
