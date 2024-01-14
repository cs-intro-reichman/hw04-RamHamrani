public class ArrayOps {
    static int[] array1;
    static int[] array2;
    static int[] array;
    static int missingInt;
    public static void main(String[] args) {
         
        System.out.println(findMissingInt(array));
           System.out.println(secondMaxValue(array));
           System.out.println(containsTheSameElements(array1, array2));
           System.out.println(isSorted(array));


            }
        
    public static int findMissingInt(int[] array) {
        int arraySum = 0;
        int newArraySum = 0;
        
            for (int i = 0; i < array.length; i++) {
                    arraySum += array[i];
            }
        
            for (int j = 0; j < array.length; j++) {
                newArraySum += j;
            }
                missingInt = newArraySum - arraySum;
                return missingInt;
            
                }
            
        
        
    public static int secondMaxValue(int [] array) {
        int maxValue = 0; int secondMaxValue = 0;

        for(int i=0; i<array.length; i++){
            for(int j = 0; j<array.length; j++){
    
            if(maxValue < array[j]){
                maxValue = array[j];
            }
            }
                if( maxValue >= secondMaxValue && secondMaxValue < array[i]){
                    secondMaxValue = array[i];
                }
            }
            return secondMaxValue;
        }
        
    

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
         for(int i= 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++){
                if(array1[i] != array2[j]){
                     return false;
                }
                    }
                    
            } return true;
            
                }
            
    

    public static boolean isSorted(int [] array) {
        boolean isSorted = false;
        for(int i= 0; i < array.length; i++) {
               if(array[i] > array[(i +1)]){
                isSorted = true;
                }
                else{
                    break;
                }
               } 
           for(int i = 0; i < array.length;){
                if(array[i] < array[(i+1)]){
                    isSorted = true;
            }
            else{
                break;
            }
           }
           return isSorted;
        }}
           
               
           
