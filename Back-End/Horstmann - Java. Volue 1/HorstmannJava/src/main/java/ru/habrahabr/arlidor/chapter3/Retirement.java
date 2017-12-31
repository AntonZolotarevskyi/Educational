package ru.habrahabr.arlidor.chapter3;

import java.util.Scanner;

public class Retirement {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Как много денег вам необходимо, чтобы выйти на пенсию? ");
        double goal = in.nextDouble();
        System.out.print("Сколько денег вы готовы вносить каждый год?? ");
        double payment = in.nextDouble();
        System.out.print("Interest rate in %");
        double interestRate = in.nextDouble();
        double balance = 0;
        int years = 0;
        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("Вы можете выйти на пенсию через " + years + " years");
    }
}
