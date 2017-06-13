package ru.omsu.imit.balbenko.function_of_one_real_argument;
/*f(x) = A*exp(x) + B*/
public class Exp_x implements IFunctionOfOneRealArgument {
    private double a;
    private double b;

    private double leftValue;
    private double rightValue;

    public Exp_x(double a, double b, double leftValue, double rightValue){
        this.a = a;
        this.b = b;
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }

    public double functionOfOneRealArgument(double value) throws FunctionException {
        if (value < leftValue && value > rightValue){
            throw new FunctionException("Ваш аргумент не определен на отрезке");
        }
        return (this.a * Math.exp(value) + this.b);
    }

    public double getLeftValue(){
        return this.rightValue;
    }

    public double getRightValue(){
        return this.rightValue;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
