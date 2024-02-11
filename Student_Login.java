package student.result.management;

import javax.swing.*;
import java.awt.*;

public class Student_Login extends JFrame
{
    Student_Login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lb_username = new JLabel("Roll No.");
        lb_username.setBounds(40,20,100,30);
        add(lb_username);
        
        JTextField tx_username = new JTextField();
        tx_username.setBounds(150,20,100,30);
        add(tx_username);
        
        JLabel lb_password = new JLabel("Mother's Name");
        lb_password.setBounds(40,70,100,30);
        add(lb_password);
         
        JTextField tx_password = new JTextField();
        tx_password.setBounds(150,70,100,30);
        add(tx_password);
        
        JButton login = new JButton("Login");
        login.setBounds(150,140,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);
        
        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
        setTitle("Student Login");
        setResizable(false);
    }
    
    public static void main(String args[])
    {
        new Student_Login();
    }
}
