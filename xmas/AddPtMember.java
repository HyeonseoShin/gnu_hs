package xmas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddPtMember extends JPanel implements ActionListener
{
    WindowFrame frame;

    JButton cancel = new JButton("Cancel");
    JButton save = new JButton("Save");

    ArrayList<PtMember> PtmemberList;

    public AddPtMember(WindowFrame frame)
    {
        this.frame = frame;

        cancel.addActionListener(this);
        save.addActionListener(this);

        JPanel panel = new JPanel();
        JPanel pn2 = new JPanel();

        panel.setLayout(new SpringLayout());

        JLabel labelname = new JLabel("ID: ", JLabel.TRAILING);
        JTextField fieldname = new JTextField(10);
        labelname.setLabelFor(fieldname);
        panel.add(labelname);
        panel.add(fieldname);

        JLabel labelage = new JLabel("나이: ", JLabel.TRAILING);
        JTextField fieldage = new JTextField(10);
        labelname.setLabelFor(fieldage);
        panel.add(labelage);
        panel.add(fieldage);

        JLabel labelstart = new JLabel("PT 시작일: ", JLabel.TRAILING);
        JTextField fieldstart = new JTextField(10);
        labelname.setLabelFor(fieldstart);
        panel.add(labelstart);
        panel.add(fieldstart);

        JLabel labelend = new JLabel("PT 종료일: ", JLabel.TRAILING);
        JTextField fieldend = new JTextField(10);
        labelname.setLabelFor(fieldend);
        panel.add(labelend);
        panel.add(fieldend);

        JLabel labelweight = new JLabel("시작 몸무게: ", JLabel.TRAILING);
        JTextField fieldweight = new JTextField(10);
        labelname.setLabelFor(fieldweight);
        panel.add(labelweight);
        panel.add(fieldweight);

        panel.add(cancel);
        panel.add(save);

        SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6 ,6 );

        this.add(panel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton bt = (JButton) e.getSource();

        if(bt == save)
        {
            System.exit(0);
        }

        else
        {
            System.exit(0);
        }
    }
}
