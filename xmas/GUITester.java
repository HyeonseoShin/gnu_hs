package xmas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUITester extends JPanel implements ActionListener
{
    WindowFrame frame;

    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JLabel lb1 = new JLabel("Health Club Member Management System");

    ArrayList<PtMember> PtmemberList;
    ArrayList<FreeMember> FreememberList;

    static JButton[] menu = new JButton[6];
    static String[] BtnText = {"1. Add Member", "2. Delete Member", "3. Edit Member", "4. View Member", "5.To menu", "6.Exit Program"};

    public GUITester(WindowFrame frame, ArrayList<PtMember> PtMemberList, ArrayList<FreeMember> FreeMemberList)
    {
        this.frame = frame;
        this.PtmemberList=PtMemberList;
        this.FreememberList = FreeMemberList;

        this.setLayout(new BorderLayout());

        jp1.add(lb1);

        for (int i = 0; i < 6; i++)
        {
            menu[i] = new JButton(BtnText[i]);

            jp1.add(menu[i]);
        }

        menu[0].addActionListener(this);
        menu[3].addActionListener(new ButtonViewListener(frame));

        this.add(jp1, BorderLayout.NORTH);
        this.add(jp2, BorderLayout.CENTER);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton bt = (JButton)e.getSource();

        if(bt == menu[0])
        {
            ChoosePtorFree ptorfr = new ChoosePtorFree(frame);
            ptorfr.setVisible(true);
            ptorfr.setSize(760,550);
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
            Menu4etc menu44 = new Menu4etc(frame, PtmemberList,FreememberList);
            menu44.setVisible(true);
            menu44.setSize(300,300);
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