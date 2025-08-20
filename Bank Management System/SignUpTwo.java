package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener{
    
    JTextField Pan, adhar;
    JButton nextButton;
    JRadioButton sYes, sNo, exYes, exNo;
    JComboBox religion, categoryValue, income, qualification, occupation;
    String formno;
    
    
    SignUpTwo(String formno) {
        
        this.formno = formno;
        setLayout(null);
        
        setTitle("New Account Application Form - Page 2");
        
        
        JLabel additionalDetail = new JLabel("Page 2: Additional Details");
        additionalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetail.setBounds(290, 80, 400, 30);
        add(additionalDetail);
        
        JLabel name = new JLabel("Religion: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 200, 30);
        add(name);
        
        
        String[] valReligion = {"Hindu", "Muslim", "Sikh", "Christian"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
    
        
        JLabel category = new JLabel("Category: ");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String[] valCategory = {"General", "SC", "ST", "OBC", "Other"};
        categoryValue = new JComboBox(valCategory);
        categoryValue.setBounds(300, 190, 400, 30);
        categoryValue.setBackground(Color.WHITE);
        add(categoryValue);
        
        JLabel dob = new JLabel("Income: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String[] valIncome = {"NULL", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
                
        JLabel educational = new JLabel("Educational ");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);
        
        
        JLabel email = new JLabel("Qualification: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        String[] valQualification = {"Non - Graduation", "Graduate", "Post Graduate", "Doctorate", "Others"};
        qualification = new JComboBox(valQualification);
        qualification.setBounds(300, 310, 400, 30);
        qualification.setBackground(Color.WHITE);
        add(qualification);
        
        
        JLabel maritalStatus = new JLabel("Occupation: ");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalStatus.setBounds(100, 390, 200, 30);
        add(maritalStatus);
        
        String[] valOccupation = {"Salaried", "Self - Employeed", "Business", "Student", "Retired", "Others"};
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        JLabel pan = new JLabel("PAN Number: ");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);
        
        Pan = new JTextField();
        Pan.setFont(new Font("Raleway", Font.BOLD, 14));
        Pan.setBounds(300, 440, 400, 30);
        add(Pan);
        
        JLabel adharNo = new JLabel("Adhar Number: ");
        adharNo.setFont(new Font("Raleway", Font.BOLD, 20));
        adharNo.setBounds(100, 490, 200, 30);
        add(adharNo);
        
        adhar = new JTextField();
        adhar.setFont(new Font("Raleway", Font.BOLD, 14));
        adhar.setBounds(300, 490, 400, 30);
        add(adhar);
        
        JLabel senior = new JLabel("Senior Citizen: ");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30);
        add(senior);
        
        sYes = new JRadioButton("Yes");
        sYes.setBackground(Color.WHITE);
        sYes.setBounds(300, 540, 100, 30);
        add(sYes);
        
        sNo = new JRadioButton("No");
        sNo.setBackground(Color.WHITE);
        sNo.setBounds(420, 540, 100, 30);
        add(sNo);
        
        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(sYes);
        seniorGroup.add(sNo);
        
        JLabel existingAcc = new JLabel("Existing Account: ");
        existingAcc.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAcc.setBounds(100, 590, 200, 30);
        add(existingAcc);
        
        exYes = new JRadioButton("Yes");
        exYes.setBackground(Color.WHITE);
        exYes.setBounds(300, 590, 100, 30);
        add(exYes);
        
        exNo = new JRadioButton("No");
        exNo.setBackground(Color.WHITE);
        exNo.setBounds(420, 590, 100, 30);
        add(exNo);
        
        ButtonGroup existingAccGroup = new ButtonGroup();
        existingAccGroup.add(exYes);
        existingAccGroup.add(exNo);
        
        
        nextButton = new JButton("Next");
        nextButton.setBounds(620, 660, 80, 30);
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(this);
        add(nextButton);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
         String sreligion =(String) religion.getSelectedItem();
         String scategory = (String) categoryValue.getSelectedItem();
         String sincome = (String) income.getSelectedItem();
         String seducation = (String) qualification.getSelectedItem();
         String soccupation = (String) occupation.getSelectedItem();
         String seniorCitizen = null;
         if (sYes.isSelected()) {
             seniorCitizen = "Yes";
        } else if (sNo.isSelected()) {
            seniorCitizen = "No";
        }
   
         String ExistingAccount = null;
         if (exYes.isSelected()) {
            ExistingAccount = "Yes";
        }else if (exNo.isSelected()) {
            ExistingAccount = "No";
        }
         String span = Pan.getText();
         String sadhar = adhar.getText();
         
         try {
                 Conn c = new Conn();
                 String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+seniorCitizen+"','"+ExistingAccount+"')";
                 c.s.executeUpdate(query);
                 
                 setVisible(false);
                 
                 new SignUpThree(formno).setVisible(true);
                 
             
        } 
         catch (Exception e) {
             System.out.println(e);
        }
         
    }
    
    public static void main(String args[]) {
        new SignUpTwo("");
    }
}