import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

class Main {
  public static void main(String[] args) {
    JLabel label = new JLabel();
    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon("testImage.jpg");

    label.setIcon(image);
    label.setText("The Iconic Trio");
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setBounds(100, 100, 250, 250);
    label.setIconTextGap(15);
    label.setFont(new Font("Elegant", Font.ITALIC, 20));
    label.setBackground(new Color(0, 0, 0));
    label.setForeground(new Color(255, 255, 255));
    label.setOpaque(true);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setTitle("First GUI program");
    frame.setResizable(false);
    frame.add(label);
    frame.pack();
  }
}
