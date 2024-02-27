/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_Overriding;

/**
 *
 * @author Niloy Sarker
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
         p1.name = "niloy";
         p1.age = 22;
         p1.Display();
         
         Teacher t1 =  new Teacher();
         t1.name = "Anis sir";
         t1.age = 30;
         t1.qualification ="Assistant Professor";
         t1.Display();

    }
}
