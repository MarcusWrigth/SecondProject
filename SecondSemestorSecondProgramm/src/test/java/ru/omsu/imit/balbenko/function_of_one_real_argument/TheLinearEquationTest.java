package ru.omsu.imit.balbenko.function_of_one_real_argument;
/*f(x) = A*x + B*/

import org.junit.Test;

import static org.junit.Assert.*;

public class TheLinearEquationTest {
    @Test
    public void functionOfOneRealArgument() throws FunctionException {
        TheLinearEquation testEquation1 = new TheLinearEquation(2, 2, 0, 5);
        assertEquals(6, testEquation1.functionOfOneRealArgument(2), 0.0000001);

        TheLinearEquation testEquation2 = new TheLinearEquation(0, 0, 1, 3);
        assertEquals(0, testEquation2.functionOfOneRealArgument(2), 0.0000001);
    }

    @Test(expected = FunctionException.class)
    public void testingError() throws FunctionException {
        double result = new TheLinearEquation(5, 2, 1, 4).functionOfOneRealArgument(5);
    }

}