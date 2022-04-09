package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnCorrectString(){
        Cat cat = new Cat(feline);
        String expectedValue = "Мяу";
        String actualValue = cat.getSound();
        Assert.assertEquals("Звук не соответствует ожидаемому.",expectedValue, actualValue);
    }

    @Test
    public void getFoodReturnCorrectListString() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedValue = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedValue);
        List<String> actualValue = cat.getFood();
        Assert.assertEquals("Список еды не соответствует ожидаемому.",expectedValue, actualValue);
    }
}
