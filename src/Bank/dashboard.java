package Bank;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dashboard extends JFrame implements ActionListener {
    JPanel p1;
    JLabel l1, l2, l3, l4;
    JTextField t1;
    JButton b1, b2, b3, b4,b5;

    dashboard() {
        JFrame f1 = new JFrame();
        p1 = new JPanel();
        f1.getContentPane();

        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        add(p1);

        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Check Balance");
        b4 = new JButton("Exit");
        b5 = new JButton("Transfer");

        l1 = new JLabel("Account Dashboard");
        l1.setFont(new Font("Verdana", Font.PLAIN, 25));
        l1.setBounds(370, 20, 250, 40);
        p1.add(l1);
        
        
        b1.setFont(new Font("Verdana", Font.PLAIN, 30));
        b1.setBounds(300, 120, 350, 40);
        p1.add(b1);
        b1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        b2.setFont(new Font("Verdana", Font.PLAIN, 30));
        b2.setBounds(300, 270, 350, 40);
        p1.add(b2);
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        b3.setFont(new Font("Verdana", Font.PLAIN, 30));
        b3.setBounds(300, 420, 350, 40);
        p1.add(b3);
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        b4.setFont(new Font("Verdana", Font.PLAIN, 30));
        b4.setBounds(300, 720, 350, 40);
        p1.add(b4);
        b4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        b5.setFont(new Font("Verdana", Font.PLAIN, 30));
        b5.setBounds(300, 570, 350, 40);
        p1.add(b5);
        b5.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setSize(1000, 1000);
        p1.setBackground(Color.PINK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        Object cmd = e.getSource();
        if (cmd == b1) {
            deposit r1 = new deposit();
            dispose();
        } else if (cmd == b2) {
            withdraw l1 = new withdraw();
            dispose();
        } else if (cmd == b3) {
            checkbal c1 = new checkbal();
            dispose();
        } else if (cmd == b4) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new dashboard();
    }

}