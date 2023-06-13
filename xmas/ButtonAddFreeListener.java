package xmas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAddFreeListener implements ActionListener
{
    WindowFrame frame;
    JFrame jf;

    public ButtonAddFreeListener(WindowFrame frame, JFrame jf)
    {
        this.frame = frame;
        this.jf = jf;
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton bt = (JButton) e.getSource();
        AddFreeMember addfr = new AddFreeMember(frame);
        frame.setupPanel(addfr);

        jf.dispose();
    }
}
