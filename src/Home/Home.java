package Home;

import Auth.Login;
import Auth.Register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {
    JButton loginBtn, registerBtn;
    JPanel homePage;

    public Home() {

        Register register = new Register();
        loginBtn = new JButton("Login");
        registerBtn = new JButton("Register");

        homePage = new JPanel(new GridLayout());
        homePage.add(loginBtn);
        homePage.add(registerBtn);
        add(homePage, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        loginBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }
}
