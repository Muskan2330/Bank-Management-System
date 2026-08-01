package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1 ,c2,c3,c4,c5,c6;
    JButton s,c;

    String formno;
    Signup3(String formno){
        super("");

        this.formno = formno;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1= new JLabel("PAGE 3 : ");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2=new JLabel("ACCOUNT DETAILS :");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3=new JLabel("ACCOUNT TYPE :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds( 100,140,200,40);
        add(l3);

        r1=new JRadioButton("SAVING ACCOUNT");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(100,180,250,30);
        r1.setBackground(new Color(215,252,252));
        add(r1);

        r2=new JRadioButton("FIXED DEPOSIT ACCOUNT");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(350,180,300,30);
        r2.setBackground(new Color(215,252,252));
        add(r2);

        r3=new JRadioButton("CURRENT ACCOUNT");
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100,220,250,30);
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        add(r3);

        r4=new JRadioButton("RECURRING DEPOSIT ACCOUNT");
        r4.setBounds(350,220,350,30);
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(215,252,252));
        add(r4);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4=new JLabel("CARD NUMBER. :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5=new JLabel("( YOUR 16-DIGIT CARD NO. )");
        l5.setBounds(100,330,200,20);
        l5.setFont(new Font("Raleway",Font.PLAIN,12));
        add(l5);

        JLabel l6=new JLabel("XXX-XXXX-XXXX-4843");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,300,30);
        add(l6);

        JLabel l7=new JLabel("(IT WOULD APPEAR ON ATM CARD / CHEQUE BOOK AND STATEMENT)");
        l7.setBounds(330,330,650,20);
        l7.setFont(new Font("Raleway",Font.PLAIN,12));
        add(l7);

        JLabel l8=new JLabel("PIN : ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9=new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10=new JLabel("(4-DIGIT PASSWORD)");
        l10.setFont(new Font("Raleway",Font.PLAIN,12));
        l10.setBounds(100,400,400,20);
        add(l10);


        JLabel l11=new JLabel("SERVICES REQUIRED : ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,300,30);
        add(l11);

        c1=new JCheckBox("ATM CARD ");
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        c1.setBackground(new Color(215,252,252));
        c1.setBounds(100,500,150,30);
        add(c1);

        c2=new JCheckBox("NET BANKING");
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        c2.setBackground(new Color(215,252,252));
        c2.setBounds(350,500,350,30);
        add(c2);

        c3=new JCheckBox("MOBILE BANKING");
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        c3.setBackground(new Color(215,252,252));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4=new JCheckBox("EMAIL ALERTS");
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        c4.setBackground(new Color(215,252,252));
        c4.setBounds(350, 550,200,30);
        add(c4);

        c5=new JCheckBox("CHEQUE BOOK");
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        c5.setBackground(new Color(215,252,252));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6=new JCheckBox("E-STATEMENT");
        c6.setFont(new Font("Raleway",Font.BOLD,14));
        c6.setBackground(new Color(215,252,252));
        c6.setBounds(350,600,350,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I HERE BY DECLARED THAT THE ABOVE ENTERED DETAILS CORRECT TO THE BEST OF MY KNOWLEDGE.",true);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,700,20);
        c7.setBackground(new Color(215,252,252));
        add(c7);

        JLabel l12 =new JLabel("FORM NO. :");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(600,10,400,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setBounds(700,10,200,30);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        add(l13);

        s=new JButton("SUBMIT");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(250,720,100,30);
        s.addActionListener(this);
        add(s);

        c=new JButton("CANCEL");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420,720,100,30);
        c.addActionListener(this);
        add(c);


        setLayout(null);
        //background color
        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLocation(400,20);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String atype="";
        if((r1.isSelected())){
            atype="SAVING ACCOUNT";
        }else if((r2.isSelected())){
            atype="FIXED DEPOSIT ACCOUNT";
        }else if((r3.isSelected())){
            atype="CURRENT ACCOUNT";
        }else if((r4.isSelected())){
            atype="RECURRING DEPOSIT ACCOUNT";
        }

         Random ran =new Random();
        long first7=(ran.nextLong()% 90000000)+1409963000000000L;
        //generating pin number
        String cardno=""+Math.abs(first7);
        long first3=(ran.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);

        String fac="";
        if((c1.isSelected())){
            fac +="ATM CARD";
        }else if((c2.isSelected())){
            fac+="INTERNET BANKING";
        }else if((c3.isSelected())){
            fac +="MOBILE BANKING";
        }else if((c4.isSelected())){
            fac +="EMAIL ALERTS";
        }else if((c5.isSelected())){
            fac+="CHEQUE BOOK";
        }else if((c6.isSelected())){
            fac+="E-STATEMENT";
        }

        try{
            //SUBMIT BUTTON
            if(e.getSource()==s){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"FILL ALL THE FIELDS");
                }else{
                    Conn c1=new Conn();
                    String q1= "insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"CARD  NUMBER:"+cardno+"\n PIN :"+pin);
                    new Deposit(pin); //sending to deposit class
                    setVisible(false);

                }
                //CANCNEL BUTTON
            }else if(e.getSource()==c){
                System.exit(0);
            }
        }catch(Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args){
        new Signup3(" ");


    }
}
