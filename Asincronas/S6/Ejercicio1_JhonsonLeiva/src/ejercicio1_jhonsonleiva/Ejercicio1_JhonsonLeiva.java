package ejercicio1_jhonsonleiva;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author jhons
 */
public class Ejercicio1_JhonsonLeiva {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Primer JFrame");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Jhonson Humberto Leiva Salinas");
        JButton button = new JButton("Progra 3"); 
        
        panel.add(button);
        
        frame.setLocationRelativeTo(null);
        frame.add(label, BorderLayout.BEFORE_FIRST_LINE);
        frame.setSize(400, 150);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
