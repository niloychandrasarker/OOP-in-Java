/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperKeayword;

/**
 *
 * @author Niloy Sarker
 */
public class Car extends Vehicle{
    int gear;
    
    Car(String c,double w,int g){
          super(c,w);
          gear = g;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Gear : " + gear);
    }
    
}
