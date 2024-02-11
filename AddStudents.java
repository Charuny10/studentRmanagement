package student.result.management;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddStudents extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tfmname, tfaddress, tfphone, tfaadhar, tfemail, tfrollno;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblstdId;
    JButton add, back;
    
    AddStudents() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Students Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        JLabel labelmname = new JLabel("Mother's Name");
        labelmname.setBounds(400, 150, 150, 30);
        labelmname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelmname);
        
        tfmname = new JTextField();
        tfmname.setBounds(600, 150, 150, 30);
        add(tfmname);
        
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);
        
        JLabel labelrollno = new JLabel("Rollno.");
        labelrollno.setBounds(400, 200, 150, 30);
        labelrollno.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelrollno);
        
        tfrollno = new JTextField();
        tfrollno.setBounds(600, 200, 150, 30);
        add(tfrollno);
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        JLabel labeleducation = new JLabel("Present Course");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);
        
        String courses[] = {"BECOMPS","BEIT","BEEXTC","BEAIDS"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        add(cbeducation);
        
        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        JLabel labelstdId = new JLabel("Student id");
        labelstdId.setBounds(50, 400, 150, 30);
        labelstdId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelstdId);
        
        lblstdId = new JLabel("" + number);
        lblstdId.setBounds(200, 400, 150, 30);
        lblstdId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblstdId);
        
        add = new JButton("Add Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);
        
        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
            String mname = tfmname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String rollno = tfrollno.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String aadhar = tfaadhar.getText();
            String stdId = lblstdId.getText();
            
            try {
                Conn conn = new Conn();
                String query = "insert into student values('"+name+"', '"+mname+"', '"+dob+"', '"+rollno+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+aadhar+"', '"+stdId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new AddStudents();
    }
}
