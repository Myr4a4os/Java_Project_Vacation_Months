package ru.netology.javaqa.javamvn.services;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();


        int result1 = service.calcMonths(10_000, 3_000, 20_000);
        System.out.println("Результат №1");
        System.out.println(" Месяцев отдыха " + result1);


        int result2 = service.calcMonths(100_000, 6_000, 75_000);
        System.out.println("Результат №2");
        System.out.println(" Месяцев отдыха " + result2);


        int result3 = service.calcMonths(150_000, 50_000, 50_000);
        System.out.println("Результат №3");
        System.out.println(" Месяцев отдыха " + result3);

    }
}