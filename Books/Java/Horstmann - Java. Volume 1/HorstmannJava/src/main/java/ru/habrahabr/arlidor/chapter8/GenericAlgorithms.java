/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.habrahabr.arlidor.chapter8;

import java.util.Arrays;

/**
 *
 * @author Tony
 */
public class GenericAlgorithms {

    public static void main(String[] args) {
        Pair<String> p = Pair.makePair(String::new);
        System.out.println(p);

        p = Pair.makePair(String.class);
        System.out.println(p);

        String[] ss = ArrayAlg.minmax("Tom", "Dick", "Harry");
        System.out.println(Arrays.toString(ss));

       // ss = ArrayAlg.minmax(String[]::new, "Tom", "Dick", "Harry");
        System.out.println(Arrays.toString(ss));
    }
}
