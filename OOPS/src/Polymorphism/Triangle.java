/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Niloy Sarker
 */
public class Triangle extends Shape {
    int base,height;
    
    Triangle(int base,int height){
        this.base = base;
        this.height = height;   
    }
    
    double area(){
        return 0.5*base*height;
    }
            
}
