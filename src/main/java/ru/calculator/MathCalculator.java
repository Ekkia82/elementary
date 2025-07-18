package ru.calculator;

import static ru.math.MathFunction.*;


public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivision(double first, double second){
        return minus(first, second)
                + division(first, second);

    }

    public static double summOfAll(double first, double second){
        return sum(first, second)
                +multiply(first, second)
                +division(first, second)
                +minus(first, second);
    }


    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAndDivision(10, 20));
        System.out.println("Сумма всех расчетов: " + summOfAll(10, 20));
    }
}



