package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static float euroToRubble(float value) {
        float rsl = 100 * value;
        return rsl;
    }

    public static float dollarToRubble(float value) {
        float rsl = 90 * value;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(200);
        float dollar = Converter.rubleToDollar(50000);
        float rubble = Converter.dollarToRubble(100);
        float rubble2 = Converter.euroToRubble(600);
        System.out.println("200 rubles are " + euro + " euro.");
        System.out.println("50000 rubles are " + dollar + " dollar.");
        System.out.println("100 dollars are " + rubble + " rubble.");
        System.out.println("600 euros are " + rubble2 + " rubble.");
    }
}


