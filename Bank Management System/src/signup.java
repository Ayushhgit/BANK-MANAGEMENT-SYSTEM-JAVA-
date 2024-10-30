import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class signup extends JFrame implements ActionListener{
    Random rand = new Random();
    long first4 = (rand.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    JTextField textName, textpin, textState, ftextName, textEmail, textms, textadd, textCity;
    JDateChooser dateChooser;
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    signup() {
        super("APPLICATION FORM");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icn/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel l1 = new JLabel("APPLICATION FORM NO." + first);
        l1.setBounds(130,20,600,40);
        l1.setFont(new Font("Ralway",Font.BOLD,38));
        add(l1);

        JLabel l2 = new JLabel("Page 1");
        l2.setFont(new Font("Ralway",Font.BOLD,22));
        l2.setBounds(330,70,600,30);
        add(l2);

        JLabel l3 = new JLabel("Personal Details");
        l3.setFont(new Font("Ralway",Font.BOLD,22));
        l3.setBounds(290,90,600,30);
        add(l3);

        JLabel labelName = new JLabel("Name");
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Ralway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFname = new JLabel("Father's Name:");
        labelFname.setFont(new Font("Ralway",Font.BOLD,20));
        labelFname.setBounds(100,240,200,30);
        add(labelFname);

        ftextName = new JTextField();
        ftextName.setFont(new Font("Ralway",Font.BOLD,14));
        ftextName.setBounds(300,240,400,30);
        add(ftextName);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Ralway",Font.BOLD,20));
        dob.setBounds(100,340,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel l4 = new JLabel("Gender");
        l4.setFont(new Font("Ralway",Font.BOLD,22));
        l4.setBounds(100,290,200,22);
        add(l4);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);


        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel l5 = new JLabel("Email:");
        l5.setFont(new Font("Ralway",Font.BOLD,20));
        l5.setBounds(100,390,200,30);
        add(l5);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel l6 = new JLabel("Marital Status");
        l6.setFont(new Font("Ralway",Font.BOLD,20));
        l6.setBounds(100,440,200,30);
        add(l6);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Ralway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Ralway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,100,30);
        add(m2);

        m3 = new JRadioButton("Others");
        m3.setFont(new Font("Ralway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(635,440,100,30);
        add(m3);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(m1);
        bg1.add(m2);
        bg1.add(m3);



        JLabel l7 = new JLabel("Address");
        l7.setFont(new Font("Ralway",Font.BOLD,20));
        l7.setBounds(100,490,200,30);
        add(l7);

        textadd = new JTextField();
        textadd.setFont(new Font("Ralway",Font.BOLD,14));
        textadd.setBounds(300,490,400,30);
        add(textadd);

        JLabel l8 = new JLabel("City");
        l8.setFont(new Font("Ralway",Font.BOLD,20));
        l8.setBounds(100,540,200,30);
        add(l8);

        textCity = new JTextField();
        textCity.setFont(new Font("Ralway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel l9 = new JLabel("Pin Code:");
        l9.setFont(new Font("Ralway",Font.BOLD,20));
        l9.setBounds(100,590,200,30);
        add(l9);

        textpin = new JTextField();
        textpin.setFont(new Font("Ralway",Font.BOLD,14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        JLabel l10 = new JLabel("State:");
        l10.setFont(new Font("Ralway",Font.BOLD,20));
        l10.setBounds(100,640,200,30);
        add(l10);

        textState = new JTextField();
        textState.setFont(new Font("Ralway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formNo = first;
        String name = textName.getText();
        String fname = ftextName.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Feamle";
        }
        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()) {
            marital = "Married";
        } else if (m2.isSelected()) {
            marital = "Un-Married";
        } else if (m3.isSelected()) {
            marital = "Others";
        }

        String address = textadd.getText();
        String city = textCity.getText();
        String pincode = textpin.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill All The fields");
            } else {
                conn conn1 = new conn();
                String q = "insert into signup values('"+formNo+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                conn1.statement.executeUpdate(q);
                new signup2(formNo);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new signup();
    }
}
