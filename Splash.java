package student.result.management;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener
{
    Splash()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading=new JLabel("Student Result Management System");
        heading.setBounds(80, 30, 1200, 70);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.GREEN);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/background.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1170, 650);
        add(image);
        
        JButton click1 = new JButton("Admin Login");
        click1.setBounds(300,500,150,70);
        click1.setBackground(Color.BLACK);
        click1.setForeground(Color.WHITE);
        click1.addActionListener(this);
        image.add(click1);
        
        JButton click2 = new JButton("Teacher's Login");
        click2.setBounds(475,500,150,70);
        click2.setBackground(Color.BLACK);
        click2.setForeground(Color.WHITE);
        click2.addActionListener(this);
        image.add(click2);
        
        JButton click3 = new JButton("Student's Login");
        click3.setBounds(650,500,150,70);
        click3.setBackground(Color.BLACK);
        click3.setForeground(Color.WHITE);
        click3.addActionListener(this);
        image.add(click3);
        
        setSize(1170, 650);
        setLocation(150, 50);
        setVisible(true);
        setTitle("Student Result Management System");
        setResizable(false);
    }
    
    JButton click1 = new JButton("Admin Login");
    JButton click2 = new JButton("Teacher's Login");
    JButton click3 = new JButton("Student's Login");
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        //setVisible(false);
        if(ae.getActionCommand().equals(click1.getText()))
        {
            new Admin_Login();
        }
        else if(ae.getActionCommand().equals(click2.getText()))
        {
            new Teacher_Login();
        }
        else if(ae.getActionCommand().equals(click3.getText()))
        {
            new Student_Login();
        }
    }
    
    public static void main(String args[])
    {
        new Splash();
    }
}
