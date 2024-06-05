package Bank;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {
    JPanel p1;
    JLabel l1, l2, lup, ldown;
    JTextField t1, t2;
    JButton b1;
	Connection conn;
    static Scanner sc = new Scanner(System.in);

    login() {
        JFrame f1 = new JFrame();
        p1 = new JPanel();
        f1.getContentPane();

        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        add(p1);

        t1 = new JTextField();
        t2 = new JTextField();

        b1 = new JButton("LOGIN");

        lup = new JLabel("Login Page", JLabel.CENTER);
        lup.setFont(new Font("Verdana", Font.PLAIN, 30));
        lup.setBounds(370, 100, 250, 40);
        p1.add(lup);

        l1 = new JLabel("Acc Number : ", JLabel.CENTER);
        l1.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(300, 200, size.width, size.height);
        p1.add(l1);

        l2 = new JLabel("Password : ", JLabel.CENTER);
        l2.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size1 = l2.getPreferredSize();
        l2.setBounds(300, 250, size1.width, size1.height);
        p1.add(l2);

        t1.setBounds(470, 200, 200, 30);
        t1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        p1.add(t1);

        t2.setBounds(470, 250, 200, 30);
        t2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        p1.add(t2);

        b1.setFont(new Font("Verdana", Font.PLAIN, 20));
        b1.setBounds(370, 300, 250, 40);
        p1.add(b1);
        b1.addActionListener(this);
        b1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        p1.setBackground(Color.PINK);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
    
    	String acc=t1.getText();
    	String pass=t2.getText();
    	
    	
    	 try {
             String url = "jdbc:mysql://localhost:3306/bank";
             String user="root";
             String pass1="Swapnil@12120131";
             
             conn = DriverManager.getConnection(url,user,pass1);

            
             
             String q="select accno,pass from acc_holder where accno= '"+acc+"' AND pass= '"+pass+"';";
             
         
             Statement st=conn.createStatement();
             ResultSet rs = st.executeQuery(q);
             if(rs.next())
             {
            	 dashboard d=new dashboard();
            	 dispose();
             }
             else
             {
            	 JOptionPane.showMessageDialog(p1,"Invalid Details.");  
             }
             
             
             
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

    public static void main(String args[]) {
        new login();
    }

}
