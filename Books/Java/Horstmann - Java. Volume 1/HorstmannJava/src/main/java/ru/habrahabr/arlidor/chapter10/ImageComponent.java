package ru.habrahabr.arlidor.chapter10;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class ImageComponent extends JComponent {

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    private Image image;

    public ImageComponent() {
        image = new ImageIcon("blue-ball.gif").getImage();
    }

    @Override
    public void paintComponent(Graphics g) {
        if (image == null) {
            return;
        }

        int imageWidth = image.getWidth(null);
        int imageHeight = image.getHeight(null);

        g.drawImage(image, 0, 0, null);

        for (int i = 0; i * imageWidth <= getWidth(); i++) {
            for (int j = 0; j * imageHeight <= getHeight(); j++) {
                if (i + j > 0) {
                    g.copyArea(0, 0, imageWidth, imageHeight, i * imageWidth, j * imageHeight);
                }
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}