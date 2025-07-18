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
    void whenConvert50000RublesThen555dot55Dollars() {
        float in = 50000F;
        float expected = 555.55F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.01F;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert600EuroThen60000Rubbles() {
        float in = 600F;
        float expected = 60000F;
        float out = Converter.euroToRubble(in);
        float eps = 0.0001F;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert100DollarsThen9000ToRubbles() {
        float in = 100F;
        float expected = 9000F;
        float out = Converter.dollarToRubble(in);
        float eps = 0.0001F;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}