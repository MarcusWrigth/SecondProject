package ru.omsu.imit.balbenko.integral;

import ru.omsu.imit.balbenko.function_of_one_real_argument.FunctionException;
import ru.omsu.imit.balbenko.function_of_one_real_argument.IFunctionOfOneRealArgument;

public class Integral implements IFunctional {
    private double leftValue;//Верхний
    private double rightValue;//Нижний
    private double point;

    public Integral(double leftValue, double rightValue, double point) throws IntegralException {
        if (point < 1) {throw new IntegralException("Количество точек меньше 1");}
        if (leftValue > rightValue){throw new IntegralException("leftValue > rightValue");}
        this.leftValue = leftValue;
        this.rightValue = rightValue;
        this.point = point;
    }

    public double calculateFunctional(IFunctionOfOneRealArgument function) throws FunctionException {
        double step = (rightValue - leftValue) / point;
        double integralValue = 0.0;

        for (double i = leftValue; i < rightValue; i=i + step) {
            integralValue += step * function.functionOfOneRealArgument(i);
        }
        return integralValue;
    }
}
