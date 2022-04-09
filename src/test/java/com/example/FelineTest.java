package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void getFoodHerbivoreReturnCorrectListString() throws Exception {
        Feline feline = new Feline();
        List<String> expectedValue = List.of("Трава", "Различные растения");
        List<String> actualValue = feline.getFood("Травоядное");
        Assert.assertEquals("Список еды не соответствует ожидаемому.",expectedValue, actualValue);
    }

    @Test
    public void getFoodPredatorReturnCorrectListString() throws Exception {
        Feline feline = new Feline();
        List<String> expectedValue = List.of("Животные", "Птицы", "Рыба");
        List<String> actualValue = feline.getFood("Хищник");
        Assert.assertEquals("Список еды не соответствует ожидаемому.",expectedValue, actualValue);
    }

    @Test
    public void getFoodExceptionReturnCorrectMessage() throws Exception {
        Feline feline = new Feline();
        String expectedValue = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Exception exception = null;
        try {
            feline.getFood("");
        } catch (Exception ex) {
            exception = ex;
        }
        Assert.assertNotNull("Ожидается ненулевое Исключение. Фактический результат: expection = null",exception);
        String actualValue = exception.getMessage();
        Assert.assertEquals("Сообщение исключения не соответствует ожидаемому.",expectedValue, actualValue);
    }

    @Test
    public void eatMeatReturnCorrectListString() throws Exception {
        Feline feline = new Feline();
        List<String> expectedValue = List.of("Животные", "Птицы", "Рыба");
        //.when(feline.getFood("Хищник")).thenReturn(expectedValue);
        List<String> actualValue = feline.eatMeat();
        Assert.assertEquals("Список еды не соответствует ожидаемому.",expectedValue, actualValue);
    }

    @Test
    public void getFamilyReturnCorrectString() {
        Feline feline = new Feline();
        String expectedValue = "Кошачьи";
        String actualValue = feline.getFamily();
        Assert.assertEquals("Семейство не соответствует ожидаемому.",expectedValue, actualValue);
    }

    @Test
    public void getKittensWithoutParametrReturnIntOne() {
        Feline feline = new Feline();
        int expectedValue = 1;
        int actualValue = feline.getKittens();
        Assert.assertEquals("Количество котят не соответствует ожидаемому.",expectedValue, actualValue);
    }



}
