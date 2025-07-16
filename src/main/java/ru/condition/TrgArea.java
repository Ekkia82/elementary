package ru.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double first = p - a;
        double second = p - b;
        double third = p - c;
        double rsl = first * second * third * p;
        double four = Math.sqrt(rsl);

        return four;
    }

    public static void main(String[] args) {
        double four = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + four);
    }
}

