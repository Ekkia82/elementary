package ru.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double first = (p - a) * (p - b) * (p - c);
        double second = Math.sqrt(first);

        return second;
    }

    public static void main(String[] args) {
        double four = TrgArea.area(2, 2, 2);
        double five = TrgArea.area(4, 4, 4);
        System.out.println("area (2, 2, 2) = " + four);
        System.out.println("area (4, 4, 4) = " + five);
    }
}

