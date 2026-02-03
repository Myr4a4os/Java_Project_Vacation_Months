package ru.netology.javaqa.javamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

//import org.junit.jupiter.api.Test;
//import ru.netology.javaqa.VacationService;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000"
    })
    public void testVacationMonthsAtIncome10_000(int expected, int expense, int threshold) {
        VacationService service = new VacationService();

        //int expected = 3;
        int actual = service.calcMonths(10_000, 3_000, 20_000);
        //System.out.println(" Месяцев отдыха " + result1);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "4,100000,6000,150000"
    })
    public void testVacationMonthsAtIncome100_000(int expected, int expense, int threshold) {
        VacationService service = new VacationService();

        //int expected = 3;
        int actual = service.calcMonths(100_000, 6_000, 150_000);
        //System.out.println(" Месяцев отдыха " + result1);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testVacationMonthsAtIncome100_000() {
//        VacationService service = new VacationService();
//
//        int expected = 4;
//        int actual = service.calcMonths(100_000, 6_000, 150_000);
//        Assertions.assertEquals(expected, actual);

//    }
//
//
//        @Test
//        public void testVacationMonthsAtIncome150_000 () {
//        VacationService service = new VacationService();
//
//        int expected = 6;
//        int actual = service.calcMonths(150_000, 50_000, 50_000);
//        Assertions.assertEquals(expected, actual);
//    }
}

