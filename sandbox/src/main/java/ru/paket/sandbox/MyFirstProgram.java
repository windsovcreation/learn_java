package ru.paket.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    System.out.println("Hello, world!");


    double xa = 2;
    double xb = -4;
    double ya = -5;
    double yb = 3;
    double a = xa - xb;
    double b = ya - yb;
    double p1 = a * a;
    double p2 = b * b;


    System.out.println("Расстояние между точками равно " + distance(p1, p2));
  }

  public static double distance(double p1, double p2) { return Math.sqrt(p1 + p2);

  }}