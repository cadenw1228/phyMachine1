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
    static JButton btn = new JButton("check");
    static JButton btn1 = new JButton("mechanics");
    static JButton btn2 = new JButton("forces");
    static JButton btn3 = new JButton("electricity");
    static JButton btn4 = new JButton("etc.");
    static JLabel t2 = new JLabel();
    //electricity elec = new electricity();
    mechanics mech = new mechanics();

    public Main() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = (int)screenSize.getHeight();
        int width = (int)screenSize.getWidth();
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final GridLayout layout = new GridLayout(8, 1, 10, 10);
        setLayout(layout);
        final GridLayout layout4 = new GridLayout(1,4,10,10);
        row3.setLayout(layout4);
        row3.add(btn1);
        row3.add(btn2);
        row3.add(btn3);
        row3.add(btn4);
        final GridLayout layout2 = new GridLayout(4,1,10,10);
        row.setLayout(layout2);
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
        checker();
        row2.add(t2);
        add(row3);
        add(row);
        add(row2);
        setVisible(true);
        
    }

    public static void main(final String[] args) throws Exception {
        final Main frame = new Main();
        //System.out.println("yes");
    }
    public void checker(){
        btn1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                System.out.println("btn1");
                // row.removeAll();
                // row2.removeAll();
                // row3.removeAll();
            }
        });
        btn2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                System.out.println("btn2");
            }
        });
        btn3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                System.out.println("btn3");
            }
        });
        btn4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                System.out.println("btn4");
            }
        });
    }
}