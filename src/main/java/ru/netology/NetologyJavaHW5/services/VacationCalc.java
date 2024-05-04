package ru.netology.NetologyJavaHW5.services;

public class VacationCalc {
    public int calculate(int income, int expenses, int threshold) {
        int numberOfMonths = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                numberOfMonths++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return numberOfMonths;
    }
}
