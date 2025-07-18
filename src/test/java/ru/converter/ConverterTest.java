package ru.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RubleThen1dot4Euro() {
        float in = 140F;
        float expected = 1.4F;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001F;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert50000RublesThen555dot55554Dollars() {
        float in2 = 50000F;
        float expected2 = 555.55554F;
        float out2 = Converter.rubleToDollar(in2);
        float eps2 = 0.0001F;
        assertThat(out2).isEqualTo(expected2, withPrecision(eps2));

    }

    @Test
    void whenConvert600EuroThen60000Rubbles() {
        float in3 = 600F;
        float expected3 = 60000F;
        float out3 = Converter.euroToRubble(in3);
        float eps3 = 0.0001F;
        assertThat(out3).isEqualTo(expected3, withPrecision(eps3));
    }

    @Test
    void whenConvert100DollarsThen9000ToRubbles() {
        float in4 = 100F;
        float expected4 = 9000F;
        float out4 = Converter.dollarToRubble(in4);
        float eps4 = 0.0001F;
        assertThat(out4).isEqualTo(expected4, withPrecision(eps4));
    }
}