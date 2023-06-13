package xmas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAddPtListener implements ActionListener
{
    WindowFrame frame;
    JFrame jf;

    public ButtonAddPtListener(WindowFrame frame, JFrame jf)
    {
        this.frame = frame;
        this.jf = jf;
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton bt = (JButton) e.getSource();
        AddPtMember addpt = new AddPtMember(frame);
        frame.setupPanel(addpt);
        jf.dispose();
    }
}
