package oops;

public class teacher {

  String name,gender,age,phone;
  
  teacher(){
      System.out.println("oops.teacher.<init>()");
  }
  
  teacher(String n,String g,String a,String ph){
      name = n;
      gender = g;
      age = a;
      phone = ph;
  }

  void DispalyInformation(){
            System.out.println("Name : "+ name);
            System.out.println("Gender : "+ gender);
            System.out.println("age : "+ age);
            System.out.println("Phone : "+ phone); 
            System.out.println("");
  }
    
}