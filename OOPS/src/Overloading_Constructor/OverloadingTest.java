
package Overloading_Constructor;

public class OverloadingTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Niloy Chandra Sarker", "Male" );
        teacher2.DisplayInformation();
        Teacher teacher3 = new Teacher("Omrit Chandra Sarker", "Male", 5635252);
        teacher3.DisplayInformation();
    }
}
