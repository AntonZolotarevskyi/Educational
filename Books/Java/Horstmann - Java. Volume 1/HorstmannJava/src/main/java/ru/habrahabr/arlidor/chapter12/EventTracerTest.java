package ru.habrahabr.arlidor.chapter12;

import java.awt.*;

import javax.swing.*;

public class EventTracerTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(()
                -> {
            JFrame frame = new EventTracerFrame();
            frame.setTitle("EventTracerTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class EventTracerFrame extends JFrame {

    public EventTracerFrame() {

        add(new JSlider(), BorderLayout.NORTH);
        add(new JButton("Test"), BorderLayout.SOUTH);

        EventTracer tracer = new EventTracer();
        tracer.add(this);
        pack();
    }
}
