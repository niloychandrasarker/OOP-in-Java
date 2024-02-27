/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Niloy Sarker
 */
public class Ractangle extends Shape{
    int height,width;
    Ractangle(int height,int width){
        this.height = height;
        this.width = width;
    }
    double area(){
        return height*width;
    }
}
