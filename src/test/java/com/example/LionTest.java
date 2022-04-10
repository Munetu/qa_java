package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeMaleReturnCorrectBooleanTrue() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        boolean expectedValue = true;
        boolean actualValue = lion.doesHaveMane();
        Assert.assertEquals("Boolean не соответствует ожидаемому.", expectedValue, actualValue);
    }

    @Test
    public void doesHaveManeFemaleReturnCorrectBooleanFalse() throws Exception {
        String sex = "Самка";
        Lion lion = new Lion(sex, feline);
        boolean expectedValue = false;
        boolean actualValue = lion.doesHaveMane();
        Assert.assertEquals("Boolean не соответствует ожидаемому.", expectedValue, actualValue);
    }

    @Test
    public void getKittensReturnCorrectInt() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        int expectedValue = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualValue = lion.getKittens();
        Assert.assertEquals("Количество котят не соответствует ожидаемому.", expectedValue, actualValue);
    }

    @Test
    public void getFoodReturnCorrectInt() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        List<String> expectedValue = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualValue = lion.getFood();
        Assert.assertEquals("Список еды не соответствует ожидаемому.", expectedValue, actualValue);
    }
}
