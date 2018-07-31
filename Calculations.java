import java.util.*;
public class Calculations {
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  //multipleFinder------------------------------------------------------------------------------------------------
  public static void multipleFinder(){
    Scanner CONSOLE = new Scanner(System.in);
    System.out.println("Multiples Finder");
    System.out.println("Enter a counting number: ");
      
    //Controlling userInput
      while( !CONSOLE.hasNextInt() ) {
       CONSOLE.next();
        System.out.println( "Enter a counting number: ");
      }
      int userNum =CONSOLE.nextInt();
      
      while(userNum <= 0){
        System.out.println("Please enter a counting greater than 0");
        System.out.print("Enter a counting number: ");
        userNum = CONSOLE.nextInt();  
      }
      
      //Variables
      int counter = 1;
      int allFactors= 1;
      int realFactors =1;
      System.out.println();
      System.out.print("Factors: ");
      
      //actual calculations
      while ( counter <= userNum ){
        allFactors = userNum / counter;
        
        if( userNum == ( allFactors * counter ) ) {
          realFactors = allFactors;
          System.out.print(realFactors + " ");
        }
        
        counter = counter + 1;
      }
      System.out.println();
  
  }
  
  public static void quadCalc (){
          
      System.out.println("Quadratic Formula Calculator: ");
      System.out.println("Enter the 3 values (a, b, c)");
      
      double aUser = CONSOLE.nextDouble();
      double bUser = CONSOLE.nextDouble();
      double cUser = CONSOLE.nextDouble();
      
      //System.out.println("aUser: " + aUser);
      //System.out.println("bUser: " + bUser);
      //System.out.println("cUser: " + cUser);
      
      double firstAns = 1;
      double secondAns = 1; 
      double sqrtAns = Math.sqrt((Math.pow(bUser,2)) - ((4*aUser*cUser)));
      //System.out.println("\nsqrtAns: " + sqrtAns);
      if(sqrtAns < 0){
        //System.out.println("sqrtAns is negative");
        sqrtAns = Math.abs(sqrtAns);
        firstAns = (-bUser + sqrtAns)/(2.*aUser);
        secondAns = (-bUser - sqrtAns)/(2.*aUser);
        
        System.out.println(firstAns + "i");
        System.out.println(secondAns + "i");
        
        
        
      }
      else{
        //System.out.println("sqrtAns is positive");
        firstAns = (-bUser + sqrtAns)/(2.*aUser);
        secondAns = (-bUser - sqrtAns)/(2.*aUser);
        
        System.out.println(firstAns);
        System.out.println(secondAns);
        
      }
      
    
                    
    
  }
  
}



