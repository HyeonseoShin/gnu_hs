package xmas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener extends JFrame implements ActionListener
{
    JButton clarifier = new JButton("okay");

    MyListener(JButton b)
    {
        this.clarifier = b;
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton bt = (JButton) e.getSource();

        bt.setText("Hello world");
    }
}
