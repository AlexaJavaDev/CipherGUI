import javax.swing.*;
import java.awt.*;

public class CipherGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Шифратор v1.0.1");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField inputField = new JTextField();
        inputField.setMaximumSize(new Dimension(300, 30));
        JButton encryptButton = new JButton("Зашифровать");
        JButton decryptButton = new JButton("Расшифровать");
        JLabel resultLabel = new JLabel();
        frame.add(Box.createVerticalStrut(10));
        frame.add(inputField);
        frame.add(Box.createVerticalStrut(10));

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(encryptButton);
        buttonPanel.add(decryptButton);
        frame.add(buttonPanel);
        frame.add(Box.createVerticalStrut(5));

        JPanel resultPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        resultPanel.add(resultLabel);
        frame.add(resultPanel);

        frame.add(Box.createVerticalGlue());

        encryptButton.addActionListener(e -> {
            String text = inputField.getText();
            String encrypted = Cipher.encrypt(text);
            resultLabel.setText(encrypted);
        });

        decryptButton.addActionListener(e -> {
            String text = inputField.getText();
            String decrypted = Cipher.decrypt(text);
            resultLabel.setText(decrypted);
        });

        frame.setSize(350, 220);
        frame.setVisible(true);
    }
}
