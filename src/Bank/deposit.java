package Bank;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class deposit extends JFrame implements ActionListener {
    JPanel p1;
    JLabel l1, l2, lup, ldown;
    JTextField t1, t2;
    JButton b1;
    String n="";
	  int i;
	  int j;
    static Scanner sc = new Scanner(System.in);
    Connection conn;

    deposit() {
        JFrame f1 = new JFrame();
        p1 = new JPanel();
        f1.getContentPane();

        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        add(p1);

        t1 = new JTextField();
        t2 = new JTextField();

        b1 = new JButton("DEPOSIT");

        lup = new JLabel("Deposit Page", JLabel.CENTER);
        lup.setFont(new Font("Verdana", Font.PLAIN, 35));
        lup.setBounds(370, 100, 250, 40);
        p1.add(lup);

        l1 = new JLabel("Acc Number : ", JLabel.CENTER);
        l1.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(300, 200, size.width, size.height);
        p1.add(l1);

        l2 = new JLabel("Amount : ", JLabel.CENTER);
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
        p1.setBackground(Color.PINK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
    	
    	String acc_no=t1.getText();
    	
    	String amount=t2.getText();
    	
    	if(acc_no.length()!=0 || amount.length()!=0)
    	{
    		 try {
                 String url = "jdbc:mysql://localhost:3306/bank";
                 String user="root";
                 String pass1="Swapnil@12120131";
               
                 
                 conn = DriverManager.getConnection(url,user,pass1);
                 
                 Statement st=conn.createStatement();
                 
                 ResultSet rs = st.executeQuery("SELECT balance from acc_holder where accno='"+acc_no+"';");
                 
                 
                 while (rs.next()){
                     n = rs.getString("balance");    
                    
                      }  
                 
                 if(n.length()==0)
                 {
                	 JOptionPane.showMessageDialog(p1,"Enter Correct Details"); 
                 }
                 else
                 {
                	 i=Integer.parseInt(n); 
                     j=Integer.parseInt(amount); 

             
                      String q = "update acc_holder set balance= '"+(i+j)+"' where accno='"+acc_no+"';";

                      
             
                      st.executeUpdate(q);
                      JOptionPane.showMessageDialog(p1," Total Balnace ="+(i+j)); 
                      dashboard d=new dashboard();
                      dispose();
                	 
                 }
                

                 
                 
             } catch (SQLException e1) {
                 System.out.println(e1.getMessage());
             }finally {
                try {
                     if (conn != null) {
                         conn.close();
                     }
                 } catch (SQLException ex) {
                     System.out.println(ex.getMessage());
                 }
             }
    	}
    	else
    	{
    		 JOptionPane.showMessageDialog(p1,"Enter Correct Details"); 
    	}
    	
    
    	
    }

    public static void main(String args[]) {
        new deposit();
    }

}
