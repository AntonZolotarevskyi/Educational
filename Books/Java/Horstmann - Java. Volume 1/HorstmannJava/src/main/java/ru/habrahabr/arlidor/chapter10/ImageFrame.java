package ru.habrahabr.arlidor.chapter10;

import javax.swing.JFrame;

public class ImageFrame extends JFrame {

    public ImageFrame() {
        add(new ImageComponent());
        pack();
    }
}
