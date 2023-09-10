 package oop.triangle;
interface Shape {
double getArea();
    }
class Triangle implements Shape{
    @Override 
    public double getArea(){
     double base=1,height=1;
       double area= 0.5*base*height;
        System.out.println("Area of a Triangle is "+area);
        return area;
        
        
    }

    }
public class Triangle_1{
    public static void main(String[]args){
        Triangle t= new Triangle();
        t.getArea();
    }
}
