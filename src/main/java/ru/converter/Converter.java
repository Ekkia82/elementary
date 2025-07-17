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
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(50000);
        float rubble = Converter.dollarToRubble(100);
        float rubble2 = Converter.euroToRubble(600);

        float in = 140F;
        float expected = 1.4F;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;

        float in1 = 50000F;
        float expected1 = 555.55554F;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected == out;

        float in2 = 100F;
        float expected2 = 9000F;
        float out2 = Converter.dollarToRubble(in2);
        boolean passed2 = expected == out;

        float in3 = 600F;
        float expected3 = 60000F;
        float out3 = Converter.euroToRubble(in3);
        boolean passed3 = expected == out;

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("50000 rubles are " + dollar + " dollar.");
        System.out.println("100 dollars are " + rubble + " rubble.");
        System.out.println("600 euros are " + rubble2 + " rubble.");
        System.out.println("140 rubles are 1.4. Test result : " + passed);
        System.out.println("50000 rubles are 555.55554. Test result : " + passed);
        System.out.println("100 dollars are 9000. Test result : " + passed2);
        System.out.println("600 euros are 60000. Test result : " + passed3);
    }
}


