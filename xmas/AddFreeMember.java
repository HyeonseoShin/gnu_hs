package xmas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFreeMember extends JPanel implements ActionListener
{
    WindowFrame frame;

    JButton cancel = new JButton("Cancel");
    JButton save = new JButton("Save");

    public AddFreeMember(WindowFrame frame)
    {
        this.frame=frame;

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

        JLabel labelage = new JLabel("AGE: ", JLabel.TRAILING);
        JTextField fieldage = new JTextField(10);
        labelname.setLabelFor(fieldage);
        panel.add(labelage);
        panel.add(fieldage);

        JLabel labelstart = new JLabel("이용 시작일: ", JLabel.TRAILING);
        JTextField fieldstart = new JTextField(10);
        labelname.setLabelFor(fieldstart);
        panel.add(labelstart);
        panel.add(fieldstart);

        JLabel labelend = new JLabel("이용 기간: ", JLabel.TRAILING);
        JTextField fieldend = new JTextField(10);
        labelname.setLabelFor(fieldend);
        panel.add(labelend);
        panel.add(fieldend);

        panel.add(cancel);
        panel.add(save);

        SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

        this.add(panel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton bt = (JButton) e.getSource();

        if (bt == save)
        {
            System.exit(0);
        }

        else
        {
            System.exit(0);
        }
    }
}
