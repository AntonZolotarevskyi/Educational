/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.habrahabr.arlidor.chapter10;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SimpleFrameTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(()
                -> {
            SimpleFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
