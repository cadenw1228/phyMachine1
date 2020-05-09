package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class electricity {
    //Main main = new Main();
    static JLabel t1 = new JLabel("idk:");
    static void total() {
        //Main.row.add(t1);
    }
    public void test1(){
        Main.btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                if (Main.page == 2){
                //dist
                String power = Main.f3[0].getText();
                //time
                String amps = Main.f3[1].getText();
                //velocity
                String volts = Main.f3[2].getText();
                //change in velocity
                String resitance = Main.f3[3].getText();
                idk1(volts,amps,resitance);
                idk2(power,amps,volts);
                }
            }
        });

    }
    public void idk1(String volts,String amps,String res) {
        if(!volts.isEmpty() && !amps.isEmpty() && !res.isEmpty()){

        }else if(!volts.isEmpty() && !amps.isEmpty()){
            Double input = Double.parseDouble(volts);
            Double input2 = Double.parseDouble(amps);
            Double input3 = input / input2;
            Main.t2.setText(String.valueOf(input3) + "  ohms");
            Main.f3[3].setText(String.valueOf(input3));
        }else if(!amps.isEmpty() && !res.isEmpty()){
            Double input = Double.parseDouble(amps);
            Double input2 = Double.parseDouble(res);
            Double input3 = input * input2;
            Main.t2.setText(String.valueOf(input3) + " volts");
            Main.f3[2].setText(String.valueOf(input3));
        }else if(!volts.isEmpty() && !res.isEmpty()){
            Double input = Double.parseDouble(volts);
            Double input2 = Double.parseDouble(res);
            Double input3 = input / input2;
            Main.t2.setText(String.valueOf(input3) + " amps");
            Main.f3[1].setText(String.valueOf(input3));
        }else{
            
        }
    } 
    public void idk2(String power,String amps,String volts) {
        if(!power.isEmpty() && !amps.isEmpty() && !volts.isEmpty()){

        }else if(!power.isEmpty() && !amps.isEmpty()){
            Double input = Double.parseDouble(power);
            Double input2 = Double.parseDouble(amps);
            Double input3 = input / input2;
            Main.t2.setText(String.valueOf(input3) + "  volts");
            Main.f3[2].setText(String.valueOf(input3));
        }else if(!amps.isEmpty() && !volts.isEmpty()){
            Double input = Double.parseDouble(amps);
            Double input2 = Double.parseDouble(volts);
            Double input3 = input * input2;
            Main.t2.setText(String.valueOf(input3) + " watts");
            Main.f3[0].setText(String.valueOf(input3));
        }else if(!power.isEmpty() && !volts.isEmpty()){
            Double input = Double.parseDouble(power);
            Double input2 = Double.parseDouble(volts);
            Double input3 = input / input2;
            Main.t2.setText(String.valueOf(input3) + " amps");
            Main.f3[1].setText(String.valueOf(input3));
        }else{
            
        }
    } 
}