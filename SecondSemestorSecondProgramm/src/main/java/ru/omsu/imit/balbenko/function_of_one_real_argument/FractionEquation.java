package ru.omsu.imit.balbenko.function_of_one_real_argument;
/*f(x) = (Ax + B) / (Cx + D)*/
public class FractionEquation implements IFunctionOfOneRealArgument {
    private double a;
    private double b;
    private double c;
    private double d;

    private double leftValue;
    private double rightValue;

    public FractionEquation (double a, double b, double c, double d, double leftValue, double rightValue){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.leftValue = leftValue;
        this.rightValue = rightValue;
    }
    public double functionOfOneRealArgument(double value) throws FunctionException {
        if (value < leftValue && value > rightValue){
            throw new FunctionException("Ваш аргумент не определен на отрезке");
        }
        return ((this.a * value + this.b)/(this.c * value + this.d));
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
}
