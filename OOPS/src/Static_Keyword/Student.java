/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Static_Keyword;


public class Student {
    String name;
    int id;
    static String uniName="Niter";
    Student(String n,int id){
        name = n;
        this.id = id;
    }
    void print(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("University : "+uniName);
        System.out.println("");
    }
}


