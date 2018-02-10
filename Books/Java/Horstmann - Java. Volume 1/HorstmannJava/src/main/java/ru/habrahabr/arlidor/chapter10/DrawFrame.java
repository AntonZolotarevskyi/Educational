package ru.habrahabr.arlidor.chapter10;

import javax.swing.JFrame;

class DrawFrame extends JFrame {

    public DrawFrame() {
        add(new DrawComponent());
        pack();
    }
}
