package ru.habrahabr.arlidor.chapter10;

import javax.swing.JFrame;

public class NotHelloWorldFrame extends JFrame {

    public NotHelloWorldFrame() {
        add(new NotHelloWorldComponent());
        pack();
    }
}
