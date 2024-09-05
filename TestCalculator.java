public class TestCalculator {

    public static void main(String[] args) {
        // Test addition
        String expression = "1 + 2";
        String expectedResult = "3.0";
        String actualResult = Calculator.Run(expression);
        assertResult(expression, expectedResult, actualResult);

        // Test subtraction
        expression = "5 - 3";
        expectedResult = "2.0";
        actualResult = Calculator.Run(expression);
        assertResult(expression, expectedResult, actualResult);

        // Test multiplication
        expression = "4 * 2";
        expectedResult = "8.0";
        actualResult = Calculator.Run(expression);
        assertResult(expression, expectedResult, actualResult);

        // Test division
        expression = "10 / 2";
        expectedResult = "5.0";
        actualResult = Calculator.Run(expression);
        assertResult(expression, expectedResult, actualResult);

        // Test order of operations
        expression = "2 + 3 * 4";
        expectedResult = "14.0";
        actualResult = Calculator.Run(expression);
        assertResult(expression, expectedResult, actualResult);

        // Test division by zero
        expression = "5 / 0";
        try {
            Calculator.Run(expression);
            System.out.println("ERROR: Division by zero not handled correctly");
        } catch (ArithmeticException e) {
            // Expected exception
            System.out.println("Division by zero handled correctly");
        }

        // Test invalid input
        expression = "1 + 2 *";
        try {
            Calculator.Run(expression);
            System.out.println("ERROR: Invalid input not handled correctly");
        } catch (IllegalArgumentException e) {
            // Expected exception
            System.out.println("Invalid input handled correctly");
        }
    }

    private static void assertResult(String expression, String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed for expression: " + expression);
        } else {
            System.out.println("Test failed for expression: " + expression);
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }
}