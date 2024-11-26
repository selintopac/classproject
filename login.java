import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;



    public LoginScreen() [
        setTitle("Login");
        setSize(300, 150);

        JPanel panel = new JPanel();

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(30);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(30);
        panel.add(passwordField);

        JButton loginButton = new JButton("Login");
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String username = usernameField.getText();
                String password = passwordField.getText();
                boolean loginSuccess = LoginController.autehnticate(username, password);
                if (loginSuccess) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password.");
                }
            }
        }

    setVisible(true);
}

public class LoginController {
    public static boolean authenticate(String username, String password) {
        String validUsername = "example";
        String validPassword = "password";

        return username.equals(validUsername) && password.equals(validPassword);
    }
}