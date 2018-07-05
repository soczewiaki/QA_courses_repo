package pl.qacourses.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;
import pl.qacourses.sandbox.Point;

public class PointTests {
    @Test
    public void testArea() {
        Point p = new Point(0, 1, 0, 3);
        Assert.assertEquals(p.distance(),2.0 );
    }

}
