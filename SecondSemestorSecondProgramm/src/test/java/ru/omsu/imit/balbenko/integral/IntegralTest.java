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
        Integral testIntegral = new Integral(0, Math.PI * 2,100);
        double result = testIntegral.calculateFunctional(new Sin_x(1,1,0,200));
        double exc = 0;
        assertEquals(exc,result,0.00000000001);
    }
}