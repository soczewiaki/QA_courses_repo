package pl.qacourses.sandbox;

public class Point {


private double[] p1 = new double[2];
private double[] p2 = new double[2];

 public Point (double x, double y, double a, double b) {
p1[0] = x;
p1[1] = y;
p2[0] = a;
p2[1] = b;

 }
public double distance() {
double dx;
double dy;
 dx = p2[0] - p1[0];
 dy = p2[1] - p1[1];
  return Math.sqrt((dx * dx) + (dy * dy));
   }
}
