 import java.util.Scanner;


public class SqRootSimplifier {
  public static final Scanner CONSOLE = new Scanner(System.in);
  
  //-------------------------------------------------------------------------------
  //=======================================MAIN====================================
  //------------------------------------------------------------------------------- 
  
  public static void main ( String [] args){

    System.out.println("Enter Square Root Number : ");
    int userNum = CONSOLE.nextInt();

    
    int dividerResult = 10;
    int factorResult = 10;
    int factorResult2 = 10;
    int counter = 0;
    int[] dividerArray = new int[20];
    int[] counterArray = new int[50];
    
    
   
    while ( dividerResult > 1 && factorResult > 1 ) {
      
      //Method used
      dividerResult = dividerFinder(userNum);  
      factorResult = factorFinder(userNum);
      
      //Ends factoring keeping factors equaling '1' out
      if(dividerResult != 1 && factorResult != 1) { 
        System.out.println("factorResult: " + factorResult);
        System.out.println("dividerResult: " + dividerResult + "\n");
        
        factorResult2 = factorResult;
        dividerArray[counter] = dividerResult;
        counter = counter + 1;
      }
      
      //Keeps factoring going w/simplified numbers
      userNum = factorResult;
    
    }
    
    //gets last factor
    dividerArray[counter] = factorResult2;
    
    
    System.out.println("\n");
    for( int i = 0; i <= counter; i++ ) {
      System.out.println("dividerArray[" + i + "]: " + dividerArray[i]);
      counterArray[dividerArray[i]] = counterArray[dividerArray[i]] + 1;
      System.out.println("counterArray[dividerArray[" + dividerArray[i] + "]]: " + counterArray[dividerArray[i]]);
      System.out.println();
    }
   
    System.out.println("\n");
    int counterInt  = 0;
    for( int i = 0; i <= counterInt; i++ ) {
      counterInt = counterArray[dividerArray[i]];
      if (counterInt >= 2) {
        System.out.println("counterInt: " + counterInt);
        System.out.println("outside sq root: " + (counterInt/2));
        
      }
    }
    
    
    
  }

//====================================DIVIDERFINDER (method)==============================
  public static int dividerFinder(int userNum){
    int divider = 1;
    int returnDivider = 1;
    int factor = 1;
    
    //Gets first multiple ( not 1 and userNum )
    while ( divider <= userNum && divider <= factor && divider != -100 ){
      factor = userNum / divider;
      
      if ( (factor * divider) == userNum && divider > 1 ) { 
        //System.out.println(factor + "\t" + divider);
        returnDivider = divider;
        divider = -100;
      }
      
      divider = divider + 1; 
    }
    
    return returnDivider;
    
    
  }
  
//====================================FACTOR FINDER (method)==========================

  public static int factorFinder(int userNum){
    int divider = 1;
    int factor = 1;
    int returnFactor = 1;
    
    //Gets first multiple ( not 1 and userNum )
    while ( divider <= userNum && divider <= factor && divider != -100 ){
      factor = userNum / divider;
      
      if ( (factor * divider) == userNum && divider > 1 ) { 
        //System.out.println(factor + "\t" + divider);
        returnFactor = factor;
        divider = -100;
      }
      
      divider = divider + 1; 
    }
    
    return returnFactor;
    
    
  }
  



}








