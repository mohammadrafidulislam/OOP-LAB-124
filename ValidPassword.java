package oop.validpassword;
import java.util.Scanner;
public class ValidPassword {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a password : ");
        String password = scan.nextLine();
        if(Valid(password)){
            System.out.println("It is a valid password ");
        }
        else{
            System.out.println("It is not a valid password ");
        }
       }
    public static boolean Valid(String password){
        if(password.length()<10){
            return false;
        }
        int digCount=0;
        for(char c: password.toCharArray()){
            if(Character.isDigit(c)){
                digCount++;
            }
        }
        if(digCount<2){
            return false;
        }
        if(!password.contains(" ")){
            return false;
        }
        return true;
    }
}
