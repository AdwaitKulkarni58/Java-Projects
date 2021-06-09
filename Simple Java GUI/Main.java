import java.awt.Color;
import javax.swing.*;

class Main {
  public static void main(String[] args) {
    JLabel label = new JLabel();
    JFrame frame = new JFrame();

    label.setText("Hello there!");
    label.setBackground(new Color(0, 0, 0));
    label.setForeground(new Color(255, 255, 255));
    label.setOpaque(true);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420, 420);
    frame.setVisible(true);
    frame.setTitle("First GUI program");
    frame.setResizable(false);
    frame.add(label);
  }
}
