/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.habrahabr.arlidor.chapter3;

import java.util.Scanner;

/**
 *
 * @author Tony
 */
public class InputTest {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Как вас зовут? ");
        String name = in.nextLine();
        System.out.println("Сколько вам лет? ");
        int age = in.nextInt();
        System.out.println("Здравствуйте, " + name + ". В следующем году вам исполнится " + (age + 1));
    }
}
