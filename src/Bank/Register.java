package Bank;
import java.awt.*;

import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class Register extends JFrame  {
    JPanel p1;
    JLabel l1, l2, l3, l4, l5, l6,l7,l8, lup, ldown,lacc;
    JTextField t1, t2, t3, t4, t5, t6;
    JButton b1, b2;
    ButtonGroup bg;
 
    JRadioButton r1, r2;
  
    long AccBal = 0;
    String Acc_Type;
    String AccPsd;
    String FName, MName, LName, PhoneNo, Address, Account;
    static Scanner sc = new Scanner(System.in);

    Register() {
        JFrame f1 = new JFrame();
        p1 = new JPanel();
        f1.getContentPane();

        p1.setLayout(null);
        p1.setBackground(Color.PINK);
        add(p1);
        
        bg = new ButtonGroup();
        

        r1 = new JRadioButton("Savings", false);
        r1.setActionCommand("Saving");
        r2 = new JRadioButton("Current", false);
        r2.setActionCommand("Current");
        
        bg.add(r1);
        bg.add(r2);

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        
        
        b1 = new JButton("REGISTER");
        b2=new JButton("Create ACC NO");
    
        lup = new JLabel("Registration Page", JLabel.CENTER);
        lup.setFont(new Font("Verdana", Font.PLAIN, 40));
        Dimension siz = lup.getPreferredSize();
        lup.setBounds(300, 50, siz.width, siz.height);
        p1.add(lup);

        l1 = new JLabel("First Name : ", JLabel.CENTER);
        l1.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(300, 200, size.width, size.height);
        p1.add(l1);

        l2 = new JLabel("Middle Name : ", JLabel.CENTER);
        l2.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size1 = l2.getPreferredSize();
        l2.setBounds(300, 250, size1.width, size1.height);
        p1.add(l2);

        l3 = new JLabel("Last Name : ", JLabel.CENTER);
        l3.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size2 = l3.getPreferredSize();
        l3.setBounds(300, 300, size2.width, size2.height);
        p1.add(l3);

        l4 = new JLabel("Phone Number : ", JLabel.CENTER);
        l4.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size3 = l4.getPreferredSize();
        l4.setBounds(300, 350, size3.width, size3.height);
        p1.add(l4);

        l5 = new JLabel("Address : ", JLabel.CENTER);
        l5.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size4 = l5.getPreferredSize();
        l5.setBounds(300, 400, size4.width, size4.height);
        p1.add(l5);

        l6 = new JLabel("Password : ", JLabel.CENTER);
        l6.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size6 = l6.getPreferredSize();
        l6.setBounds(300, 450, size6.width, size6.height);
        p1.add(l6);
        
        l7 = new JLabel("Acc No : ", JLabel.CENTER);
        l7.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size7 = l7.getPreferredSize();
        l7.setBounds(450, 550, size.width, size.height);
        p1.add(l7);
        
        l8 = new JLabel("ACC. No. : ", JLabel.CENTER);
        l8.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size8 = l8.getPreferredSize();
        l8.setBounds(300, 550, size.width, size.height);
        p1.add(l8);
        
        b2.setFont(new Font("Verdana", Font.PLAIN, 20));
		 b2.setBounds(400, 600, 250, 40);
		 p1.add(b2);
		 b2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
     

        ldown = new JLabel("Account Type : ", JLabel.CENTER);
        ldown.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size5 = ldown.getPreferredSize();
        ldown.setBounds(300, 500, size5.width, size5.height);
        p1.add(ldown);

        r1.setFont(new Font("Verdana", Font.PLAIN, 20));
        r1.setForeground(Color.BLACK);
        r1.setBackground(Color.WHITE);
        
        r1.setBounds(470, 500, 150, 25);
        p1.add(r1);

        r2.setFont(new Font("Verdana", Font.PLAIN, 20));
        r2.setForeground(Color.BLACK);
        r2.setBackground(Color.WHITE);
        r2.setBounds(620, 500, 150, 25);
     
        p1.add(r2);

        t1.setBounds(470, 200, 200, 30);
        t1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        p1.add(t1);

        t2.setBounds(470, 250, 200, 30);
        t2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        p1.add(t2);

        t3.setBounds(470, 300, 200, 30);
        t3.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        p1.add(t3);

        t4.setBounds(470, 350, 200, 30);
        t4.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        p1.add(t4);

        t5.setBounds(470, 400, 200, 30);
        t5.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        p1.add(t5);

        t6.setBounds(470, 450, 200, 30);
        t6.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        p1.add(t6);
        
     
        b1.setFont(new Font("Verdana", Font.PLAIN, 20));
        b1.setBounds(400, 650, 250, 60);
        p1.add(b1);
        b1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        
        
        
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	 String fname=t1.getText();
            	 String mname=t2.getText();
            	 String lname=t3.getText();
            	 String pno=t4.getText();
            	 String add=t5.getText();
            	 String pass=t6.getText();
            	
            	 String accno=l7.getText();
            	 
            	 if(fname.length()==0 || mname.length()==0 || lname.length()==0 || pno.length()==0 || add.length()==0 || pass.length()==0 || accno.length()==0)
            	 {
            		 JOptionPane.showMessageDialog(p1,"Please Register Yourself !");  
            	 }
            	 else
            	 {
            		 Connection conn = null;
            		 String atype=bg.getSelection().getActionCommand();
                	 

                	 
                     try {
                         String url = "jdbc:mysql://localhost:3306/bank";
                         String user="root";
                         String pass1="Swapnil@12120131";
                         
                         conn = DriverManager.getConnection(url,user,pass1);

                        
                         
                         String q="insert into acc_holder values('"+accno+"','"+fname+"','"+mname+"','"+lname+"','"+pno+"','"+pass+"','"+atype+"','0');";
                         
                        
                         
                         
                         Statement st=conn.createStatement();
                         st.executeUpdate(q);
                         JOptionPane.showMessageDialog(p1,"Your Registration is Succesfull"); 
                         JOptionPane.showMessageDialog(p1,"Your Account No is = "+accno); 
                         StartPage s=new StartPage();
                         dispose();
                         
                         
                         
                     } catch (SQLException e1) {
                         System.out.println(e1.getMessage());
                     } finally {
                         try {
                             if (conn != null) {
                                 conn.close();
                             }
                         } catch (SQLException ex) {
                             System.out.println(ex.getMessage());
                         }
                     }
            	 }
            	
            }
        });
        
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               int acc=(int)((Math.random()*(999-100))+100);
               l7.setText(acc+"");
            }
        });

        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

   

    public static void main(String args[]) {
        new Register();
    }

}
