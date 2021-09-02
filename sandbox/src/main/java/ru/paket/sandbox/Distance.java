package ru.paket.sandbox;

public class Distance {
    public static void main(String[] args) {
        Point p1 = new Point(2, -4);


        Point p2 = new Point(-5,3);

        System.out.println("Расстояние между точками равно " + distance(p1, p2));
    }

    public static double distance(Point p1, Point p2) {


        double a = p1.a - p1.b;
        double b = p2.a - p2.b;



        return Math.sqrt((a) * (a) + (b) * (b));



    }
}
