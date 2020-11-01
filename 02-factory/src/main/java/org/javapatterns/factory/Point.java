package org.javapatterns.factory;

public class Point {
    private double x;
    private double y;

    // private because need 2 different constructors cartesian and polar
    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // factory
    public static class Factory {
        // cartesian ctor
        public static Point CartesianCtor(double x, double y) {
            return new Point(x, y);
        }
        // polar ctor
        public static Point PolarCtor(double rho, double theta) {
            return new Point(rho*Math.cos(theta),
                    rho*Math.sin(theta));
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point p1 = Point.Factory.CartesianCtor(1,1);
        System.out.println("p1 "+ p1.toString());
        Point p2 = Point.Factory.PolarCtor(10, 3.14/2);
        System.out.println("p2 "+ p2.toString());
    }

}
