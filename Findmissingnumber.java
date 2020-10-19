public class Findmissingnumber{
    
    public static void main(String[] args) {     
            int[] sample  = {3,1,4,5};       
           System.out.print(findMissingNumbers(sample));
        }
    
    
        static int findMissingNumbers (int numbersArray[]){
    
          int lengthOfNumberArray = numbersArray.length + 1 ;
          int sumOfNumbersInArray = (lengthOfNumberArray * (lengthOfNumberArray + 1 )) / 2; //
          for (int k = 0; k < numbersArray.length; k ++) {//We traverse the array from the start to the end 
            sumOfNumbersInArray = sumOfNumbersInArray - numbersArray[k]; //update the total and Subtract each integer in the array from the total
          }
          return sumOfNumbersInArray;
         
        }
    
    }