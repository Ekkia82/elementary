package ru.calculator;

public class Calculator {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
}

    class MathFunc {

        public static int func1(int x) {
            int y = x;
            return y;
        }

        public static void main(String[] args) {
            Calculator.plus(1, 2);
            Calculator.plus(10, 11);
            int result3 = MathFunc.func1(100);
            System.out.println(result3);
        }
    }

