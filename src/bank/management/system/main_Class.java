package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
        JButton b1,b2,b3,b4,b5,b6,b7;
        String pin;

        main_Class(String pin){

            this.pin =pin;
            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
            Image i2=i1.getImage().getScaledInstance(1550,730,Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image=new JLabel(i3);
            image.setBounds(0,0,1550,730);
            add(image);

            JLabel label=new JLabel("PLEASE SELECT YOUR TRANSACTION");
            label.setBounds(415,170,700,35);
            label.setForeground(Color.white);
            label.setFont(new Font("System",Font.BOLD,22));
            image.add(label);

            b1=new JButton("DEPOSIT");
            b1.setForeground(Color.white);
            b1.setBackground(new Color(65,125,128));
            b1.setBounds(410,234,150,35);
            b1.addActionListener(this);
            image.add(b1);

            b2=new JButton("CASH WITHDRAW");
            b2.setForeground(Color.white);
            b2.setBackground(new Color(65,125,128));
            b2.setBounds(700,234,150,35);
            b2.addActionListener(this);
            image.add(b2);

            b3=new JButton("FAST CASH");
            b3.setForeground(Color.white);
            b3.setBackground(new Color(65,125,128));
            b3.setBounds(410,274,150,35);
            b3.addActionListener(this);
            image.add(b3);

            b4= new JButton("MINI STATEMENT");
            b4.setForeground(Color.white);
            b4.setBackground(new Color(65,125,128));
            b4.setBounds(700,274,150,35);
            b4.addActionListener(this);
            image.add(b4);

            b5=new JButton("PIN CHANGE");
            b5.setForeground(Color.white);
            b5.setBackground((new Color(65,125,128)));
            b5.setBounds(410,314,150,35);
            b5.addActionListener(this);
            image.add(b5);

            b6=new JButton("BALANCE ENQUIRY");
            b6.setForeground(Color.white);
            b6.setBackground(new Color(65,125,128));
            b6.setBounds(700,314,150,35);
            b6.addActionListener(this);
            image.add(b6);

            b7=new JButton("EXIT");
            b7.setForeground(Color.white);
            b7.setBackground(new Color(65,125,128));
            b7.setBounds(550,364,150,35);
            b7.addActionListener(this);
            image.add(b7);

            setLayout(null);
            setSize(1550,1080);
            setLocation(0,0);
            setUndecorated(true); //remove minimize ,cross button and full screen button;
            setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==b1){
                new Deposit(pin);
                setVisible(false); //frame is stop.
            }else if(e.getSource()==b7){
                System.exit(0); //program is stop
            }else if(e.getSource()==b2){
                new Withdrawl(pin);
                setVisible(false);
            }else if(e.getSource()==b6){
                new BalanceEnquiry(pin);
                setVisible(false);
            }else if(e.getSource()==b3){
                new FastCash(pin);
                setVisible(false);
            }else if(e.getSource()==b5){
                new Pin(pin);
                setVisible(false);
            }else if(e.getSource()==b4){
                new mini(pin);
                setVisible(false);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        new main_Class("");
    }
}
