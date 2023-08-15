package bank.management.system;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class SignUpThree extends JFrame implements ActionListener{

    JRadioButton savAcc, fdAcc, currAcc, recurrAcc;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;
            
    SignUpThree(String formno) {
        this.formno = formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40 );
        add(l1);
        
        JLabel l2 = new JLabel("Account Type");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(100, 140, 200, 30);
        add(l2);
        
        savAcc = new JRadioButton("Saving Account");
        savAcc.setFont(new Font("Raleway", Font.BOLD, 15));
        savAcc.setBackground(Color.WHITE);
        savAcc.setBounds(100, 180, 200, 30 );
        add(savAcc);
        
        fdAcc = new JRadioButton("Fixed Deposit Account");
        fdAcc.setFont(new Font("Raleway", Font.BOLD, 15));
        fdAcc.setBackground(Color.WHITE);
        fdAcc.setBounds(350, 180, 200, 30 );
        add(fdAcc);
        
        currAcc = new JRadioButton("Current Account");
        currAcc.setFont(new Font("Raleway", Font.BOLD, 15));
        currAcc.setBackground(Color.WHITE);
        currAcc.setBounds(100, 220, 200, 30 );
        add(currAcc);
        
        recurrAcc = new JRadioButton("Recurring Deposit Account");
        recurrAcc.setFont(new Font("Raleway", Font.BOLD, 15));
        recurrAcc.setBackground(Color.WHITE);
        recurrAcc.setBounds(350, 220, 250, 30 );
        add(recurrAcc);
        
        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(savAcc);
        accountGroup.add(fdAcc);
        accountGroup.add(currAcc);
        accountGroup.add(recurrAcc);
        
        JLabel cardNo = new JLabel("Card Number:");
        cardNo.setFont(new Font("Raleway", Font.BOLD, 22));
        cardNo.setBounds(100, 300, 200, 40 );
        add(cardNo);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 300, 300, 40 );
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 digit card number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 330, 300, 20 );
        add(carddetail);
        
        JLabel pinNo = new JLabel("Pin Number:");
        pinNo.setFont(new Font("Raleway", Font.BOLD, 22));
        pinNo.setBounds(100, 370, 200, 40 );
        add(pinNo);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 375, 300, 30 );
        add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 digit Pin number");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 400, 300, 20 );
        add(pindetail);
        
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 250, 40 );
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        c1.setBackground(Color.WHITE);
        add(c1); 
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        c2.setBackground(Color.WHITE);
        add(c2);
                
        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        c3.setBackground(Color.WHITE);
        add(c3);
                
        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 500, 200, 30);
        c4.setBackground(Color.WHITE);
        add(c4);
                
        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        c5.setBackground(Color.WHITE);
        add(c5);
                
        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 500, 200, 30);
        c6.setBackground(Color.WHITE);
        add(c6);
               
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBackground(Color.WHITE);
        c7.setBounds(100, 680, 600, 30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);
                
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(450, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accountType = "";
            if(savAcc.isSelected()){
                accountType = "Savings Account";
            }else if(fdAcc.isSelected()){
                accountType = "Fixed Deposit";
            }else if (currAcc.isSelected()) {
                accountType = "Current Account";
            }else if (recurrAcc.isSelected()) {
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs(random.nextLong() % 90000000L + 5040936000000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if (c1.isSelected()) {
                facility = facility + " ATM CARD";
            }else if (c2.isSelected()) {
                facility += " Internet Banking";
            }else if (c3.isSelected()) {
                facility += " Mobile Banking";
            }else if (c4.isSelected()) {
                facility += " Email & SMS Alerts";
            }else if (c5.isSelected()) {
                facility += " Cheque Book";
            }else if (c6.isSelected()) {
                facility += " E-Statements";
            }
            
            try {
                if (accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account Type is required");
                }else{
                    Conn con = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";

                    con.s.executeUpdate(query1);
                    con.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                }
                {
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }else if (ae.getSource()==cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String args[]) {
        new SignUpThree("");

    }
}
