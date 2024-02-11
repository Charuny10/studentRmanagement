package student.result.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Teacher_Login extends JFrame implements ActionListener
{
    JTextField tx_username,tx_password;
    
    Teacher_Login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lb_username = new JLabel("Username");
        lb_username.setBounds(40,20,100,30);
        add(lb_username);
        
        tx_username = new JTextField();
        tx_username.setBounds(150,20,100,30);
        add(tx_username);
        
        JLabel lb_password = new JLabel("Password");
        lb_password.setBounds(40,70,100,30);
        add(lb_password);
         
        tx_password = new JTextField();
        tx_password.setBounds(150,70,100,30);
        add(tx_password);
        
        JButton login = new JButton("Login");
        login.setBounds(150,140,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
        setTitle("Teacher Login");
        setResizable(false);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            String username = tx_username.getText();
            String password = tx_password.getText();
            
            Conn c = new Conn();
            
            String query = "select * from login where username='"+username+"' and password='"+password+"'";
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next())
            {
                setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[])
    {
        new Teacher_Login();
    }
}
