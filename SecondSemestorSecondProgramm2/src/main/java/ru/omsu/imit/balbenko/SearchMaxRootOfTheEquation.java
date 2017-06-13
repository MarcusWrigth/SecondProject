package ru.omsu.imit.balbenko;

import java.util.ArrayList;

public class SearchMaxRootOfTheEquation {
    private SolutionOfASquareTrinomial obj;

    public SearchMaxRootOfTheEquation(SolutionOfASquareTrinomial obj) {
        this.obj = obj;
    }

    public double maxRoot() throws Exception {
        if (obj.solutionOfASquareTrinomial() == null) {
            throw new Exception("Корней нет");
        }
        ArrayList<Double> arrayList = obj.solutionOfASquareTrinomial();
        return Math.max(arrayList.get(0), arrayList.get(1));
    }


}


