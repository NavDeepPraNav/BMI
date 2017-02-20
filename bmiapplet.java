import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.Event;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc extends Applet implements ActionListener{
Label l1=new Label("BMI Calculator");
Label l2=new Label("NAME");
TextField t1=new TextField(10);
Label l3=new Label("height in metre");
TextField t2=new TextField(10);
Label l4=new Label("weight in kg");
TextField t3=new TextField(10);
Button b=new Button("Calculate");
Label l5=new Label("BMI is");
TextField t4=new TextField(10);
Label l6=new Label("Status");
TextField t5=new TextField(30);
public void init()
{
setForeground(Color.red); 
setBackground(Color.blue); 
add(l1); //bmicalc
add(l2); //name
add(t1); //nametxt
add(l3); //hei
add(t2); //h
add(l4); //wei
add(t3); //w
add(b); //calb
add(l5); //bmilabl
add(t4); //bmians
add(l6); //stat
add(t5);//statans

b.addActionListener(this);

}
@Override
public void actionPerformed(ActionEvent arg0) {
// TODO Auto-generated method stub
double h=Double.parseDouble(t2.getText());
double w=Double.parseDouble(t3.getText());
double bmi=w/(h*h);
t4.setText("BMI"+Math.round(bmi));
if(bmi>0.00 && bmi<19.00)
{
t5.setText("under weight...Eat well");
}
else if(bmi>19.00 && bmi<26.00)
{
t5.setText("normal weight...maintain this");
}
else if(bmi>26.00 && bmi<30.00)
{
t5.setText("over weight...reduce ur food");
}
else
{
t5.setText("obese..say no to food");
}

}

}