import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class signup2 extends JFrame implements ActionListener{
    String formno;
    JTextField textpan,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    signup2(String formno) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icn/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2:");
        l1.setFont(new Font("Ralway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Ralway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion:");
        l3.setFont(new Font("Ralway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"HINDU","MUSLIM","SIKH","CHRISTIAN","OTHERS"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category:");
        l4.setFont(new Font("Ralway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);    
        
        String category[] = {"General","OBC","SC","ST","OTHERS"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income:");
        l5.setFont(new Font("Ralway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);    
        
        String income[] = {"null","<1,50,000","<2,50,000","500,000","upto 1,000,000","above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education:");
        l6.setFont(new Font("Ralway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);    
        
        String education[] = {"Un-Graduate","Graduate","Post-Graduate","Doctorate","Others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation:");
        l7.setFont(new Font("Ralway",Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);    
        
        String occupation[] = {"Salaried","Self=Employed","Bussiness","Student","Retired","Others"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number:");
        l8.setFont(new Font("Ralway",Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);  
        
        textpan = new JTextField();
        textpan.setFont(new Font("Ralway",Font.BOLD,18));
        textpan.setBounds(350,390,320,30);
        add(textpan);

        JLabel l9 = new JLabel("Aadhar Number:");
        l9.setFont(new Font("Ralway",Font.BOLD,18));
        l9.setBounds(100,440,180,30);
        add(l9);  
        
        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Ralway",Font.BOLD,18));
        textAadhar.setBounds(350,440,320,30);
        add(textAadhar);

        
        JLabel l10 = new JLabel("Senior Citizen:");
        l10.setFont(new Font("Ralway",Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,490,100,30);
        add(r2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel l11 = new JLabel("Existing Account:");
        l11.setFont(new Font("Ralway",Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Ralway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,540,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Ralway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(460,540,100,30);
        add(e2);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(e1);
        bg1.add(e2);

        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Ralway",Font.BOLD,18));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Ralway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);




        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String religion = (String)comboBox.getSelectedItem();
        String cate = (String)comboBox2.getSelectedItem();
        String inc = (String)comboBox3.getSelectedItem();
        String edu = (String)comboBox4.getSelectedItem();
        String occ = (String)comboBox5.getSelectedItem();
        String pan = textpan.getText();
        String aadhar = textAadhar.getText();
        String scitizen = null;
        if (r1.isSelected()) {
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }
        String eaccount = null;
        if (e1.isSelected()) {
            eaccount = "Yes";
        } else if (e2.isSelected()) {
            eaccount = "No";
        }

        try {

            if(textAadhar.getText().equals(" ") || textpan.getText().equals(" ")) {
                JOptionPane.showMessageDialog(null, "fill all the fields");
            } else {
                conn c1 = new conn();
                String q = "insert into signuptwo values('"+formno+"', '"+religion+"', '"+cate+"', '"+inc+"', '"+edu+"', '"+occ+"', '"+pan+"', '"+aadhar+"','"+scitizen+"', '"+eaccount+"')";
                c1.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);

            }

            
            
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        
        new signup2("");
    }
    
}
