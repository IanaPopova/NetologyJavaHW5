package ru.netology.NetologyJavaHW5.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationCalcTest {

    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    public void smallerThreshold(int expected,int income,int expenses,int threshold) {
        VacationCalc service = new VacationCalc();

        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

 /*   @Test
    public void biggerThreshold() {
        VacationCalc service = new VacationCalc();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual); */
    }

