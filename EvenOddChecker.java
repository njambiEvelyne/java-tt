import javax.swing.*;
import java.awt.event.*;

public class EvenOddChecker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Even or Odd");

        JTextField textField = new JTextField();
        JButton button = new JButton("Check");
        JLabel label = new JLabel("Result will appear here");

        textField.setBounds(50, 30, 200, 30);
        button.setBounds(50, 70, 200, 30);
        label.setBounds(50, 110, 200, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(textField.getText());
                label.setText(num % 2 == 0 ? "Even Number" : "Odd Number");
            }
        });

        frame.add(textField);
        frame.add(button);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
