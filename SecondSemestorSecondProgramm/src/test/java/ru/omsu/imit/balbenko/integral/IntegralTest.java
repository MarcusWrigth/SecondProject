package ru.omsu.imit.balbenko.integral;

import org.junit.Test;
import ru.omsu.imit.balbenko.function_of_one_real_argument.Exp_x;
import ru.omsu.imit.balbenko.function_of_one_real_argument.FunctionException;
import ru.omsu.imit.balbenko.function_of_one_real_argument.Sin_x;
import ru.omsu.imit.balbenko.function_of_one_real_argument.TheLinearEquation;

import static org.junit.Assert.*;

public class IntegralTest {
    @Test
    public void calculateFunctional() throws FunctionException, IntegralException {
        Integral testIntegral = new Integral(0,1,10);
        double result = testIntegral.calculateFunctional(new Exp_x(3,1,1,200));
        double exc = 16.640098490506755;
        assertEquals(result,exc,0.00000000001);

        Integral testIntegral2 = new Integral(0,1,10);
        double result2 = testIntegral2.calculateFunctional(new TheLinearEquation(3,4,1,20));
        double exc2 = 9.35;
        assertEquals(result2,exc2,0.00000000001);
    }

}