import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private JButton button = new JButton("BUTTON");

    public GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Productivity Project");
        getContentPane().setBackground(new java.awt.Color(147, 201, 147));

        // Sets the location and size of the frame and makes it visible
        setSize(400, 500);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 1));

        JPanel panel = new JPanel();
        add(panel);
        panel.add(button);

        pack();
        setVisible(true);
    }




    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}