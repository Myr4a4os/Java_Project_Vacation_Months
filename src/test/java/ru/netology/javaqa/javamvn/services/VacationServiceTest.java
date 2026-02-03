package ru.netology.javaqa.javamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class VacationServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000"
    })
    public void testVacationMonthsAtIncome10_000(int expected, int income, int expense, int threshold) {
        VacationService service = new VacationService();

        int actual = service.calcMonths(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "4,100000,6000,150000"
    })
    public void testVacationMonthsAtIncome100_000(int expected, int income, int expense, int threshold) {
        VacationService service = new VacationService();
        int actual = service.calcMonths(100_000, 6_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }


}

