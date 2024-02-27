/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Niloy Sarker
 */
public class test {
    public static void main(String[] args) {
        Shape  s = new Shape();
        Shape r = new Ractangle(10,20);
        Shape t = new Triangle(5,10);
        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());
    }
}
