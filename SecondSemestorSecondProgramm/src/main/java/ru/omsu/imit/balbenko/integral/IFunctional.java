package ru.omsu.imit.balbenko.integral;

import ru.omsu.imit.balbenko.function_of_one_real_argument.FunctionException;
import ru.omsu.imit.balbenko.function_of_one_real_argument.IFunctionOfOneRealArgument;

public interface IFunctional<T extends IFunctionOfOneRealArgument> {
    double calculateFunctional(T function) throws Exception, FunctionException;
}
