package bank.management.system;
import com.mysql.cj.protocol.Resultset;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton deposit, withdrawel ,fastCash, miniStatement, balEnquiry, exit, pinchange;
    String pinnumber;
            
    FastCash(String pinnumber)  {
        
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("SELECT WITHDRAWAL AMOUNT");
        text.setBounds(215, 300, 700, 30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        deposit = new JButton("Rs.100");
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawel = new JButton("Rs.500");
        withdrawel.setBounds(355, 415, 150, 30);
        withdrawel.addActionListener(this);
        image.add(withdrawel);
        
        fastCash = new JButton("Rs. 1000");
        fastCash.setBounds(170, 450, 150, 30);
        fastCash.addActionListener(this);
        image.add(fastCash);
        
        miniStatement = new JButton("Rs. 2000");
        miniStatement.setBounds(355, 450, 150, 30);
        miniStatement.addActionListener(this);
        image.add(miniStatement);
        
        pinchange = new JButton("Rs.5000");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balEnquiry = new JButton("Rs.10000");
        balEnquiry.setBounds(355, 485, 150, 30);
        balEnquiry.addActionListener(this);
        image.add(balEnquiry);
        
        exit = new JButton("Back");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        setSize(900, 900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource() == exit) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }else {
            String amount = ((JButton)ae.getSource()).getText().substring(3); // For removing Rs_ from Rs 100 and others
            Conn conn = new Conn();
            try {
                ResultSet rs = conn.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next()){
                    if (rs.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if (ae.getSource() != exit && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insuffecient balance");
                    return;
                }
                
                Date date = new Date();
                conn.s.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs "+amount+ " Debited Successfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    

    public static void main(String args[]) {
        
        new FastCash("");
    }
}
