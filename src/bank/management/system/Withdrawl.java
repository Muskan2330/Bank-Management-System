package bank.management.system;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton b1,b2;
        Withdrawl(String pin){
                this.pin=pin;

            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
            Image i2=i1.getImage().getScaledInstance(1550,730,Image.SCALE_DEFAULT);
            ImageIcon i3= new ImageIcon(i2);
            JLabel l3=new JLabel(i3);
            l3.setBounds(0,0,1550,730);
            add(l3);

            JLabel label1=new JLabel("MAXIMUM WITHDRAWL IS Rs.10,000");
            label1.setFont(new Font("System",Font.BOLD,16));
            label1.setBounds(460,180,400,35);
            label1.setForeground(Color.white);
            //label or text will be shown on image
            l3.add(label1);

            textField=new JTextField();
            textField.setBounds(460,260,320,25);
            textField.setBackground(new Color(65,125,128));
            textField.setForeground(Color.white);
            textField.setFont(new Font("Raleway",Font.BOLD,20));
            l3.add(textField);

            JLabel label2=new JLabel("PLEASE ENTER YOUR AMOUNT");
            label2.setFont(new Font("System",Font.BOLD,16));
            label2.setBounds(460,220,400,35);
            label2.setForeground(Color.white);
            //label or text will be shown on image
            l3.add(label2);

            //button for deposit
            b1=new JButton("WITHDRAW");
            b1.setBounds(700,316,150,35);
            b1.setBackground(new Color(65,125,128));
            b1.setForeground(Color.white);
            b1.addActionListener(this);
            l3.add(b1);

            b2=new JButton("BACK");
            b2.setBounds(700,362,150,35);
            b2.setForeground(Color.white);
            b2.setBackground(new Color(65,125,128));
            b2.addActionListener(this);
            l3.add(b2);

            setLayout(null);
            setSize(1550,1080);
            setLocation(0,0);
            setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b1) {
                try {

                    String amount = textField.getText();
                    Date date = new Date();
                    if (textField.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "PLEASE ENTER THE AMOUNT YOU WANT TO WITHDRAW");
                    } else {
                        Conn c = new Conn();
                        ResultSet resultSet = c.statement.executeQuery("select * from bank where pin='" + pin + "'");
                        int balance = 0;
                        while (resultSet.next()) {
                            if (resultSet.getString("type").equals("Deposit")) {
                                balance += Integer.parseInt(resultSet.getString("amount"));
                            } else {
                                balance -= Integer.parseInt(resultSet.getString("amount"));

                            }
                        }
                        //if user will enter the amount that is not sufficient from the account then this message will be shown

                        if (balance < Integer.parseInt(amount)) {
                            JOptionPane.showMessageDialog(null, "INSUFFICIENT BALANCE");
                            return;
                        }
                        //if user will withdraw then we can update
                        c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdrawl','" + amount + "')");
                        JOptionPane.showMessageDialog(null, "Rs. " + amount + "DEBITED SUCCESSFULLY");
                        setVisible(false);
                        new main_Class(pin);

                    }

                } catch (Exception E) {
                    E.printStackTrace();
                }
            }else if(e.getSource()==b2){
                setVisible(false);
                new main_Class(pin);
            }

    }

    public static void main(String args[]){
        new Withdrawl("");
    }
}
