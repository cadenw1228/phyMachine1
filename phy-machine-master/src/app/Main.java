package app;
//hello
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame{
    static int X = 0;
    static int sec = 0;

    static JPanel row = new JPanel();
    static JPanel row2 = new JPanel();    
    static JPanel row3 = new JPanel(); 
    //static J t1 = new JLabel("idk:");
    static String[] mechLabels = {"Change in distance(meters)","Change in time(seconds)","velocity(m/s)","change in velocity","acceleration((m/2)^2)","final velocity", "inital velocity"};
    static JTextField[] f1 = new JTextField[7];

    static String[] forceLabels = {"force(newtons)","mass(kilograms)","acceleration((m/2)^2)","momentum(kg*m/2)","velocity(m/2)","impulse(kg*m/s)","Change in time(seconds)","kinetic energy(juels)","potential energy (juels)","distance(meters)","Energy(juels)","Power(watts)"};
    static JTextField[] f2 = new JTextField[12];

    static String[] electricLabels = {"power(watts)","amps","volts","resistence(ohms)"};
    static JTextField[] f3 = new JTextField[4];
    

    static JButton btn = new JButton("check");
    static JButton btn1 = new JButton("mechanics");
    static JButton btn2 = new JButton("forces");
    static JButton btn3 = new JButton("electricity");
    static JButton btn4 = new JButton("idk.");
    static JLabel t2 = new JLabel();
    mechanics mech = new mechanics();
    electricity elec = new electricity();
    //forces forces = new forces();
    final GridLayout layoutForce = new GridLayout(4,1,10,10);

    static int page = 0;
    public Main() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = (int)screenSize.getHeight();
        int width = (int)screenSize.getWidth();
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final GridLayout layout = new GridLayout(4, 1, 10, 10);
        setLayout(layout);
        final GridLayout layoutBtn = new GridLayout(1,4,10,10);
        row3.setLayout(layoutBtn);
        row3.add(btn1);
        row3.add(btn2);
        row3.add(btn3);
        row3.add(btn4);
        final GridLayout layoutMech = new GridLayout(4,1,10,10);
        row.setLayout(layoutMech);
        //row.add(t1);
        for (int i = 0; i < 7; i++) {
            f1[i] = new JTextField();
            JLabel t1 = new JLabel(mechLabels[i]);
            row.add(t1);
            row.add(f1[i]);
        }
        final FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER,10,10);
        row2.setLayout(layout3);
        row2.add(btn);

        mech.test();
        elec.test1();
        //forces.test();
        checker();
        row2.add(t2);
        add(row3);
        add(row);
        add(row2);
        setVisible(true);
        
    }

    public static void main(final String[] args) throws Exception {
        t2.setText("");
        final Main frame = new Main();
        //System.out.println("yes");
    }


    public void checker(){

        btn1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                //System.out.println("btn1");
                row.setVisible(false);
                row.removeAll();
                for (int i = 0; i < mechLabels.length; i++) {
                    f1[i] = new JTextField();
                    JLabel t1 = new JLabel(mechLabels[i]);
                    row.add(t1);
                    row.add(f1[i]);
                }
                t2.setText("");
                row.setVisible(true);
                //row3.removeAll();
                //t2.setText("");
                page = 0;
                
            }
        });

        btn2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                //System.out.println("btn2");
                row.setVisible(false);
                row.removeAll();
                row.setLayout(layoutForce);
                for (int i = 0; i < forceLabels.length; i++) {
                    f2[i] = new JTextField();
                    JLabel t1 = new JLabel(forceLabels[i]);
                    row.add(t1);
                    row.add(f2[i]);
                }
                t2.setText("");
                row.setVisible(true);
                page = 1;

            }
        });

        btn3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                //System.out.println("btn3");
                row.setVisible(false);
                row.removeAll();
                row.setLayout(layoutForce);
                for (int i = 0; i < electricLabels.length; i++) {
                    f3[i] = new JTextField();
                    JLabel t1 = new JLabel(electricLabels[i]);
                    row.add(t1);
                    row.add(f3[i]);
                }
                t2.setText("");
                row.setVisible(true);
                page = 2;
            }
            
        });
        btn4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                System.out.println("btn4");
                page = 3;
            }
        });
    }
}