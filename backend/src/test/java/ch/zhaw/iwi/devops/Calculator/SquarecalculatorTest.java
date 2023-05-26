package ch.zhaw.iwi.devops.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SquarecalculatorTest {
    @Test
    public void testSquare() {
        Squarecalculator calculator = new Squarecalculator();

        int input = 5;
        int expectedOutput = 25;

        assertEquals(expectedOutput, calculator.square(input));
    }
}
