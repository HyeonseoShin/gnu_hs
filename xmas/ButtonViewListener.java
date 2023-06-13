package xmas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonViewListener implements ActionListener
{
    WindowFrame frame;

    public ButtonViewListener(WindowFrame frame)
    {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e)
    {
        JButton bt = (JButton) e.getSource();
        Menu4etc menu44 = frame.getMenu4();
        frame.setupPanel(menu44);
    }
}
