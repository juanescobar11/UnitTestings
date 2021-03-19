package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void suma() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.suma(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.suma(first, second),
                     () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "5,    3,   2",
            "3,    2,   1",
            "49,  3, 46",
            "3,  3, 0"
    })
    public void severalResta(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.resta(first, second),
                     () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "5,    3,   15",
            "3,    2,   6",
            "3,  3, 9",
            "3,  5, 15"
    })
    public void severalMultiplicacion(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplicacion(first, second),
                     () -> first + " + " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "15,    3,   5",
            "50,    5,   10",
            "10,  2, 5",
            "60,  2, 30"
    })
    public void severalDivision(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.division(first, second),
                     () -> first + " + " + second + " should equal " + expectedResult);
    }
}
