package Bank;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class checkbal extends JFrame implements ActionListener {
    JPanel p1;
    JLabel l1, l2, lup, ldown,lbal;
    JTextField t1, t2;
    JButton b1;
    Connection conn;
    String n;
    static Scanner sc = new Scanner(System.in);

    checkbal() {
        JFrame f1 = new JFrame();
        p1 = new JPanel();
        f1.getContentPane();

        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        add(p1);

        t1 = new JTextField();
        t2 = new JTextField();

        b1 = new JButton("CHECK BALANCE");
       

        lup = new JLabel("Check Balance Page", JLabel.CENTER);
        lup.setFont(new Font("Verdana", Font.PLAIN, 25));
        Dimension siz = lup.getPreferredSize();
        lup.setBounds(250, 120, siz.width, siz.height);
        p1.add(lup);

        l1 = new JLabel("Acc Number : ", JLabel.CENTER);
        l1.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(300, 200, size.width, size.height);
        p1.add(l1);

        t1.setBounds(470, 200, 200, 30);
        t1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        p1.add(t1);
        
      

        b1.setFont(new Font("Verdana", Font.PLAIN, 20));
        b1.setBounds(370, 300, 250, 40);
        p1.add(b1);
        b1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
     
        
        
        b1.addActionListener(this);
       
        
      

        lbal = new JLabel("BALANCE", JLabel.CENTER);
        lbal.setFont(new Font("Verdana", Font.PLAIN, 20));
        Dimension size5 = lbal.getPreferredSize();
        lbal.setBounds(200, 350, 500, size5.height);
       
        p1.add(lbal);

        setSize(1000, 800);
        p1.setBackground(Color.PINK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }
   
    public void actionPerformed(ActionEvent e) {

    	String acc_no=t1.getText();
    	
    	String amount=t2.getText();
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
              
             
              
              JOptionPane.showMessageDialog(p1, "BALANCE = "+n); 
              dashboard d=new dashboard();
              dispose();
              
              lbal.setText("BALANCE = "+n);
              
              
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
        new checkbal();
    }

}
