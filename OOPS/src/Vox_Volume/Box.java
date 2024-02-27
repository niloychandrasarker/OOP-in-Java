
package Vox_Volume;

/**
 *
 * @author Niloy Sarker
 */
public class Box {
    double height,width,depth;
    
    Box(double h,double w,double d){
        height = h;
        width = w;
        depth = d;
    }
    
    void DisplayBox()
    {
        double vol = height*width*depth;
        
        System.out.println("Volume : "+  vol);
    }
    
        public static void main(String[] args) {
            Box box1 = new Box(10,20,30);
            Box box2 = new Box(30,50,70);
            
            box1.DisplayBox();
            box2.DisplayBox();
    }
}
