package ch.zhaw.iwi.devops.RomanNumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralsConverterTest {
    @Test
    public void romanNumeralsConverter() {

        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        assertEquals("Dieser Wert ist zu tief", romanNumerals.convert(0));
        assertEquals("Dieser Wert ist zu tief", romanNumerals.convert(-1));
        assertEquals("Dieser Wert ist zu tief", romanNumerals.convert(-1000));
    }

    @Test
    public void romanNumeralsConverter2() {

        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        assertEquals("Dieser Wert ist zu hoch", romanNumerals.convert(51));
        assertEquals("Dieser Wert ist zu hoch", romanNumerals.convert(100));
        assertEquals("Dieser Wert ist zu hoch", romanNumerals.convert(1000));
    }

    @Test
    public void romanNumeralsConverter3() {

        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();
        assertEquals("I", romanNumerals.convert(1));
        assertEquals("XI", romanNumerals.convert(11));
        assertEquals("XV", romanNumerals.convert(15));
        assertEquals("XIX", romanNumerals.convert(19));
        assertEquals("XXIII", romanNumerals.convert(23));
        assertEquals("XXXIV", romanNumerals.convert(34));
        assertEquals("XLIII", romanNumerals.convert(43));
        assertEquals("XLIX", romanNumerals.convert(49));
        assertEquals("L", romanNumerals.convert(50));
    }
    
}
