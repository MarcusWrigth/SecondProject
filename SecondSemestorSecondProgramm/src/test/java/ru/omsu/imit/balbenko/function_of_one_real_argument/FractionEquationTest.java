package ru.omsu.imit.balbenko.function_of_one_real_argument;
/*f(x) = (Ax + B) / (Cx + D)*/
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionEquationTest {
    @Test
    public void functionOfOneRealArgument() throws FunctionException {
        FractionEquation testFractionEquation1 = new FractionEquation(2,3,4,5,0,5);
        assertEquals(0.5, testFractionEquation1.functionOfOneRealArgument(3), 0.2);

        FractionEquation testFractionequation2 = new FractionEquation(100,2000,100,2000,9,11);
        assertEquals(1, testFractionequation2.functionOfOneRealArgument(10), 0.000001);
    }

    @Test(expected = FunctionException.class)
    public void testingError() throws FunctionException {
        double result = new FractionEquation(5,2,1,4, 0,1).functionOfOneRealArgument(5);
    }

}