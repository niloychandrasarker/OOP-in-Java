//package AreaCalculation;
import java.util.Scanner;

public class AreaCalculation {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("------Area Calculation-----\n");
    	 
    	while(true)
    	{
    		 
        	 System.out.println("\n\n 1.Area of Circle\n 2.Area of Triangle\n"
        	 		+ " 3.Area of Rectangle\n 4.Area of Square\n"
        	 		+ " 5.Area of Trapeziam\n 6.Area of Eclipse\n 7.Exit\n");
        	 System.out.print("Please Chose an Option(1-7) : ");
        	 String option=sc.nextLine();
        	 
        	 switch(option) {
        	 case "1":
        		 System.out.print("\nPlease Enter a Radius of Circle : ");
        		 Double r=sc.nextDouble();
        		 sc.nextLine();
        		 double area = Math.PI * Math.pow(r, 2);
        		 System.out.print("\nArea of Circle is : " + area );
        		 break;
        		 
        	 case "2":
        		 System.out.print("\nPlease Enter a Basse of Triangle : ");
        		 Double base=sc.nextDouble();
        		 sc.nextLine();
        		 System.out.print("\nPlease Enter a Height of Triangle : ");
        		 Double height=sc.nextDouble();
        		 sc.nextLine();
        		 double area1 = 0.5*base*height;
        		 System.out.print("\nArea of Triangle is : " + area1 );
        		 break;
        		 
        	 case "3":
        		 System.out.print("\nPlease Enter a Basse of Triangle : ");
        		 Double base1=sc.nextDouble();
        		 sc.nextLine();
        		 System.out.print("\nPlease Enter a Height of Triangle : ");
        		 Double height2=sc.nextDouble();
        		 sc.nextLine();
        		 double area2 = base1*height2;
        		 System.out.print("\nArea of rectengle is : " + area2 );
        		 break;
        		 
        	 case "4":
        		 System.out.print("\nPlease Enter a Arm of Squarre : ");
        		 Double arm=sc.nextDouble();
        		 sc.nextLine();
        		 double area3 =Math.pow(arm, 2);
        		 System.out.print("\nArea of Square is : " + area3 );
        		 break;
        		 
        	 case "5":
        		 System.out.print("\nPlease Enter a length of Trapeziam : ");
        		 Double a=sc.nextDouble();
        		 sc.nextLine();
        		 System.out.print("\nPlease Enter a width of Trapeziam : ");
        		 Double b=sc.nextDouble();
        		 sc.nextLine();
        		 System.out.print("\nPlease Enter a height of Trapeziam : ");
        		 Double h=sc.nextDouble();
        		 sc.nextLine();
        		 double area4 = ((a+b)/2)*h;
        		 System.out.print("\nArea of Trapeziam is : " + area4 );
        		 break;
        		 
        	 case "6":
        		 System.out.print("\nPlease Enter a Axis1 of Eclipse : ");
        		 Double x=sc.nextDouble();
        		 sc.nextLine();
        		 System.out.print("\nPlease Enter a Axis2 of Eclipse : ");
        		 Double y=sc.nextDouble();
        		 sc.nextLine();
        		 double area5 = Math.PI * x * y;
        		 System.out.print("\nArea of Eclipse is : " + area5 );
        		 break;
        		 
        	 case "7":
        		 System.out.println("Exiting the program. Goodbye!");
                 sc.close(); 
                 System.exit(0);

        	 default:
                 System.out.println("\nInvalid choice. Please choose again.");
        		 
        	 }
    	}
    	 
    	 
	}
}
