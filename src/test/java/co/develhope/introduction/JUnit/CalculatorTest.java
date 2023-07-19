package co.develhope.introduction.JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    // this tests addition method
    @Test
    void testSubtraction(){

        assertAll( "Addition results",
                () -> {
            assertEquals(34, Calculator.subtraction(100, 66));
            assertEquals(34, Calculator.subtraction(500, 66));

        });

    }
    @Test
    void testMultiplication(){
      assertEquals(63, Calculator.multiplication(7,9));
    }

}