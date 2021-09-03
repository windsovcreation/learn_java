package ru.paket.sandbox;

public class Distancecheck {
    public static void main(String[] args) {
        Point p1 = new Point(2,-4);
        Point p2 = new Point(-5,3);

        System.out.println("Расстояние между точками равно " + Math.sqrt(p1.distance() + p2.distance()));
    }


}
