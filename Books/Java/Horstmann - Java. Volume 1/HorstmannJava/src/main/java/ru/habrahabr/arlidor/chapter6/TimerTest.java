package ru.habrahabr.arlidor.chapter6;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

    public static void main(String args[]) {
        ActionListener listener = new TimerPrinter();
        Timer t = new Timer(1000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
