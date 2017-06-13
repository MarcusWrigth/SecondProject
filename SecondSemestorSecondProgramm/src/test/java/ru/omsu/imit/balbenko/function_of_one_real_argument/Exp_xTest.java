package ru.omsu.imit.balbenko.function_of_one_real_argument;
/*f(x) = A*exp(x) + B*/
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exp_xTest {
    @Test
    public void functionOfOneRealArgument() throws FunctionException {
        Exp_x testExp1 = new Exp_x(5,5, 0,5);
        Assert.assertEquals(105.5, testExp1.functionOfOneRealArgument(3), 0.2);

        Exp_x testExp2 = new Exp_x(10,10, 0,5);
        Assert.assertEquals(210.8, testExp2.functionOfOneRealArgument(3), 0.2);
    }

    @Test(expected = FunctionException.class)
    public void testingException() throws FunctionException{
        double result = new Exp_x(1,2, 0,100).functionOfOneRealArgument(101);
    }

}