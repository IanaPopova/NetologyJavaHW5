package ru.netology.NetologyJavaHW5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationCalcTest {

    @Test
    public void smallerThreshold() {
        VacationCalc service = new VacationCalc();

        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void biggerThreshold() {
        VacationCalc service = new VacationCalc();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
