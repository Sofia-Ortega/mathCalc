import java.util.*;


/*Methods:
 * multipleFinder
 * quadCalc
 * 
 */
public class mathCalc
{

  public static void main( String [] args )
  {
    Scanner scnr = new Scanner(System.in);
    Calculations calc = new Calculations();
    
    //-------------------------------------Menu---------------------------------------------------------
    System.out.println("Welcome to mathCalc/n");
    System.out.println("Please enter the number of an option: ");
    System.out.println("  1)Square Roots Simplifier");
    System.out.println("  2)Multiple Finder");
    System.out.println("  3)Quadratic Formula"); //ONE OPTION
    
    int menuChoose = scnr.nextInt();
    while(!(menuChoose >= 1 && menuChoose <=3 )){ //ONE OPTION
      System.out.println("Error: Wrong userInput");
      System.out.println("Please enter number between 1 and 3"); //ONE OPTION
      System.out.println("  1)Square Roots Simplifier");
      System.out.println("  2)Multiple Finder");
      System.out.println("  3)Quadratic Formula"); //ONE OPTION
      menuChoose = scnr.nextInt();
    }
    //---------------------------------------------------------------------------------------------------
    
    
    
    //--------------------------------------------CALCULATOR---------------------------------------------
    
    
    //Square Root Simplifier-----------------------------------------------------------------------------
    //2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 83 89 97 -- prime numbers
    if(menuChoose == 1){
      System.out.println("Square Root Simplifier: ");
      System.out.println("Enter a Square root: ");
      
      //double userSqRt = scnr.nextDouble();
      int userNum = scnr.nextInt();  
      int counter = 1;
      int factors= 1;

      while ( counter <= userNum ){
        factors = userNum / counter;
        if( userNum == ( factors * counter ) ) {
          System.out.println(factors); //final factors here
        }
        counter = counter + 1;
  }
      
    }
    
    
    
    //Mulitiples Finder-------------------------------------------------------------------------------
    
    
    else if(menuChoose == 2){
      Calculations.multipleFinder();
      
   }
    
    //Quadratic Equation ------------------------------------------------------------------------------

    else if(menuChoose == 3){
      //QUADRATIC FORMULA = (-bUser + Math.sqrt(Math.pow(bUser,2) - (4*aUser*cUser)))/(2*aUser)
      Calculations.quadCalc();

  
  
  
    }
  }
}

