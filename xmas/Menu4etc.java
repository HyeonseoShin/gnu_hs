package xmas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Vector;

public class Menu4etc extends JPanel
{
    JPanel pn1 = new JPanel();
    JPanel pn2 = new JPanel();
    WindowFrame frame;

    ArrayList<PtMember> PtmemberList;
    ArrayList<FreeMember> FreememberList;

    public Menu4etc(WindowFrame frame, ArrayList<PtMember> PtmemberList, ArrayList<FreeMember> FreememberList)
    {
        if(PtmemberList == null && FreememberList == null)
        {

        }

        else if(PtmemberList != null && FreememberList == null)
        {
            this.frame = frame;
            this.PtmemberList = PtmemberList;

            DefaultTableModel model1 = new DefaultTableModel();

            model1.addColumn("ID");
            model1.addColumn("이름");
            model1.addColumn("나이");
            model1.addColumn("시작 몸무게");
            model1.addColumn("PT 시작일");
            model1.addColumn("PT 종료일");

            for (int i = 0; i < PtmemberList.size(); i++)
            {
                Vector row = new Vector();

                PtMember member = PtmemberList.get(i);
                row.add(member.getId());
                row.add(member.getName());
                row.add(member.getAge());
                row.add(member.getWeight());
                row.add(member.getPTstartdate());
                row.add(member.getPTenddate());

                model1.addRow(row);
            }

            JTable table1 = new JTable(model1);
            JScrollPane sp1 = new JScrollPane(table1);

            pn1.add(sp1);
            this.add(pn1);
        }

        else if(PtmemberList == null && FreememberList != null)
        {
            this.frame = frame;
            this.FreememberList = FreememberList;

            DefaultTableModel model2 = new DefaultTableModel();
            model2.addColumn("ID");
            model2.addColumn("이름");
            model2.addColumn("나이");
            model2.addColumn("이용 시작일");
            model2.addColumn("이용 기간");

            for (int i = 0; i < FreememberList.size(); i++)
            {
                Vector row = new Vector();

                if (FreememberList == null)
                {

                }

                else
                {
                    FreeMember member = FreememberList.get(i);
                    row.add(member.getId());
                    row.add(member.getName());
                    row.add(member.getAge());
                    row.add(member.getFirstuse());
                    row.add(member.getTerm());

                    model2.addRow(row);
                }
            }

            JTable table2 = new JTable(model2);
            JScrollPane sp2 = new JScrollPane(table2);

            pn1.add(sp2);
            this.add(pn2);
        }

        else
        {
            this.frame = frame;
            this.PtmemberList = PtmemberList;
            this.FreememberList = FreememberList;

            DefaultTableModel model1 = new DefaultTableModel();
            model1.addColumn("ID");
            model1.addColumn("이름");
            model1.addColumn("나이");
            model1.addColumn("시작 몸무게");
            model1.addColumn("PT 시작일");
            model1.addColumn("PT 종료일");

            for (int i = 0; i < PtmemberList.size(); i++)
            {
                Vector row = new Vector();

                PtMember member = PtmemberList.get(i);

                row.add(member.getId());
                row.add(member.getName());
                row.add(member.getAge());
                row.add(member.getWeight());
                row.add(member.getPTstartdate());
                row.add(member.getPTenddate());

                model1.addRow(row);
            }

            JTable table1 = new JTable(model1);
            JScrollPane sp1 = new JScrollPane(table1);

            DefaultTableModel model2 = new DefaultTableModel();
            model2.addColumn("ID");
            model2.addColumn("이름");
            model2.addColumn("나이");
            model2.addColumn("이용 시작일");
            model2.addColumn("이용 기간");

            for (int i = 0; i < FreememberList.size(); i++)
            {
                Vector row = new Vector();

                if(FreememberList == null)
                {

                }

                else
                {
                    FreeMember member = FreememberList.get(i);

                    row.add(member.getId());
                    row.add(member.getName());
                    row.add(member.getAge());
                    row.add(member.getFirstuse());
                    row.add(member.getTerm());

                    model2.addRow(row);
                }
            }

            JTable table2 = new JTable(model2);
            JScrollPane sp2 = new JScrollPane(table2);

            pn1.add(sp1);
            pn2.add(sp2);
            this.add(pn1);
            this.add(pn2);
        }
    }

    public Menu4etc(WindowFrame windowFrame)
    {
        this.frame = frame;
    }
}
