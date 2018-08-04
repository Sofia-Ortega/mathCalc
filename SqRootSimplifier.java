 import java.util.*;


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
    //int[] counterArray = new int[50];
    
    
   
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
    
    
    //-----------------------------------------------------------------------
    
    //gets freqency of factors
    int numElem = counter + 1;
    System.out.println("numElem: " + numElem);
    int[] intArray = new int[numElem];
    int[] iArray = new int[numElem];

    

    //sorts least to greatest
    //Arrays.sort(dividerArray);

    //gets freqency of each num in array using GetFreq method
    for (int i = 0; i < numElem; i++) {
    int aNum = dividerArray[i];
    intArray[i] = GetFrequencyOfNum(dividerArray, numElem, aNum);
   
    }

    
    //prints out (not necessary)
    int prevNum = 0;
    int icounter = 0;
    
    for (int i = 0; i < numElem; i++) {
      if(!(prevNum == dividerArray[i])) {
        System.out.print(dividerArray[i] + " -- ");
        System.out.println(intArray[i] + "\ti: " + i);
        
        //i stored in Array (necessary)
        iArray[icounter] = i;
        icounter = icounter + 1;
      }
      prevNum = dividerArray[i];
    }
    
    System.out.println();
    

    int currNum = 0;
    int freqNum = 0;
    int counter2 = 0;
    int currNumTotal = 0;
    int theOutside = 1;
    //int theInside = 1;
    
    for (int i = 0; i < icounter; i++) {
      
      currNum = dividerArray[iArray[i]];
      freqNum = intArray[iArray[i]];
      System.out.println("currNum: " + currNum + " " + "freqNum: " + freqNum);
        
      if(freqNum > 1) {
        //if(counter2 == 0) {
         // theOutside = currNum;
         // counter2 = 1;
        //}
        freqNum = (freqNum / 2);
        System.out.println(freqNum);
        currNumTotal = currNumTotal + currNum;
        System.out.println("The Outside... " + theOutside);
        theOutside = theOutside * currNum;
        
        
        
      }
      
       
    }
    
    System.out.println("theOutside: " + theOutside); //SUCESS!!!!
    
    
    
    
    
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
  
  //---------------------------GET FREQ OF NUM---------------------------------

public static int GetFrequencyOfNum(int[] numList, int listSize, int currNum) {
  int counter = 0;
    for( int i = 0; i < listSize; i++) {
      if(numList[i] == (currNum)){
        counter = counter + 1;
      }
    }

  return counter;
  }
  



}








