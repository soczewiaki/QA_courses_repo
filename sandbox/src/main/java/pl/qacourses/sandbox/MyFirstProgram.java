package pl.qacourses.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("Anna");
        hello("user");

        Square s = new Square(5);
        System.out.println("powierzchnia kwadratu o boku " +  s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("powierzchnia prostokąta o bokach " +  r.a + " i " +  r.b  + " = " + r.area());


        Point p = new Point (31, 18, 2000, 32);
        System.out.println("odległość między punktami o parametrach podanych powyżej to" + " " + p.distance());

    }
public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");

}

public static double area(Square s){
    return s.l * s.l;
}

public static double area(Rectangle r) {
        return r.a * r.b;
}


}