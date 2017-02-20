import java.util.*;
public class Bmiimply {
String name;
double bmi;
double h,w;

void get()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter name");
name=s.nextLine();
System.out.println("Enter height");
h=s.nextDouble();
System.out.println("Enter weight");
w=s.nextDouble();
} 
void calculate()
{
bmi=w/(h*h);
System.out.println("ur bmi");
System.out.println(bmi);

}
void display()
{
if(bmi>0.00 && bmi<19.00)
{
System.out.println("under weight...Eat well");
}
else if(bmi>19.00 && bmi<26.00)
{
System.out.println("normal weight...maintain this");
}
else if(bmi>26.00 && bmi<30.00)
{
System.out.println("over weight...reduce ur food");
}
else
{
System.out.println("obese..say no to food");
}

}
}

import java.util.*;

public class BodyMassIndex {

public static void main(String[] args) {
Bmiimply bb=new Bmiimply();
Scanner s=new Scanner(System.in);
System.out.println("Enter no of persons");
int n=s.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("Person");
System.out.println(i);

bb.get();
bb.calculate();
bb.display();

}
} 
}