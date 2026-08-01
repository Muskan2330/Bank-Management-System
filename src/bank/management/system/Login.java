package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    //creating label,textfield and button globally
    JLabel label1,label2,label3;

    JTextField textField2;

    JPasswordField passwordField3;

    JButton button1,button2,button3;

    //creating constructor
    Login(){
        //write titleby using super function
        super("Bank Management System...");

        //adding image1 which is bank logo
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        //scaling image
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        //scaled image is coverted into image icon.
        ImageIcon i3=new ImageIcon(i2);
        //Labeling an image
        JLabel image=new JLabel(i3);
        //where the image will be visible and what place
        image.setBounds(350,10,100,100);
        //adding image to the frame
        add(image);

        //adding image2 which is card
        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        //scaling image
        Image ii2=ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        //scaled image is coverted into image icon.
        ImageIcon ii3=new ImageIcon(ii2);
        //Labeling an image
        JLabel iimage=new JLabel(ii3);
        //where the image will be visible and what place
        iimage.setBounds(630,350,100,100);
        //adding image to the frame
        add(iimage);

        // showing text to the frame with the help of JLabel
        label1 =new JLabel("WELCOME TO ATM");
        //set text color
        label1.setForeground(Color.white);
        //set font style to text
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        //set boundaries to the text with the frame.
        label1.setBounds(230,150,450,40);
        //adding label to the frame.
        add(label1);

        // adding card no. to the frame.
        label2=new JLabel("CARD NUMBER:");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(150,200,375,40);
        add(label2);

        //adding textField for card number.
        textField2=new JTextField(15);
        textField2.setBounds(385,200,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        //adding PIN to the frame
        label3 =new JLabel("PIN NUMBER:");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);

        //adding PasswordField for PIN.
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(385,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        //adding signin sign up and clear button

        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);





        //set background color by adding an image
        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        //scaling image
        Image iii2=iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        //scaled image is coverted into image icon.
        ImageIcon iii3=new ImageIcon(iii2);
        //Labeling an image with the help of JLabel.
        JLabel iiimage=new JLabel(iii3);
        //where the image will be visible and what place
        iiimage.setBounds(0,0,850,480);
        //adding image to the frame
        add(iiimage);











        setLayout(null);
        //set size of Frame
        setSize(850,480);
        //frame open at the center
        //x=450 means frame shift from left to right side.
        //y=200 measn frame shift from top to bottom.
        setLocation(450,200);

        //set frame visibility
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1){
                Conn c=new Conn();
                String cardno=textField2.getText();
                String pin = passwordField3.getText();
                String q="select * from login where card_number ='"+cardno+"' and pin='"+pin+"'";
                ResultSet resultSet=c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else{
                    JOptionPane.showMessageDialog(null,"INCORRECT CARD NUMBER OR PIN");
                }

            } else if (e.getSource()==button2) {
                //clearing text if we clicked on clear button.
                textField2.setText(" ");
                passwordField3.setText(" ");
            }else if(e.getSource()==button3){
                new Signup();
                setVisible(false);

            }


        }catch(Exception E){
            //shows errors
            E.printStackTrace();
        }

    }

    public static void main(String[] args){

        //constructor object
        new Login();

    }
}
