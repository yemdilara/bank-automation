package BankaOtomasyonu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public form1() {
        setTitle("Banka Otomasyonu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        usernameField = new JTextField();
        usernameField.setBounds(50, 20, 200, 20);
        add(usernameField);

        passwordField = new JPasswordField();
        passwordField.setBounds(50, 50, 200, 20);
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(50, 80, 100, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
        add(loginButton);

        JButton registerButton = new JButton("Üye Ol");
        registerButton.setBounds(160, 80, 100, 30);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register();
            }
        });
        add(registerButton);
    }

    private void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        
        if (isValidUser(username, password)) {
            JOptionPane.showMessageDialog(this, "Giriş Başarılı");
        } else {
            JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre hatalı");
        }
    }

    private void register() {
        JOptionPane.showMessageDialog(this, "Üye Olma Başarılı");
    }

    private boolean isValidUser(String username, String password) {
       
        return "admin".equals(username) && "password".equals(password);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form1().setVisible(true);
            }
        });
    }
}