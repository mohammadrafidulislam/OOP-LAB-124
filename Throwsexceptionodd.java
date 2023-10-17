 package oop.throwsexceptionodd;
public class Throwsexceptionodd {
    //public void display(int number) throws IllegalArgumentException
    public static void display(int n) throws IllegalArgumentException{
        if(n%2!=0){
            throw new IllegalArgumentException(n+ " is odd");
        }
        else if(n%2==0){
            System.out.println(n+ "is even");
        }
        else{
            System.out.println("Nothing");
        }
}
    public static void main(String[]args){
        try{
            //Throwsexceptionodd obj=new Throwsexceptionodd();
            //obj.display(7)
            Throwsexceptionodd.display(7);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " +e);
        }
    }
}
