 import java.util.Scanner;


public class SqRootSimplifier {
  public static final Scanner CONSOLE = new Scanner(System.in);
  //====================================DIVIDERFINDER==============================
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
  
//====================================FACTOR FINDER==========================
/*
public static void factoring(int x){
    int y;
  
    for(int i=x; i >1; i = i -1){
   y = x % i;
      if ( y == 0){
       System.out.println(i);
      }
   }
 }
my factoring program. needs to be updated with variables but is short
*/
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
    
  //=======================================MAIN====================================
  
  public static void main ( String [] args){

    System.out.println("Prompt: ");
    int userNum = CONSOLE.nextInt();

    
    int dividerResult = 10;
    int factorResult = 10;
    int factorResult2 = 10;
    int counter = 0;
    int[] dividerArray = new int[20];
    int[] counterArray = new int[20];
    
    
   
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
    
    int counter2 = 0; //new counter declared
    int occurence = 0;
    
    for(int i = 0; i <= counter; i++) {
      counter2 = 0;
      occurence = 0;
      System.out.print(dividerArray[i] + ": ");
      
      
      for(int j = 0; j <= counter; j++) {
        System.out.print(dividerArray[j] + " ");
        
        //IMPORTANT IN counterArray:     Tens place = factor, ones place = times of occurence
        if(dividerArray[i] == dividerArray[j]) { 
          counterArray[counter2] = (dividerArray[i] * 10) + (occurence + 1);
          occurence = occurence + 1;
          
        }
      }
      
      System.out.println();
      System.out.println("CounterArray: " + counterArray[counter2] + "\n");
    }
    
    
    
    
    
    
    
  }
}






