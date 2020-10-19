public class Reversestring {

    public static void main(String[] args) {
       
               System.out.println(convertStringToArray("Lorem at"));
        
    }

    /*
    1. Convert the string to an array 
    2. traverse through each new character array ;
    

    */
    
    static String convertStringToArray(String string) {
       
        int arrayGroup = 4;
        char[] stringToArray = string.toCharArray();
        //boolean checkIfArray = stringToArray.getClass().isArray();
        
        int lengthOfNewStringArray = stringToArray.length;
        for(int j = 0; j < lengthOfNewStringArray; j = j + arrayGroup ) {

            int firstIndexOfArray = j;
            int lastIndexOfArray = Math.min(j + arrayGroup -1, lengthOfNewStringArray -1);

            while(firstIndexOfArray <= lastIndexOfArray) {
                char temporaryIndex = stringToArray[firstIndexOfArray];
                stringToArray[firstIndexOfArray] = stringToArray[lastIndexOfArray];
                stringToArray[lastIndexOfArray] = temporaryIndex;
                firstIndexOfArray++;
                lastIndexOfArray --;

            }            

        }       
       String newReversedString = new String(stringToArray);
        return  newReversedString;
    }

}
