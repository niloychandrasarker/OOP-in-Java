/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperKeayword;

/**
 *
 * @author Niloy Sarker
 */
public class Vehicle {
    String color;
    double weight;
    
    Vehicle(String c,double w){
        color = c;
        weight = w;
    }
    
    void  display(){
        System.out.println("Color : "+color);
        System.out.println("Weight : "+weight);
    }
}
