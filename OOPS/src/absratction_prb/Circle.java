/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package absratction_prb;

/**
 *
 * @author Niloy Sarker
 */
public class Circle extends Shape {
        
    Circle(double r){
        super(r,r);
    }
    
    void area(){
         double result = Math.PI*dim1*dim2;
         System.out.println("Circle area : "+ result);
     }
}
