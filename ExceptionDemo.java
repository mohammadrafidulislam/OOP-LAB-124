 package oop.exceptiondemo;
 public class ExceptionDemo {

    public static void main(String[] args) {
        try{
        int a,b,result;
        a=5;
        b=0;
        result=a/b;
        System.out.println("Result is "+result);
         
        }
        catch(ArithmeticException o){
            System.out.println("Exception : "+o);
            System.out.println("It will show error");
             }
    }
}
