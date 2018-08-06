import java.util.Scanner;
public class ReverseCmplxNumConv {
  
  public static final Scanner CONSOLE = new Scanner(System.in);

  public static void main (String args [] ) {
    
    System.out.println("Enter x and y ( x[cos(y) + sin(y)i] )");
    double x = CONSOLE.nextDouble();
    double y = CONSOLE.nextDouble();
    
    y = Math.toRadians(y);

                  
    double a = x * (Math.cos(y));
    double b = x * (Math.sin(y));
    
    
    System.out.println("( " + a + " + " + b + ") i");
    
    
  
  }
  
}