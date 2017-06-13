package ru.omsu.imit.balbenko;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionOfASquareTrinomialTest {
    @Test
    public void solutionOfASquareTrinomial() throws Exception {
        ArrayList<Double>firstTest = new ArrayList<Double>();
        firstTest.add(10.0);
        firstTest.add(-0.4);

        SolutionOfASquareTrinomial solutionOfASquareTrinomial = new SolutionOfASquareTrinomial(5, -48, -20);
        solutionOfASquareTrinomial.solutionOfASquareTrinomial();
        Assert.assertEquals(firstTest, solutionOfASquareTrinomial.getResult());

        ArrayList<Double>secondTest = new ArrayList<Double>();
        secondTest.add(-3.0);
        secondTest.add(-3.0);

        SolutionOfASquareTrinomial testObj1 = new SolutionOfASquareTrinomial(1, 6, 9);
        testObj1.solutionOfASquareTrinomial();
        Assert.assertEquals(secondTest, testObj1.getResult());
    }


}