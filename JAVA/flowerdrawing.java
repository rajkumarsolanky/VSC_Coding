
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class flowerdrawing extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set the background color
        g2d.setBackground(new Color(135, 206, 235));
        g2d.clearRect(0, 0, getWidth(), getHeight());

        // Draw the stem
        g2d.setColor(new Color(0, 128, 0));
        g2d.setStroke(new BasicStroke(10));
        g2d.drawLine(150, 400, 150, 250);

        // Draw the petals
        g2d.setColor(Color.RED);
        Ellipse2D petal1 = new Ellipse2D.Double(100, 200, 100, 60);
        Ellipse2D petal2 = new Ellipse2D.Double(140, 160, 100, 60);
        Ellipse2D petal3 = new Ellipse2D.Double(180, 200, 100, 60);
        Ellipse2D petal4 = new Ellipse2D.Double(140, 240, 100, 60);
        g2d.fill(petal1);
        g2d.fill(petal2);
        g2d.fill(petal3);
        g2d.fill(petal4);

        // Draw the center of the flower
        g2d.setColor(Color.YELLOW);
        Ellipse2D center = new Ellipse2D.Double(155, 195, 30, 30);
        g2d.fill(center);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Flower Drawing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new flowerdrawing());
            frame.setSize(500, 500);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
