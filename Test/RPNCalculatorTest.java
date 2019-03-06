import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RPNCalculatorTest {

    @Test
    public void input_5_1_2_ADD_4_MUL_ADD_3_SUB_should_return_14() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "5 1 2 + 4 * + 3 -";
        int expectedResult = 14;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }

    @Test
    public void input_0_should_return_0() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "0";
        int expectedResult = 0;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }
    @Test
    public void empty_input_should_return_0() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "";
        int expectedResult = 0;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }

    @Test
    public void input_2_should_return_2() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "2";
        int expectedResult = 2;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }

    @Test
    public void input_1_2_ADD_should_return_3() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "1 2 +";
        int expectedResult = 3;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }

    @Test
    public void input_5_2_SUB_should_return_3() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "5 2 -";
        int expectedResult = 3;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }

    @Test
    public void input_10_5_1_ADD_SUB_should_return_4() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "10 5 1 + -";
        int expectedResult = 4;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }

    @Test
    public void input_3_2_2_ADD_ADD_1_SUB_should_return_14() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "9 4 4 + + 3 -";
        int expectedResult = 14;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult, result);
    }

    @Test
    public void input_7_MUL_1_should_return_7() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "7 1 *";
        int expectedResult = 7;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }

    @Test
    public void input_4_2_MUL_should_return_8() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "4 2 *";
        int expectedResult = 8;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }


    @Test
    public void input_3_5_MUL_6_8_MUL_2_ADD_ADD_should_return_65() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "3 5 * 6 8 * 2 + +";
        int expectedResult = 65;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }
    ////////////////////////////////////////////////////

    @Test
    public void input_24_4_DIV_should_return_4() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "24 4 /";
        int expectedResult = 6;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }


    @Test
    public void input_4_2_DIV_3_MUL_should_return_6() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "4 2 / 3 *";
        int expectedResult = 6;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }

    @Test
    public void input_3_2_MUL_1_DIV_should_return_6() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "3 2 * 1 /";
        int expectedResult = 6;

        // When
        int result = calculator.calculate(input);

        // Then
        assertEquals(expectedResult,result);
    }



    @Test
    public void input_3_5_8_MULT_7_ADD_MULT_should_return_10() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "120 2 8 * 4 - /";
        int expectedResult = 10;

            // When
            int result = calculator.calculate(input);

            // Then
            assertEquals(expectedResult,result);
    }


    @Test
    public void nput_256_16_4_2_1_ADD_SUB_MAX_DIV_should_return_16() {

        // Given
        RPNCalculator calculator = new RPNCalculator();
        String input = "256 16 4 2 1 + - * /";
        int expectedResult = 16;

            // When
            int result = calculator.calculate(input);

            // Then
            assertEquals(expectedResult,result);
    }

}