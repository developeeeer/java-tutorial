package projava;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class DiffSampleInherit {
    public static void main(String[] args) {
        var f = new JFrame("差分プログラミング");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var img = new BufferedImage(600, 400, BufferedImage.TYPE_INT_BGR);
        var g = img.createGraphics();
        g.setBackground(Color.WHITE);
        g.clearRect(0, 0, 600, 400);
        g.drawImage(lineImage(), 10, 10, f);
        g.drawImage(rectImage(), 300, 80, f);
        var label = new JLabel(new ImageIcon(img));
        f.add(label);
        f.pack();
        f.setVisible(true);
    }

    static BufferedImage lineImage() {
        ImageDrawer drawer = g -> g.drawLine(10,10,220,180);
        return drawer.createImage();
    }

    static BufferedImage rectImage() {
        return new RectDrawer().createImage();
    }

    @FunctionalInterface
    interface ImageDrawer {
        void draw(Graphics2D g);

        default BufferedImage createImage() {
            var image = new BufferedImage(250, 200, BufferedImage.TYPE_INT_BGR);
            var graphics = image.createGraphics();
            draw(graphics);
            return image;
        }
    }

    static class LineDrawer implements ImageDrawer {
        @Override
        public void draw(Graphics2D g) {
            g.drawLine(10,10,220,180);
        }
    }

    static class RectDrawer implements ImageDrawer {
        @Override
        public void draw(Graphics2D g) {
            g.drawRect(10, 10, 220, 180);
        }
    }

}
