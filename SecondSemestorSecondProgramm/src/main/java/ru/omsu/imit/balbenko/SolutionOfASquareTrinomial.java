package ru.omsu.imit.balbenko;

import java.util.ArrayList;

public class SolutionOfASquareTrinomial {
    ArrayList<Double> result = new ArrayList<Double>();
    private double first = 0;
    private double second = 0;
    private double third = 0;
    private double discriminant = 0;

    public SolutionOfASquareTrinomial(double first, double second, double third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public ArrayList solutionOfASquareTrinomial() throws Exception {
        discriminant = second * second - 4 * first * third;
        if (discriminant > 0) {
            result.add((-second + Math.sqrt(discriminant)) / (2 * first));
            result.add((-second - Math.sqrt(discriminant)) / (2 * first));
        } else if (discriminant == 0.0) {
            result.add((-second + Math.sqrt(discriminant)) / (2 * first));
            result.add((-second + Math.sqrt(discriminant)) / (2 * first));
        } else {
            throw new Exception("Discriminant < 0");
        }
        return result;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public double getThird() {
        return third;
    }

    public ArrayList getResult() {
        return result;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public void setThird(double third) {
        this.third = third;
    }
}
