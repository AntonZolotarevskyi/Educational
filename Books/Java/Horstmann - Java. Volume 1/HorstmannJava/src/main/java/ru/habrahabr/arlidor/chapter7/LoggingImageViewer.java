package ru.habrahabr.arlidor.chapter7;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class LoggingImageViewer {

    public static void main(String args[]) {
        if (System.getProperty("java.util.logging.config.class") == null
                && System.getProperty("java.util.logging.config.file") == null) {

            try {
                Logger.getLogger("ru.habrahabr.arlidor").setLevel(Level.ALL);
                final int LOG_ROTATION_COUNT = 10;
                Handler handler = new FileHandler("%/LoggingImageViewer.log", 0, LOG_ROTATION_COUNT);
                Logger.getLogger("ru.habrahabr.arlidor").addHandler(handler);
            } catch (IOException | SecurityException ex) {
                Logger.getLogger("ru.habrahabr.arlidor").log(Level.SEVERE, "Can`t create log file handler", ex);
            }
        }
        EventQueue.invokeLater(() -> {
            Handler windowHandler = new WindowHandler();
            windowHandler.setLevel(Level.ALL);
            Logger.getLogger("ru.habrahabr.arlidor").addHandler(windowHandler);
            JFrame frame = new ImageViewerFrame();
            frame.setTitle("LoggingImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Logger.getLogger("ru.habrahabr.arlidor").fine("Showing frame");
            frame.setVisible(true);
        });
    }
}
