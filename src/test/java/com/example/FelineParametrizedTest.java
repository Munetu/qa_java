package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {

    private final int countOfKittens;

    public FelineParametrizedTest(int countOfKitten) {
        this.countOfKittens = countOfKitten;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][]{
                {5},
                {0},
                {-5},
        };
    }

    @Test
    public void getKittensWithParametrReturnSentInt() {
        Feline feline = new Feline();
        int actual = feline.getKittens(countOfKittens);
        Assert.assertEquals("Количество котят не соответствует ожидаемому.", countOfKittens, actual);
    }
}
