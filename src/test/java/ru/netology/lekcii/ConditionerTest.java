package ru.netology.lekcii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {

    // делаем тест, который проверяет, что кондиционеру можно выставить температуру

    // тесты всегда состоят из 3х частей
    // 1. подготовительная (хотим проверить, работает ли кнопка - включаем кондей и настраиваем его на нужные условия)
    // 2. тестируемое действие (нажать на кнопку)
    // 3. проверок (знаем образ ожидаемого результата. Берем фактический рез после выполнения тестируемой операции и сравниваем с ожид)


    @Test
    public void ShouldSetTemp() {  // название (шапка) теста

        // 1. ПОДГОТОВИТЕЛЬНАЯ - создаем объект Кондея. Переменная, кладем туда новый объект
        Conditioner cond = new Conditioner(); // изначально t = 0, т.к. мы не присвоили в класе Conditioner и Java сама его заполнила нулевым значением для типа int (0)


        // 2. ТЕСТИРУЕМОЕ ДЕЙСТВИЕ - кладем в это поле температуру  15
        cond.currentTemperature = 15;


        // 3. ПРОВЕРКА - действительно ли у него сейчас t 15
        int expected = 15;
        int actual = cond.currentTemperature; // реальное текущее значение t спрашиваем у самого кондиционера

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxTemp() {

        Conditioner cond = new Conditioner();

        cond.setMaxTemp();  // метод макс


        // спрашиваем у кондея, какая у него текущая температура
        int expected = 30;
        int actual = cond.currentTemperature; // текущее значение, указанное в методе макс

        Assertions.assertEquals(expected, actual);
    }
}
