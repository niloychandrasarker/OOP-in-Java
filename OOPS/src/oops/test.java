
package oops;

public class test {
    public static void main(String[] args) {
            teacher teacher1 = new teacher("Niloy Chandra Sarker", "Male", "22", "01823709000");
            teacher1.DispalyInformation();
        
            teacher teacher2 = new teacher("Snigda Rani Sarker", "FeMale", "22", "01823709000");
            teacher2.DispalyInformation();
            
            teacher teacher3 = new teacher();
            teacher3.DispalyInformation();
    }
}
