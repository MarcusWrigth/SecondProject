package ru.omsu.imit.balbenko.function_of_one_real_argument;
/*f(x) = A*sin(Bx)*/

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sin_xTest {
    @Test
    public void functionOfOneRealArgument() throws FunctionException {
        Sin_x textSin_x1 = new Sin_x(9, 1, 5, 10);
        Assert.assertEquals(3.7090663671758093, textSin_x1.functionOfOneRealArgument(9), 0.00002);

        Sin_x testSin_x2 = new Sin_x(0, 1000, -1, 4);
        Assert.assertEquals(0, testSin_x2.functionOfOneRealArgument(3), 0.5);

    }

    @Test(expected = FunctionException.class)
    public void testingError() throws FunctionException {
        double result = new Sin_x(5,2,1,4).functionOfOneRealArgument(5);
    }
}