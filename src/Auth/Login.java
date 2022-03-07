package Auth;

import Home.WelcomePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JPanel loginForm;
    JTextField username, password;
    JLabel userLabel, passLabel;
    JButton login;

    public Login() {
        userLabel = new JLabel();
        userLabel.setText("UserName");

        passLabel = new JLabel();
        passLabel.setText("Password");

        username = new JTextField();
        password = new JPasswordField();
        login = new JButton("Login");

        loginForm = new JPanel(new GridLayout(3, 1));
        loginForm.add(userLabel);
        loginForm.add(username);
        loginForm.add(passLabel);
        loginForm.add(password);
        loginForm.add(login);

        add(loginForm, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        login.addActionListener(this);
        setTitle("LoginForm");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userNameVal = username.getText();
        String passwordVal = password.getText();

        if(userNameVal.equals("ahmad") && passwordVal.equals("123456")) {
            this.dispose();
            WelcomePage welcomePage = new WelcomePage();
        } else {

        }
    }
}
