package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class mechanics {
    //Main main = new Main();
    
    public mechanics(){
        
    }
    
    public void test(){
        Main.btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                //dist
                String dist = Main.f1[0].getText();
                //time
                String time = Main.f1[1].getText();
                //velocity
                String velocity = Main.f1[2].getText();
                //change in velocity
                String changeV = Main.f1[3].getText();
                //acceleration
                String acc = Main.f1[4].getText();
                //final
                String finalV = Main.f1[5].getText();
                //inital
                String initV = Main.f1[6].getText();
                idk1(dist,time,velocity);
                idk2(time,changeV,acc);
                idk3(time,acc,finalV,initV);
                idk4(dist,time,finalV,initV);
                idk5(dist,time,acc,initV);
                idk6(dist,acc,finalV,initV);
            }
        });
    }

    public void idk1(String dist,String time,String velocity) {
        if(!dist.isEmpty() && !time.isEmpty() && !velocity.isEmpty()){

        }else if(!dist.isEmpty() && !time.isEmpty()){
            Double input = Double.parseDouble(dist);
            Double input2 = Double.parseDouble(time);
            Double input3 = input / input2;
            Main.t2.setText(String.valueOf(input3) + "  m/2");
        }else if(!time.isEmpty() && !velocity.isEmpty()){
            Double input = Double.parseDouble(time);
            Double input2 = Double.parseDouble(velocity);
            Double input3 = input * input2;
            Main.t2.setText(String.valueOf(input3) + " meters");
        }else if(!dist.isEmpty() && !velocity.isEmpty()){
            Double input = Double.parseDouble(dist);
            Double input2 = Double.parseDouble(velocity);
            Double input3 = input / input2;
            Main.t2.setText(String.valueOf(input3) + " seconds");
        }else{
            
        }
    }
    public void idk2(String time, String changeV,String acc){
        if(!time.isEmpty() && !changeV.isEmpty() && !acc.isEmpty()){

        }else if(!time.isEmpty() && !changeV.isEmpty()){
            Double input = Double.parseDouble(time);
            Double input2 = Double.parseDouble(changeV);
            Double input3 = input2 / input;
            Main.t2.setText(String.valueOf(input3) + "(m/2)^2");
        }else if(!time.isEmpty() && !acc.isEmpty()){
            Double input = Double.parseDouble(time);
            Double input2 = Double.parseDouble(acc);
            Double input3 = input * input2;
            Main.t2.setText(String.valueOf(input3) + " m/2");
        }else if(!changeV.isEmpty() && !acc.isEmpty()){
            Double input = Double.parseDouble(changeV);
            Double input2 = Double.parseDouble(acc);
            Double input3 = input / input2;
            Main.t2.setText(String.valueOf(input3) + "seconds");
        }else{
            
        }
    }
    public void idk3(String time, String acc,String finalV,String initV){
        if(!time.isEmpty() && !acc.isEmpty() && !finalV.isEmpty() && !initV.isEmpty()){
        //time,acc,finalVinal,inital
        }else if(!time.isEmpty() && !acc.isEmpty() && !finalV.isEmpty()){
            Double input = Double.parseDouble(time);
            Double input2 = Double.parseDouble(acc);
            Double input3 = Double.parseDouble(finalV);
            Double input4 = input3 / (input * input2);
            Main.t2.setText(String.valueOf(input4) + " (m/2)");
        }else if(!acc.isEmpty() && !finalV.isEmpty() && !initV.isEmpty()){
            Double input = Double.parseDouble(acc);
            Double input2 = Double.parseDouble(finalV);
            Double input3 = Double.parseDouble(initV);
            Double input4 = (input2 - input3) / input;
            Main.t2.setText(String.valueOf(input4) + " seconds");
        }else if(!time.isEmpty() && !finalV.isEmpty() && !initV.isEmpty()){
            Double input = Double.parseDouble(time);
            Double input2 = Double.parseDouble(finalV);
            Double input3 = Double.parseDouble(initV);
            Double input4 = (input2 - input3) / input;
            Main.t2.setText(String.valueOf(input4) + " (m/2)^2");
        }else if(!time.isEmpty() && !acc.isEmpty() && !initV.isEmpty()){
            Double input = Double.parseDouble(time);
            Double input2 = Double.parseDouble(acc);
            Double input3 = Double.parseDouble(initV);
            Double input4 = input3 + (input * input2);
            Main.t2.setText(String.valueOf(input4) + " (m/2)");
        }else{

        }
    }
    public void idk4(String dist, String time,String finalV,String initV){
        if(!dist.isEmpty() && !time.isEmpty() && !finalV.isEmpty() && !initV.isEmpty()){
            //time,acc,final,inital
            }else if(!dist.isEmpty() && !time.isEmpty() && !finalV.isEmpty()){
                Double input = Double.parseDouble(dist);
                Double input2 = Double.parseDouble(time);
                Double input3 = Double.parseDouble(finalV);
                Double input4 = ((input * 2)/input2)-input3;
                Main.t2.setText(String.valueOf(input4) + " (m/2)");
            }else if(!dist.isEmpty() && !finalV.isEmpty() && !initV.isEmpty()){
                Double input = Double.parseDouble(dist);
                Double input2 = Double.parseDouble(finalV);
                Double input3 = Double.parseDouble(initV);
                Double input4 = (input*2)/(input3+input2);
                Main.t2.setText(String.valueOf(input4) + " seconds");
            }else if(!time.isEmpty() && !finalV.isEmpty() && !initV.isEmpty()){
                Double input = Double.parseDouble(time);
                Double input2 = Double.parseDouble(finalV);
                Double input3 = Double.parseDouble(initV);
                Double input4 = .5*(input3+input2)*input;
                Main.t2.setText(String.valueOf(input4) + " meters");
            }else if(!dist.isEmpty() && !time.isEmpty() && !initV.isEmpty()){
                Double input = Double.parseDouble(dist);
                Double input2 = Double.parseDouble(time);
                Double input3 = Double.parseDouble(initV);
                Double input4 = ((input * 2)/input2)-input3;
                Main.t2.setText(String.valueOf(input4) + " (m/2)");
            }else{
    
            }
    }
    public void idk5(String dist,String time, String acc,String initV){
        if(!dist.isEmpty() && !time.isEmpty() && !acc.isEmpty() && !initV.isEmpty()){
            //time,acc,final,inital
            }else if(!dist.isEmpty() && !time.isEmpty() && !acc.isEmpty()){
                Double input = Double.parseDouble(dist);
                Double input2 = Double.parseDouble(time);
                Double input3 = Double.parseDouble(acc);
                Double input4 = (input -(.5*input3 * Math.pow(input2, 2)))/input2;
                Main.t2.setText(String.valueOf(input4) + " (m/2)");
            }else if(!dist.isEmpty() && !acc.isEmpty() && !initV.isEmpty()){
                Double input = Double.parseDouble(dist);
                Double input2 = Double.parseDouble(acc);
                Double input3 = Double.parseDouble(initV);
                Double input4 = (input * input3)/(.5*input2);
                Main.t2.setText(String.valueOf(input4) + " seconds");
            }else if(!time.isEmpty() && !acc.isEmpty() && !initV.isEmpty()){
                Double input = Double.parseDouble(time);
                Double input2 = Double.parseDouble(acc);
                Double input3 = Double.parseDouble(initV);
                Double input4 = (input3*input) + (.5*input2*Math.pow(input,2));
                Main.t2.setText(String.valueOf(input4) + " meters");
            }else if(!dist.isEmpty() && !time.isEmpty() && !initV.isEmpty()){
                Double input = Double.parseDouble(dist);
                Double input2 = Double.parseDouble(time);
                Double input3 = Double.parseDouble(initV);
                Double input4 = (input - (input3 * input2))/(.5 * Math.pow(input2,2));
                Main.t2.setText(String.valueOf(input4) + " (m/2)");
            }else{
    
            }
    }
    public void idk6(String dist, String acc,String finalV,String initV){
        if(!dist.isEmpty() && !acc.isEmpty() && !finalV.isEmpty() && !initV.isEmpty()){
            //time,acc,final,inital
            }else if(!dist.isEmpty() && !acc.isEmpty() && !finalV.isEmpty()){
                Double input = Double.parseDouble(dist);
                Double input2 = Double.parseDouble(acc);
                Double input3 = Double.parseDouble(finalV);
                Double input4 = Math.sqrt(Math.pow(input3, 2)-(2 * input2) * input);
                Main.t2.setText(String.valueOf(input4) + " (m/2)");
            }else if(!dist.isEmpty() && !finalV.isEmpty() && !initV.isEmpty()){
                Double input = Double.parseDouble(dist);
                Double input2 = Double.parseDouble(finalV);
                Double input3 = Double.parseDouble(initV);
                Double input4 = Math.pow(input2-input3, 2)/(input * 2);
                Main.t2.setText(String.valueOf(input4) + " seconds");
            }else if(!acc.isEmpty() && !finalV.isEmpty() && !initV.isEmpty()){
                Double input = Double.parseDouble(acc);
                Double input2 = Double.parseDouble(finalV);
                Double input3 = Double.parseDouble(initV);
                Double input4 = Math.pow(input2-input3,2)-(2*input);
                Main.t2.setText(String.valueOf(input4) + " meters");
            }else if(!dist.isEmpty() && !acc.isEmpty() && !initV.isEmpty()){
                Double input = Double.parseDouble(dist);
                Double input2 = Double.parseDouble(acc);
                Double input3 = Double.parseDouble(initV);
                Double input4 = input3 + Math.sqrt(2 * input2 * input);
                Main.t2.setText(String.valueOf(input4) + " (m/2)");
            }else{
    
            }
    }
}
 

