package ru.paket.sandbox;

public class Distance {
    public static void main(String[] args) {
        Point p1 = new Point(2,-5);
        Point p2 = new Point(-4,3);

        System.out.println("Расстояние между точками равно " + p1.distance(p2));

    }


}
