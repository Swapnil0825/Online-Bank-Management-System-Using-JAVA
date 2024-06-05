package Bank;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartPage extends JFrame implements ActionListener {
    JPanel p1;
    JLabel l1, l2, l3, l4;
    JTextField t1;
    JButton b1, b2, b3;

    StartPage() {
        JFrame f1 = new JFrame();
        p1 = new JPanel();
        f1.getContentPane();

        p1.setLayout(null);
        p1.setBackground(Color.PINK);
        add(p1);

        b1 = new JButton("Register");
        b2 = new JButton("Login");
        b3 = new JButton("Exit");

        l1 = new JLabel("Welcome to the BANK!", JLabel.CENTER);
        l1.setFont(new Font("Verdana", Font.PLAIN, 30));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(300, 120, size.width, size.height);
        p1.add(l1);

        b1.setFont(new Font("Verdana", Font.PLAIN, 30));
        b1.setBounds(350, 200, 250, 40);
        p1.add(b1);
        b1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        b2.setFont(new Font("Verdana", Font.PLAIN, 30));
        b2.setBounds(350, 350, 250, 40);
        p1.add(b2);
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        b3.setFont(new Font("Verdana", Font.PLAIN, 30));
        b3.setBounds(350, 500, 250, 40);
        p1.add(b3);
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        f1.getContentPane().setBackground(Color.PINK);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        Object cmd = e.getSource();
        if (cmd == b1) {
            Register r1 = new Register();
            this.setVisible(false);
            } else if (cmd == b2) {
            login l1 = new login();
            // l1.setVisible(true);
            // this.setVisible(false);
        } else if (cmd == b3) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new StartPage();
    }

}