package com.hillel.lessons.Lesson22Calc;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {

    private static Calculator count;
    public CalculatorTest() {
    }


    @BeforeAll
    static void initAll() {
        count = new Calculator();
        System.out.println("Init");
    }

    @BeforeEach
    public void log() {
        System.out.println("Test start");
    }

    private void assertEquals(int i, int result, String incorrectAdditionResult) {
    }

    @DisplayName("Addition Test")
    @Test
    void additionTest() {
        int result = count.addition(2, 3);
        assertEquals(5, result, "Incorrect addition result");
    }



    @Test
    @DisplayName("Subtraction Test")
    void subtractionTest() {
        int result = count.subtraction(5, 3);
        assertEquals(2, result, "Incorrect subtraction result");
    }

    @Test
    @DisplayName("Multiplication Test")
    void multiplicationTest() {
        int result = count.multiply(2, 3);
        assertEquals(6, result, "Incorrect multiplication result");
        System.out.println("Multiplication Test Passed");
    }

    @Test
    @DisplayName("Division Test")
    void divisionTest() {
        int result = count.division(10, 2);
        assertEquals(5, result, "Incorrect division result");
    }

    @Test
    @DisplayName("Division by zero Test")
    void divisionByZeroTest() {
        assertThrows(ArithmeticException.class, () -> count.division(1, 0), "Did not throw expected ArithmeticException");
    }

    @ParameterizedTest
    @MethodSource("integerStreamProvider")
    void parameterizedTest(int a, int b, int expected) {
        int result = count.addition(a, b);
        assertEquals(expected, result, "Incorrect parameterized test result");
    }

    private static Stream<Arguments> integerStreamProvider() {
        return Stream.of(
                Arguments.of(10, 11, 21),
                Arguments.of(0, 0, 0),
                Arguments.of(-5, 5, 0)
        );
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test completed.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("All tests completed.");
    }
}
