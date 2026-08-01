package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    String formno;
    Signup2( String formno){

        super("APPLICATION FORM");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);
        this.formno = formno;

        JLabel l1=new JLabel(" PAGE 2 : ");
        l1.setFont(new Font("Raleway",Font.BOLD,22) );
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l3= new JLabel("RELIGION : ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,150,30);
        add(l3);
        //Drop down for religion.
        String []religion={"HINDU","MUSLIM","SIKH","CHRISTIAN","OTHERS"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,350,30);
        add(comboBox);

        JLabel l4=new JLabel("CATEGORY :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,150,30);
        add(l4);
        //drop down for category
        String[] Category={"GENERAL","OBC","ST","SC","OTHERS"};
        comboBox2=new JComboBox(Category);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,350,30);
        comboBox2.setBackground(new Color(252,208,76));
        add(comboBox2);

        JLabel l5 = new JLabel("INCOME");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,150,30);
        add(l5);
        //drop down
        String[] income ={"NULL","<1,50000","<2,50000","5,00000","Upto 10,00000","Above 10,00000"};
        comboBox3=new JComboBox(income);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setBounds(350,220,350,30);
        add(comboBox3);

        JLabel l6= new JLabel("EDUCATIONAL :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String[] education ={"NON GRADUATE","GRADUATE","POST GRADUATE","DOCTRATE","OTHERS"};
        comboBox4=new JComboBox(education);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,350,30);
        comboBox4.setBackground(new Color(252,208,76));
        add(comboBox4);

        JLabel l7=new JLabel("OCCUPATION :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,150,30);
        add(l7);

        String[] Occupation ={"SALARIED","SELF-EMPLOYEED","BUSINESS","sTUDENT","RETIRED","OTHERS"};
        comboBox5 =new JComboBox(Occupation);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,350,30);
        comboBox5.setBackground(new Color(252,208,76));
        add(comboBox5);

        JLabel l8=new  JLabel("PAN NUMBER :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,150,30);
        add(l8);
        textPan=new JTextField();
        textPan.setBounds(350,370,350,30);
        textPan.setFont(new Font("Arial",Font.BOLD,14));
        add(textPan);

        JLabel l9=new JLabel("AADHAR NUMBER :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,420,200,30);
        add(l9);
        textAadhar =new JTextField();
        textAadhar.setFont(new Font("Arial",Font.BOLD,14));
        textAadhar.setBounds(350,420,350,30);
        add(textAadhar);

        JLabel l10= new JLabel("SENIOR CITIZEN : ");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,470,200,30);
        add(l10);

        r1=new JRadioButton("YES");
        r1.setFont(new Font("Arial",Font.BOLD,14) );
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,470,100,30);
        add(r1);

        r2=new JRadioButton("NO");
        r2.setFont(new Font("Arial",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(500,470,100,30);
        add(r2);

        JLabel l11=new JLabel("EXISTING ACCOUNT : ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100, 520,200,30);
        add(l11);

        e1=new JRadioButton("YES");
        e1.setFont(new Font("Arial",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350, 520,100,30);
        add(e1);

        e2=new JRadioButton("N0");
        e2.setFont(new Font("Arial",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(500, 520,100,30);
        add(e2);

        JLabel l12 = new JLabel("FORM NO. :");
        l12.setBounds(600,10,400,30);
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setBounds(700,10,200,30);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        add(l13);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        JLabel l2 = new JLabel("ADDITIONAL DETAILS ");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);


    setLayout(null);
    setSize(850,750);
    setLocation(450,80);
    getContentPane().setBackground(new Color(252,208,76));
    setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
                    //storing data in database

        // storing combBox or drop down data in database
        String rel =(String) comboBox.getSelectedItem();
        String cate=(String) comboBox2.getSelectedItem();
        String inc=(String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ =(String) comboBox5.getSelectedItem();

        //storing textField or texts data in database
        String pan= textPan.getText();
        String aadhar=textAadhar.getText();

        //storing radiobutton data in database
        String scitizen = " ";
        if((r1.isSelected())){
            scitizen="YES";
        }else if((r2.isSelected())){
            scitizen="NO";
        }

        String eAccount=" ";
        if((r1.isSelected())){
            eAccount="YES";
        }else if((r2.isSelected())){
            eAccount="NO";
        }

        try{

            if(textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"FILL ALL TH FIELDS");
            }else{
                //storing all data in datbase
                Conn c1= new Conn();
                String q="insert into Signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ +"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }


    }

    public static void main(String[] args){
    new Signup2(" ");

    }
}
