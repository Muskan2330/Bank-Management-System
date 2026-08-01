package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    //globally declared
    JLabel label1,label2,label3,labelName ,labelFName,DOB,labelG,labelEmail,labelMs,labelAdd,labelCity,labelPin,labelState;

    JTextField textName,textFName,textEmail,textMs,textAdd,textCity,textPin,textState;

    JDateChooser dateChooser;

    JButton next;

    //Generate Application Form number Randomly
    //It is used to generate random numbers.
    Random ran= new Random();
    //ran.nextLong() → Generates a random long number.
    //% 9000L → Limits the number so its value stays within a range related to 9000 (the remainder after dividing by 9000).
    //+ 1000L → Shifts the result upward so the value starts around 1000, with the intention of getting a 4-digit number.
    long first4=(ran.nextLong()% 9000L)+1000L;
    //Math.abs()
    //abs() means absolute value.
    //It converts a negative number into a positive number.
    String first=" "+Math.abs(first4);;

    //creating constructor
    Signup(){
        //ADD TITLE TO THE PAGE.
        super("APPLICATION FORM");

        //adding image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        //labelling
        JLabel label1 = new JLabel("APPLICATION FORM : "+first4);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("PAGE 1");
        label2.setBounds(330,80,400,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);


        JLabel label3=new JLabel("PERSONAL DETAILS");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,120,400,30);
        add(label3);

        //APPLICANT NAME
        JLabel labelName=new JLabel("NAME :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(290,190,400,30);
        add(textName);

        //APPLICANT FATHERS NAME
        JLabel labelFName = new JLabel("FATHER'S NAME :");
        labelFName.setFont(new Font("Raleway",Font.BOLD,20));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

     textFName=new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(290,240,400,30);
        add(textFName);

        JLabel DOB =new JLabel("DATE OF BIRTH: ");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,300,200,30);
        add(DOB);

        //creating calendar

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,300,400,30);
        add(dateChooser);

        //adding gender
        JLabel labelG=new JLabel("GENDER: ");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,350,200,30);
        add(labelG);

        //creating radiobutton for gender's
        r1=new JRadioButton("MALE");
        r1.setBackground(new Color(222,255,228));
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(300,350,90,30);
        add(r1);

        r2=new JRadioButton("FEMALE");
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(450,350,110,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        //for email
        JLabel labelEmail=new JLabel("EMAIL ADDRESS: ");
        labelEmail.setFont(new Font("raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail =new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        //for Martial Status
        JLabel labelMs=new JLabel("MARTIAL STATUS: ");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

   m2=new JRadioButton("MARRIED");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(300,440,100,30);
        add(m2);

 m3=new JRadioButton("UNMARRIED");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(440,440,150,30);
        add(m3);

       m1=new JRadioButton("OTHERS");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(600,440,100,30);
        add(m1);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        //for Address
        JLabel labelAdd=new JLabel("ADDRESS: ");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

       textAdd=new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        //for city
        JLabel labelCity=new JLabel("CITY: ");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        //for PIN NUMBER
        labelPin = new JLabel("PIN CODE: ");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        //for state
        JLabel labelState= new JLabel("STATE: ");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState=new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
         add(textState);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(620,700,80,30);
        next.addActionListener(this);
        add(next);

        //set frame color by using
        getContentPane().setBackground(new Color(222,255,228));
        //setting Frame
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //storing form number.
        String formno = first;

        //storing name
        String name =textName.getText();

        //storing father name
        String fname =textFName.getText();

        //storing DOB
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        //storing gender
        String gender=null;
        if(r1.isSelected()){
            gender="MALE";
        }else if(r2.isSelected()){
            gender="FEMALE";

        }

        //storing email address
        String email = textEmail.getText();

        //storing martial status
        String martial=null;
        if(m1.isSelected()){
            martial="OTHERS";

        }else if(m2.isSelected()){
            martial="MARRIED";
        }else if(m3.isSelected()){
            martial="UNMARRIED";
        }

        //storing address
        String address=textAdd.getText();

        //storing city
        String city=textCity.getText();

        //storing pin code
        String pincode=textPin.getText();

        //storing state
        String state=textState.getText();

        try{
            //if user not mentioned their mandatory details then it is not moved to next page-->so the code is below
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Conn con1=new Conn();
                //storing data into table
                String q= "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                //this is use for enter or input the value into the tables.
                con1.statement.executeUpdate(q);
                //after inserting a value then it go to new class or new page
                new Signup2(formno);//random form number
                //for closing signup class
                setVisible(false);


            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Signup();

    }
}
