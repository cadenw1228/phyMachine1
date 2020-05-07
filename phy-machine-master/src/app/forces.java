package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class forces {
    public void test(){
        Main.btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                //
                String force = Main.f2[0].getText();
                //
                String mass = Main.f2[1].getText();
                //
                String acceleration = Main.f2[2].getText();
                //
                String momentum = Main.f2[3].getText();
                //
                String velocity = Main.f2[4].getText();
                //
                String impulse = Main.f2[5].getText();
                //
                String Dtime = Main.f2[6].getText();
                //
                String KE = Main.f2[7].getText();
                //
                String PE = Main.f2[8].getText();
                //
                String dist = Main.f2[9].getText();
                //
                String energy = Main.f2[10].getText();
                //
                String power = Main.f2[11].getText();
                idk1(force,mass,acceleration);
                idk2(momentum,mass,velocity);
                idk3(impulse,force,Dtime);
                idk4(KE,mass,velocity);
                idk5(PE,mass,dist);
                idk6(energy,force,dist);
                idk7(power,energy,Dtime);

            }
            //
            //
            public void idk1(String force,String mass,String acc){
                if(!force.isEmpty() && !mass.isEmpty() && !acc.isEmpty()){

                }else if(!force.isEmpty() && !mass.isEmpty()){
                    Double input = Double.parseDouble(force);
                    Double input2 = Double.parseDouble(mass);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + "  ohms");
                    Main.f3[3].setText(String.valueOf(input3));
                }else if(!mass.isEmpty() && !acc.isEmpty()){
                    Double input = Double.parseDouble(mass);
                    Double input2 = Double.parseDouble(acc);
                    Double input3 = input * input2;
                    Main.t2.setText(String.valueOf(input3) + " volts");
                    Main.f3[2].setText(String.valueOf(input3));
                }else if(!force.isEmpty() && !acc.isEmpty()){
                    Double input = Double.parseDouble(force);
                    Double input2 = Double.parseDouble(acc);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + " amps");
                    Main.f3[1].setText(String.valueOf(input3));
                }else{
                    
                }
            }
            //
            //
            public void idk2(String momentum,String mass,String velocity){
                if(!momentum.isEmpty() && !mass.isEmpty() && !velocity.isEmpty()){

                }else if(!momentum.isEmpty() && !mass.isEmpty()){
                    Double input = Double.parseDouble(momentum);
                    Double input2 = Double.parseDouble(mass);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + "  ohms");
                    Main.f3[3].setText(String.valueOf(input3));
                }else if(!mass.isEmpty() && !velocity.isEmpty()){
                    Double input = Double.parseDouble(mass);
                    Double input2 = Double.parseDouble(velocity);
                    Double input3 = input * input2;
                    Main.t2.setText(String.valueOf(input3) + " volts");
                    Main.f3[2].setText(String.valueOf(input3));
                }else if(!momentum.isEmpty() && !velocity.isEmpty()){
                    Double input = Double.parseDouble(momentum);
                    Double input2 = Double.parseDouble(velocity);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + " amps");
                    Main.f3[1].setText(String.valueOf(input3));
                }else{
                    
                }
            }
            //
            //
            public void idk3(String impulse,String force,String Dtime){
                if(!impulse.isEmpty() && !force.isEmpty() && !Dtime.isEmpty()){

                }else if(!impulse.isEmpty() && !force.isEmpty()){
                    Double input = Double.parseDouble(impulse);
                    Double input2 = Double.parseDouble(force);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + "  ohms");
                    Main.f3[3].setText(String.valueOf(input3));
                }else if(!force.isEmpty() && !Dtime.isEmpty()){
                    Double input = Double.parseDouble(force);
                    Double input2 = Double.parseDouble(Dtime);
                    Double input3 = input * input2;
                    Main.t2.setText(String.valueOf(input3) + " volts");
                    Main.f3[2].setText(String.valueOf(input3));
                }else if(!impulse.isEmpty() && !Dtime.isEmpty()){
                    Double input = Double.parseDouble(impulse);
                    Double input2 = Double.parseDouble(Dtime);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + " amps");
                    Main.f3[1].setText(String.valueOf(input3));
                }else{
                    
                }
            }
            //
            //
            public void idk4(String KE,String mass,String velocity){
                if(!KE.isEmpty() && !mass.isEmpty() && !velocity.isEmpty()){

                }else if(!KE.isEmpty() && !mass.isEmpty()){
                    Double input = Double.parseDouble(KE);
                    Double input2 = Double.parseDouble(mass);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + "  ohms");
                    Main.f3[3].setText(String.valueOf(input3));
                }else if(!mass.isEmpty() && !velocity.isEmpty()){
                    Double input = Double.parseDouble(mass);
                    Double input2 = Double.parseDouble(velocity);
                    Double input3 = input * input2;
                    Main.t2.setText(String.valueOf(input3) + " volts");
                    Main.f3[2].setText(String.valueOf(input3));
                }else if(!KE.isEmpty() && !velocity.isEmpty()){
                    Double input = Double.parseDouble(KE);
                    Double input2 = Double.parseDouble(velocity);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + " amps");
                    Main.f3[1].setText(String.valueOf(input3));
                }else{
                    
                }
            }
            //
            //
            public void idk5(String PE,String mass,String dist){
                if(!PE.isEmpty() && !mass.isEmpty() && !dist.isEmpty()){

                }else if(!PE.isEmpty() && !mass.isEmpty()){
                    Double input = Double.parseDouble(PE);
                    Double input2 = Double.parseDouble(mass);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + "  ohms");
                    Main.f3[3].setText(String.valueOf(input3));
                }else if(!mass.isEmpty() && !dist.isEmpty()){
                    Double input = Double.parseDouble(mass);
                    Double input2 = Double.parseDouble(dist);
                    Double input3 = input * input2;
                    Main.t2.setText(String.valueOf(input3) + " volts");
                    Main.f3[2].setText(String.valueOf(input3));
                }else if(!PE.isEmpty() && !dist.isEmpty()){
                    Double input = Double.parseDouble(PE);
                    Double input2 = Double.parseDouble(dist);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + " amps");
                    Main.f3[1].setText(String.valueOf(input3));
                }else{
                    
                }
            }
            //
            //
            public void idk6(String energy,String force,String dist){
                if(!energy.isEmpty() && !force.isEmpty() && !dist.isEmpty()){

                }else if(!energy.isEmpty() && !force.isEmpty()){
                    Double input = Double.parseDouble(energy);
                    Double input2 = Double.parseDouble(force);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + "  ohms");
                    Main.f3[3].setText(String.valueOf(input3));
                }else if(!force.isEmpty() && !dist.isEmpty()){
                    Double input = Double.parseDouble(force);
                    Double input2 = Double.parseDouble(dist);
                    Double input3 = input * input2;
                    Main.t2.setText(String.valueOf(input3) + " volts");
                    Main.f3[2].setText(String.valueOf(input3));
                }else if(!energy.isEmpty() && !dist.isEmpty()){
                    Double input = Double.parseDouble(energy);
                    Double input2 = Double.parseDouble(dist);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + " amps");
                    Main.f3[1].setText(String.valueOf(input3));
                }else{
                    
                }
            }
            public void idk7(String power,String energy,String Dtime){
                if(!power.isEmpty() && !energy.isEmpty() && !Dtime.isEmpty()){

                }else if(!power.isEmpty() && !energy.isEmpty()){
                    Double input = Double.parseDouble(power);
                    Double input2 = Double.parseDouble(energy);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + "  ohms");
                    Main.f3[3].setText(String.valueOf(input3));
                }else if(!energy.isEmpty() && !Dtime.isEmpty()){
                    Double input = Double.parseDouble(energy);
                    Double input2 = Double.parseDouble(Dtime);
                    Double input3 = input * input2;
                    Main.t2.setText(String.valueOf(input3) + " volts");
                    Main.f3[2].setText(String.valueOf(input3));
                }else if(!power.isEmpty() && !Dtime.isEmpty()){
                    Double input = Double.parseDouble(power);
                    Double input2 = Double.parseDouble(Dtime);
                    Double input3 = input / input2;
                    Main.t2.setText(String.valueOf(input3) + " amps");
                    Main.f3[1].setText(String.valueOf(input3));
                }else{
                    
                }
            }






        });

    }
}