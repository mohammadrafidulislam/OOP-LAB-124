 

package rafid.person;

public class Person {
    String name;
    int age;
    public Person(){
        name = "Rafid";
        age = 30;
    }

    public static void main(String[] args) {
        Person myObj=new Person();
        System.out.println("My name is "+myObj.name);
        System.out.println("My age is "+myObj.age);
        
    }
}
