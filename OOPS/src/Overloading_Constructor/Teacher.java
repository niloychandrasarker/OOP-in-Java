
package Overloading_Constructor;

public class Teacher {
    String name,gender;
    int phone;
    
    Teacher(){
        System.out.println("NO Information\n");
     }
    Teacher(String n,String g){
        name = n;
        gender = g;
    }
    Teacher(String n,String g, int ph){
        name = n;
        gender = g;
        phone = ph;
    }
    
    void DisplayInformation(){
        System.out.println("Name : "+ name);
        System.out.println("Gender : "+ gender);
        System.out.println("Phone : "+ phone);
        System.out.println("");
    }
}
