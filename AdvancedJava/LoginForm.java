import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static void main(String[] args) {
        // Create the frame (window)
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));

        // Create components
        JLabel userLabel = new JLabel(" Username:");
        JTextField userField = new JTextField();
        
        JLabel passLabel = new JLabel(" Password:");
        JPasswordField passField = new JPasswordField();
        
        JButton loginButton = new JButton("Login");

        // Add components to frame
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(new JLabel("")); // Empty space for layout
        frame.add(loginButton);

        // Add action listener to button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                // Authentication logic
                if (username.equals("admin") && password.equals("admin")) {
                    System.out.println("access granted");
                } else {
                    System.out.println("access denied");
                }
            }
        });

        // Display the window
        frame.setVisible(true);
    }
}