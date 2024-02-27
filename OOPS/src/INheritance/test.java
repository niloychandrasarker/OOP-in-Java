
package INheritance;

public class test {
    public static void main(String[] args) {
        Person p1 = new Person();
         p1.name = "niloy";
         p1.age = 22;
         p1.Display1();
         
         Teacher t1 =  new Teacher();
         t1.name = "Anis sir";
         t1.age = 30;
         t1.qualification ="Assistant Professor";
         t1.Display1();
         t1.Display2();
    }
}
