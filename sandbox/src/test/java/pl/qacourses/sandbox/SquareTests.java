package pl.qacourses.sandbox;

public class SquareTests {
    @Test
    public void test(){

    }

    public void testArea() {
        Square s = new Square(5);
        assert s.area() == 25;
    }
}
