package ru.omsu.imit.balbenko.function_of_one_real_argument;

public interface IFunctionOfOneRealArgument {
    public double functionOfOneRealArgument(double value) throws FunctionException;
    public double getLeftValue();
    public double getRightValue();
}
