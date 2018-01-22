package ru.habrahabr.arlidor.chapter6;

import javax.swing.JOptionPane;

public class AnonymousInnerClassTest {

    public static void main(String args[]) {
        TalkingClock2 clock = new TalkingClock2(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
