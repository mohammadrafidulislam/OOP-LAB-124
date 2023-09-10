 package oop.shape;
abstract class Shape {
     abstract void printArea(double length,double breadth);
     void display(){
         }
 }
class Rectangle extends Shape{
    @Override
    void printArea(double length, double breadth){
        double area= length*breadth;
        double perimeter=2*(length*breadth);
        System.out.println("Area of rectangle is "+area);
        System.out.println("Area of perimeter is "+perimeter);
    }
}
public class Rectangle_2{
    public static void main(String[]args){
    Rectangle r=new Rectangle();
    r.printArea(6,5);
    r.display();
    }
}

    
   