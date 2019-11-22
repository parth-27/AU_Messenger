package chat;

import java.awt.Color;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.*;

public class AddChat1 extends JFrame implements ActionListener, MouseListener {

    int count = 0;
    String name[] = new String[countNames()];
    JLabel label[] = new JLabel[countNames()];
    String frommsgname = "";

    public int countNames() {
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT COUNT(user_name) AS final FROM user_details";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery(query);
            while (rs.next()) {
                count = rs.getInt("final");
            }
            System.out.println((count) - 1);
        } catch (SQLException ex) {
            Logger.getLogger(AddChat1.class.getName()).log(Level.SEVERE, null, ex);
        }
        count = count - 1;
        System.out.println(User.getUname());
        return count;
    }

    public void addchat() {

        PreparedStatement ps1;
        ResultSet rs1;
        String query1 = "SELECT (user_name) FROM user_details WHERE user_name NOT LIKE '" + User.getUname() + "'";

        try {
            System.out.println(query1);
            ps1 = MyConnection.getConnection().prepareStatement(query1);
            rs1 = ps1.executeQuery(query1);
            int i = 0;
            while (rs1.next()) {
                name[i] = new String();
                name[i] = rs1.getString("user_name");
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddChat1.class.getName()).log(Level.SEVERE, null, ex);
        }

        JFrame jf = new JFrame("Welcome");

        JPanel contentPane = new JPanel();
        contentPane.setOpaque(true);
        contentPane.setBackground(Color.BLACK);
        contentPane.setLayout(null);
        int j = 0;

        for (int k = 0; k < count; k++) {
            label[k] = new JLabel(name[k]);
            label[k].setSize(300, 30);
            label[k].setLocation(5 + k, k + 5 + j);
            label[k].setForeground(Color.WHITE);
            contentPane.add(label[k]);
            jf.setContentPane(contentPane);
            jf.setSize(500, 500);
            jf.setVisible(true);
            j = j + 20;
            label[k].addMouseListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < count; i++) {
            if (e.getSource() == label[i]) {
                ChatWindow1 s1 = new ChatWindow1(name[i], User.getUname());
                s1.setVisible(true);
                s1.pack();
                s1.setLocationRelativeTo(null);
                s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                s1.jLabel4.setText(name[i]);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
