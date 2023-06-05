package xmas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu1etc extends JFrame implements ActionListener
{
    PtMember realPTM = new PtMember();

    JPanel jp2 = new JPanel();
    JLabel jlb1 = new JLabel("Add Member");
    JTextField[] txtf = new JTextField[5];
    String[] strr = {"name","20","65","20000000","20000000"};
    JButton addmem = new JButton("Confirm");
    JButton closing = new JButton("Close");

    JPanel insjp1 = new JPanel();
    JPanel jp1bt = new JPanel();

    Menu1etc()
    {
        super("add Member");

        realPTM = null;
        addmem.addActionListener(this);
        closing.addActionListener(this);
        insjp1.setLayout(new GridLayout(7,1,10,30));
        insjp1.add(jlb1);

        for(int i = 0; i < 5; i++)
        {
            txtf[i] = new JTextField(strr[i]);
            insjp1.add(txtf[i]);
        }

        jp1bt.add(closing);
        jp1bt.add(addmem);

        insjp1.add(jp1bt);
        jp2.add(jp1bt);
        Container cp = getContentPane();
        cp.add(jp2);
        jp2.setVisible(true);
        pack();
    }

    PtMember getPtMember()
    {
        PtMember PTM = new PtMember();
        PTM.name = txtf[0].getText();
        PTM.age = Integer.parseInt(txtf[1].getText());
        PTM.mass = Double.parseDouble(txtf[2].getText());
        PTM.PTstartdate = Integer.parseInt(txtf[3].getText());
        PTM.PTenddate = Integer.parseInt(txtf[4].getText());

        return PTM;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton btmenu1 = (JButton)e.getSource();

        if(btmenu1 == addmem)
        {
            realPTM = getPtMember();
            realPTM.printInfo();
        }

        else
        {
            dispose();
        }
    }
}