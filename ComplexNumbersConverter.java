import java.util.*;
public class ComplexNumbersConverter{
  
  public static final Scanner CONSOLE = new Scanner(System.in);
    
  public static void main ( String args [] ) {
    System.out.println("Enter a and b (a + bi)");
    double a = CONSOLE.nextDouble();
    double b = CONSOLE.nextDouble();
    
    final double A = a;
    final double B = b;
    
    System.out.print(A + " + " + B + "i");
    System.out.print("  -->  ");
    
    a = Math.abs(a);
    b = Math.abs(b);
    
    double arcTan = Math.toDegrees(Math.atan((b/a))); //in degrees
    //System.out.println(arcTan);
    
    
    double hyp = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
    //System.out.println("hyp: " + hyp);
    
    if(B > 0 ) { // b positive
      if(A > 0){// a positve
        //1st quadrant (+a, +b)
        //System.out.println("1st quadrant");
        
      }
      else{
        //2nd quadrant (-a, +b)
        //System.out.println("2nd quadrant");
        arcTan = 180 - arcTan;
      }  
    }
    else{ // b negative
      if(A < 0){ //a negative
        //3rd quadrant (-a -b)
        //System.out.println("3rd quadrant");
        arcTan = 180 + arcTan;
      }
      else{
        //4th quadrant (+a -b)
        //System.out.println("4th quadrant");
        arcTan = 360 - arcTan;
      } 
    } 

    System.out.printf("%.2f[cos(%.2f) + sin(%.2f)i]%n", hyp, arcTan, arcTan); 
    
    
    
    
    
    
    
  }
}