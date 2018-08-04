import java.util.*;


/*Methods:
 * multipleFinder
 * quadCalc
 * 
 */
public class mathCalc
{
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main( String [] args )
  {
    
    //Calculations calc = new Calculations();
    
    //-------------------------------------Menu---------------------------------------------------------
    System.out.println("Welcome to mathCalc/n");
    System.out.println("Please enter the number of an option: ");
    System.out.println("  1)Multiple Finder");
    System.out.println("  2)Square Roots Simplifier");
    System.out.println("  3)Quadratic Formula"); //ONE OPTION
    
    int menuChoose = CONSOLE.nextInt();
    while(!(menuChoose >= 1 && menuChoose <=3 )){ //ONE OPTION
      System.out.println("Error: Wrong userInput");
      System.out.println("Please enter number between 1 and 3"); //ONE OPTION
      System.out.println("  1)Multiple Finder");
      System.out.println("  2)Square Roots Simplifier");
      System.out.println("  3)Quadratic Formula"); //ONE OPTION
      menuChoose = CONSOLE.nextInt();
    }
    //---------------------------------------------------------------------------------------------------
    
    
    
    //--------------------------------------------CALCULATOR---------------------------------------------
    
    
    
    
    
    switch(menuChoose) {
    
      
      
      
      case 1: //Mulitples Finders
        System.out.println("Multiples Finder");
        Calculations.multipleFinder();
        break;
        
     
      case 2: //Square Root Simplifier 
        System.out.println("Square Root Simplifier");
        Calculations.SqRootSimplifier();
        break;
      
      case 3: //Quadratic Equation
        System.out.println("Quadratic Formula Calculator: ");
        Calculations.quadCalc();
        break;
           
    } //switch
  
  }
}

