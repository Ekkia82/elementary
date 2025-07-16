package ru.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        double rsl2 = y2 - y1;
        double first = Math.pow(rsl, 2);
        double second = Math.pow(rsl2, 2);
        double result = first + second;
        double finalresult = Math.sqrt(result);

        return rsl;
    }

    public static void main(String[] args) {
        double finalresult = Point.distance(0, 0, 2, 0);
        double finalresult1 = Point.distance(5, 4, 6, 8);
        double finalresult2 = Point.distance(5, 5, 4, 3);
        System.out.println("result (0, 0) to (2, 0) " + finalresult);
        System.out.println("result (5, 4) to (6, 8) " + finalresult1);
        System.out.println("result (5, 5) to (4, 3) " + finalresult2);
    }
}


