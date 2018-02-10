package ru.habrahabr.arlidor.chapter10;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ImageTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(()
                -> {
            JFrame frame = new ImageFrame();
            frame.setTitle("ImageTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
