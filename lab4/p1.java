package swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class p1 {

    p1() {

        // Create JFrame
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Set size
        jfrm.setSize(800, 200);

        // Set layout (optional but good practice)
        jfrm.setLayout(new java.awt.BorderLayout());

        // Close operation
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JLabel
        JLabel jlab = new JLabel(
            "Hello! VI C, Welcome to Swing Programming!",
            JLabel.CENTER
        );

        // Set font and color
        jlab.setFont(new Font("Verdana", Font.PLAIN, 32));
        jlab.setForeground(Color.BLUE);

        // Add label to frame
        jfrm.add(jlab);

        // Make frame visible
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {

        SwingUtilities.invokeLater(() -> new p1());
    }
}