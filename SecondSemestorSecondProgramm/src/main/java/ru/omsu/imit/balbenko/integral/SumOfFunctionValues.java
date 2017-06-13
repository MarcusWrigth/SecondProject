package ru.omsu.imit.balbenko.integral;

import ru.omsu.imit.balbenko.function_of_one_real_argument.FunctionException;
import ru.omsu.imit.balbenko.function_of_one_real_argument.IFunctionOfOneRealArgument;

public class SumOfFunctionValues implements IFunctional {
    public SumOfFunctionValues() {
    }

    public double calculateFunctional(IFunctionOfOneRealArgument function) throws FunctionException {
        double a = function.getLeftValue();
        double b = function.getRightValue();
        double midpoint = (a + b) / 2;
        return function.functionOfOneRealArgument(a) + function.functionOfOneRealArgument(b) + function.functionOfOneRealArgument(midpoint);
    }
}
