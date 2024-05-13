package frontend;
import java.awt.*;
import javax.swing.*;

/**
 * Illustrate the scenes in Java.
 */
public class SceneShow extends JPanel
{
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.black);

        // Drawing the head of the snowman.
        g.drawOval(150, 15, 100, 100);
    }

    public void show()
    {
        JFrame f = new JFrame("Draw a snowman.");

        f.getContentPane().add(new SceneShow());
        f.setSize(700, 700);
        f.setVisible(true);
        f.setResizable(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
