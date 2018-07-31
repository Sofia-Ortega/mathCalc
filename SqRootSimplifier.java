 import java.util.Scanner;


public class SqRootSimplifier {
  public static final Scanner CONSOLE = new Scanner(System.in);
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
    int[] counterArray = new int[25]; 
    
    
   
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
    int switchNumber = 0;
    
    
    for( int i = 0; i <= counter; i++ ) {
      System.out.println("dividerArray[" + i + "]: " + dividerArray[i]);
    }
    //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    switch ( switchNumber ) {
      case 2: 
        counterArray[0] = counterArray[0] + 1;
      case 3:
      case 5:
      case 7:
      case 11:
      case 13:
      case 17:
      case 19:
      case 23:
      case 29:
      case 31:
      case 37:
      case 43:
      case 47:
      case 53:
      case 59:
      case 61:
      case 67:
      case 71:
      case 73:
      case 79:
      case 83:
      case 89:
      case 97:
        

      
    }
    
    /*
    int counter2 = 0; //new counter declared
    int occurence = 0;
    
    //---------------------------------------------------------------------------
    
    
    //Finding out number of occurences for each factor
    for(int i = 0; i <= counter; i++) {
      counter2 = 0;
      occurence = 0;
      System.out.print(dividerArray[i] + ": ");
      
      
      for(int j = 0; j <= counter; j++) {
        System.out.print(dividerArray[j] + " ");
        
        //IMPORTANT: in counterArray:     Tens place = factor, ones place = times of occurence
        if(dividerArray[i] == dividerArray[j]) { 
          counterArray[counter2] = (dividerArray[i] * 10) + (occurence + 1);
          occurence = occurence + 1;
          
        }
      }
      
      System.out.println();
      System.out.println("CounterArray: " + counterArray[counter2] + "\n");
    }
    
    */
    
    
    
    
    
    
  }
}






