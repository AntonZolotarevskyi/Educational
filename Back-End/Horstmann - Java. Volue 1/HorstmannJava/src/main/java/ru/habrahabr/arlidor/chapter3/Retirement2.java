package ru.habrahabr.arlidor.chapter3;

import java.util.Scanner;

public class Retirement2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Сколько денег вы готовы вносить каждый год? ");
        double payment = in.nextDouble();
        System.out.print("Какой процент за год %");
        double interestRate = in.nextDouble();
        double balance = 0;
        int years = 0;

        String input;

        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;

            System.out.printf("Через %d год(а) ваш баланс равен %,2f%n", years, balance);
            System.out.print("Готовы выходить на пенсию? (Y/N)");
            input = in.next();
        } while (input.equals("N"));
    }

}
