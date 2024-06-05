package Bank;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class welcomePage implements ActionListener
{
	JFrame f0;JLabel logo;
    public welcomePage() 
    {
        f0 = new JFrame(); 
        
        JLabel welC = new JLabel("Welcome To Bank");
        welC.setFont(new Font("Verdana", Font.PLAIN, 20));
        welC.setBounds(200, 200, 400, 30);
        
        JLabel label = new JLabel(); 
        Dimension size = label.getPreferredSize(); 
        label.setBounds(50, 30, size.width, size.height); 

        JButton clk = new JButton ("Click to Continue");
        clk.setBounds(200, 250, 150, 30);
        clk.addActionListener(this);
        clk.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        f0.add(clk);
        f0.add(welC);
        f0.add(label); 
        f0.setSize(600,600);
        f0.setLayout(null);
        f0.setVisible(true);
        f0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f0.getContentPane().setBackground(Color.PINK);
		

}
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String command = e.getActionCommand();
         if(command.equals("Click to Continue"))
         {
        	 StartPage chs = new StartPage();
             f0.setVisible(false);
         }

    }
    public static void main (String [] args) 
    {
         welcomePage y = new welcomePage();
    }

}
