import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // 1. Create the main frame (window)
        JFrame frame = new JFrame("Swing GUI Example");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set custom icon (replace with your image path)
        ImageIcon icon = new ImageIcon("logo.png");
        frame.setIconImage(icon.getImage());

        // 2. Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(null); // using absolute layout for simplicity

        // 3. JLabel with text
        JLabel nameLabel = new JLabel("Nishchal Acharya");
        nameLabel.setBounds(20, 20, 200, 30);
        panel.add(nameLabel);

        // 4. JLabel with icon
        JLabel iconLabel = new JLabel(icon);
        iconLabel.setBounds(250, 20, 100, 100);
        panel.add(iconLabel);

        // 5. JTextField with tooltip and colored border
        JTextField textField = new JTextField();
        textField.setBounds(20, 70, 150, 30);
        textField.setToolTipText("Enter your name");
        textField.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        panel.add(textField);

        // 6. JTextArea with scroll bars
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(
                textArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
        );
        scrollPane.setBounds(20, 120, 200, 80);
        panel.add(scrollPane);

        // 7. JCheckBox
        JCheckBox checkBox = new JCheckBox("I agree to terms");
        checkBox.setBounds(20, 220, 150, 30);
        panel.add(checkBox);

        // 8. JPasswordField
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20, 260, 150, 30);
        passwordField.setToolTipText("Enter your password");
        panel.add(passwordField);

        // 9. JRadioButton
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(20, 300, 70, 30);
        female.setBounds(100, 300, 80, 30);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        panel.add(male);
        panel.add(female);

        // 10. JButton (push button)
        JButton button = new JButton("Submit");
        button.setBounds(20, 350, 100, 30);
        panel.add(button);

        // 11. JComboBox (drop-down)
        String[] courses = {"BCA", "BIM", "CSIT"};
        JComboBox<String> comboBox = new JComboBox<>(courses);
        comboBox.setBounds(150, 350, 100, 30);
        panel.add(comboBox);

        // Add panel to frame and make it visible
        frame.add(panel);
        frame.setVisible(true);
    }
}
