package xmas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

public class ChoosePtorFree extends JPanel implements ActionListener {
    WindowFrame frame;

    JFrame jf = new JFrame();
    JButton PT = new JButton("PT");
    JButton Free = new JButton("Free");
    JPanel pn = new JPanel();

    public ChoosePtorFree(WindowFrame frame) {
        jf.setSize(300, 300);

        PT.addActionListener(new ButtonAddPtListener(frame, jf));
        Free.addActionListener(new ButtonAddFreeListener(frame, jf));

        pn.add(PT, BorderLayout.WEST);
        pn.add(Free, BorderLayout.EAST);

        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.add(pn, BorderLayout.SOUTH);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton bt = (JButton) e.getSource();

        if (bt == PT) {
            jf.dispose();
        }
    }
}