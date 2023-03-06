//Create interface Area with an abstarct method area()-Create interface Circumference with an abstract method circum()
//-Create abstract class Diameter with abstract method dia()-Create circle class with data member,
//radius and make the value of pi final. Create para constructor to take the value of radius.
//-Implement all the abstract methods.-Create a test class to call all methods resp. 

package PracticeOnPreviousjava;
  import java.util.Scanner;
interface Area
{
 void area();
}

interface Circumference
{
 void circum();
}

abstract class Diameter
{
 abstract void dia();
 
}

class Circle1 extends Diameter implements Area,Circumference 
{
 
 double pi=3.14;
 
 
 @Override
 public void circum() {
  // TODO Auto-generated method stub
  Scanner s= new Scanner(System.in);
  int radius= s.nextInt();
  System.out.println("Enter a radius :");
  System.out.println("Circumference of circle is "+(2*pi*radius));
  
 }
 @Override
 public void area() {
  // TODO Auto-generated method stub
  Scanner s= new Scanner(System.in);
  int radius= s.nextInt();
  System.out.println("Enter a radius :");
  System.out.println("Area of circle is "+(pi*radius*radius));
 
  
 }
 @Override
 void dia() {
  // TODO Auto-generated method stub
  Scanner s= new Scanner(System.in);
  int radius= s.nextInt();
  System.out.println("Enter a radius :");
  System.out.println("diameter of circle is "+(2*radius));
 
  
 }
}
public class InterfaceTest {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Circle1 c1=new Circle1();
  c1.area();
  c1.circum();
  c1.dia();
  
 }

}