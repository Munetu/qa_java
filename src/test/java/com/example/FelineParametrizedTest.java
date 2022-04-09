package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {

    private final int countOfKitten;

    public FelineParametrizedTest(int countOfKitten){
        this.countOfKitten = countOfKitten;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData(){
        return new Object[][]{
                {5},
                {0},
                {-5},
        };
    }

    @Test
    public void getKittensWithParametrReturnSentInt() {
        Feline feline = new Feline();
        int actual = feline.getKittens(countOfKitten);
        Assert.assertEquals("Количество котят не соответствует ожидаемому.",countOfKitten, actual);
    }
}
