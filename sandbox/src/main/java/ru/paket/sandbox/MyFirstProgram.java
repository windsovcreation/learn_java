package ru.paket.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    System.out.println("Hello, world!");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

  }

  }