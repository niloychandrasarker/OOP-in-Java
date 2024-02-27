/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_Overriding;

/**
 *
 * @author Niloy Sarker
 */
public class Teacher extends Person{
    String qualification;
    
    @Override
    void Display(){
     
        System.out.println("Name : " + name);
       System.out.println("Age : " + age);
        System.out.println("Qalification : " + qualification);
    }
}
