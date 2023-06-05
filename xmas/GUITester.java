package xmas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUITester extends JFrame implements ActionListener
{
    JPanel jp1 = new JPanel();
    GridLayout grid = new GridLayout(2,2,20,50);
    JLabel lb1 = new JLabel("Health Club Member Management System");
    static JButton[] menu = new JButton[6];
    static String[] BtnText = {"1. Add Member", "2. Delete Member", "3. Edit Member", "4. View Member", "5.To menu", "6.Exit Program"};

    ArrayList<PtMember> PtTestMem = new ArrayList<PtMember>();
    PtMember PTM = new PtMember();

    public GUITester()
    {
        super("GUITester");

        jp1.add(lb1);

        for (int i = 0; i < 6; i++)
        {
            menu[i] = new JButton(BtnText[i]);
            menu[i].addActionListener(this);
            menu[i].setPreferredSize(new Dimension(200,30));
            jp1.add(menu[i]);
        }

        Container cp = getContentPane();
        cp.add(jp1);
        pack();
    }

    PtMember getPtMem()
    {
        return PTM;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton bt = (JButton)e.getSource();

        if(bt == menu[0])
        {
            bt.setText("You selected Menu 1!");
            Menu1etc menu11 = new Menu1etc();
            menu11.setVisible(true);
            menu11.setSize(760,550);
        }

        else if (bt == menu[1])
        {
            bt.setText("You selected menu 2!");
        }

        else if (bt == menu[2])
        {
            bt.setText("You selected menu 3!");
        }

        else if (bt == menu[3])
        {
            bt.setText("You selected menu 4!");
        }

        else if (bt == menu[4])
        {
            bt.setText("You selected menu 5!");
        }

        else
        {
            System.exit(0);
        }
    }
}