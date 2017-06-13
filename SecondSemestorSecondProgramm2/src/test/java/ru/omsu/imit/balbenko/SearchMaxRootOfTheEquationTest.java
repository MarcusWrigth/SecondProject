package ru.omsu.imit.balbenko;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SearchMaxRootOfTheEquationTest {
    @Test
    public void maxRoot() throws Exception {
        /*В этом уравнение 2 разных корня*/
        SolutionOfASquareTrinomial resultMax = new SolutionOfASquareTrinomial(2, -9, 4);
        SearchMaxRootOfTheEquation searchMaxRootOfTheEquation = new SearchMaxRootOfTheEquation(resultMax);
        assertEquals(4.0, searchMaxRootOfTheEquation.maxRoot(), 0.000000001);

        /*В этом уравнении 2 одинаковых корня*/
        SolutionOfASquareTrinomial resultMax2 = new SolutionOfASquareTrinomial(1, 6, 9);
        SearchMaxRootOfTheEquation searchMaxRootOfTheEquation2 = new SearchMaxRootOfTheEquation(resultMax2);
        assertEquals(-3.0, searchMaxRootOfTheEquation2.maxRoot(), 0.000000001);

    }

}