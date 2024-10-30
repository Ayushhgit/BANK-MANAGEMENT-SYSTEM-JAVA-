
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FastCash extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    FastCash(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icn/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("SELECT WITHDRAWL AMOUNT");
        label.setBounds(445,180,700,35);
        label.setFont(new Font("System",Font.BOLD,23));
        label.setForeground(Color.white);
        l3.add(label);

        b1 = new JButton("Rs. 100");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        b1.setBounds(410,274,150,35);
        l3.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(this);
        b2.setBounds(700,274,150,35);
        l3.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.addActionListener(this);
        b3.setBounds(410,318,150,35);
        l3.add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.addActionListener(this);
        b4.setBounds(700,318,150,35);
        l3.add(b4);

        b5 = new JButton("Rs. 5000");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.addActionListener(this);
        b5.setBounds(410,362,150,35);
        l3.add(b5);

        b6 = new JButton("Rs. 10,000");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.addActionListener(this);
        b6.setBounds(700,362,150,35);
        l3.add(b6);

        b7 = new JButton("BACK");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.addActionListener(this);
        b7.setBounds(700,406,150,35);
        l3.add(b7);
        
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b7) {
            setVisible(false);
            new main_class(pin);
        } else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            conn c = new conn();
            Date date = new Date();
            try {
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while(resultSet.next()) {
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));

                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }

                } String num = "17";

                if (e.getSource() == b7 && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                } 

                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawal','"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" debited successfully");
            } catch (Exception E) {
                E.printStackTrace();
            }
            setVisible(false);
            new main_class(pin);

        }
        
    }
    public static void main(String[] args) {
        new FastCash("");
    }
}
