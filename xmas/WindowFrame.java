package xmas;

import javax.swing.*;
import java.util.ArrayList;

public class WindowFrame extends JFrame {
    GUITester menu;

    Menu1etc menu1;
    Menu4etc menu4;

    ArrayList<PtMember> PtmemberList;
    ArrayList<FreeMember> FreeMemberList;

    public WindowFrame() {
        this.menu = new GUITester(this, this.PtmemberList, this.FreeMemberList);

        this.setSize(300, 300);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setupPanel(menu);
        this.setVisible(true);
    }

    public void setWindowArrayPT(ArrayList<PtMember> PtmemberList) {
        this.PtmemberList = PtmemberList;
        this.FreeMemberList = null;

        this.menu1 = new Menu1etc(this);
        this.menu4 = new Menu4etc(this, PtmemberList, FreeMemberList);
    }

    public void setWindowArrayFree(ArrayList<FreeMember> FreeMemberList) {
        this.FreeMemberList = FreeMemberList;

        this.menu1 = new Menu1etc(this);
        this.menu4 = new Menu4etc(this, PtmemberList, FreeMemberList);
    }

    public void setupPanel(JPanel panel) {
        this.getContentPane().removeAll();
        this.getContentPane().add(panel);

        revalidate();

        this.repaint();
    }

    public GUITester getMenu()
    {
        return menu;
    }

    public void setMenu(GUITester menu)
    {
        this.menu = menu;
    }

    public Menu1etc getMenu1()
    {
        return menu1;
    }

    public void setMenu1(Menu1etc menu1)
    {
        this.menu1 = menu1;
    }

    public Menu4etc getMenu4()
    {
        return menu4;
    }

    public void setMenu4(Menu4etc menu4)
    {
        this.menu4 = menu4;
    }
}
