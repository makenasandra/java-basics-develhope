package co.develhope.introduction.JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    // this tests addition method
    @Test
    void testSubtraction(){

        assertAll( "Subtraction tests",
                () -> {
                    assertEquals(34, Calculator.subtraction(100, 66));
                    assertEquals(84, Calculator.subtraction(500, 66));

                });

    }
    @Test
    void testMultiplication(){
        assertAll("These tests the Multiplication method",()->{
            assertEquals(63, Calculator.multiplication(7,9));
            assertEquals(903, Calculator.multiplication(17,5));
        });

    }

}
