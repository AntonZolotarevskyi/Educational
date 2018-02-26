package ru.habrahabr.arlidor.chapter11;

import javax.swing.*;

public class MouseFrame extends JFrame {

    public MouseFrame() {
        add(new MouseComponent());
        pack();
    }
}
