package ru.netology.javaqa.javamvn.services;

public class VacationService {

    public int calcMonths(int income, int expense, int threshold) {
        int balance = 0;    // начальный баланс
        int vacationMonths = 0; // счетчик месяцев отдыха

        for (int month = 0; month < 12; month++) {
            if (balance >= threshold)  // отдых
            {
                balance = (balance - expense) / 3;
                vacationMonths++;
            } else {
                balance = balance + income - expense;
            }
        }
        return vacationMonths;
    }
}
