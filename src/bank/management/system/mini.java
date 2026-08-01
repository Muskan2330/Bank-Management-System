package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.*;

public class mini extends JFrame implements ActionListener {
    JButton button;
    String pin;
    mini(String pin){

            this.pin=pin;
        JLabel label1=new JLabel();
        label1.setBounds(20,140,400,230);
        add(label1);

        JLabel label2=new JLabel("Ansari");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3=new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4=new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);

        try{
            Conn c=new Conn();
            ResultSet resultSet=c.statement.executeQuery("select * from login where pin='"+pin+"'");
            while(resultSet.next()){
                label3.setText("Card Number :"+resultSet.getString("card_number").substring(0,4)+"XXXXXXXXXXXX"+resultSet.getString("card_number").substring(12));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{

            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin='" + pin + "'");
            int balance = 0;
            while (resultSet.next()) {
                label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));

                }
            }
                label4.setText("YOUR TOTAL BALANCE IS Rs. "+balance);

        } catch (Exception e) {
            e.printStackTrace();
        }

        button=new JButton("EXIT");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);



        getContentPane().setBackground(new Color(255,204,204));
        setLayout(null);
        setSize(400,600);
        setLocation(20,20);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }

    public static void main(String[] args){
        new mini("");
    }
}
