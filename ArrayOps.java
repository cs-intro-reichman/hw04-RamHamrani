public class ArrayOps {
    static int[] array1;
    static int[] array2;
    static int[] array ;
    static int missingInt;
    public static void main(String[] args) {
         
        System.out.println(findMissingInt(array));
           System.out.println(secondMaxValue(array));
           System.out.println(containsTheSameElements(array1, array2));
           System.out.println(isSorted(array));


            }
        
    public static int findMissingInt(int[] array) {
        
        int[] newArray = new int[(array.length +1)];
        int arraySum = 0;
        int newArraySum = 0;
        
            for (int i = 0; i < (array.length -1); i++) {
                    arraySum += array[i];
            }
        
            for (int j = 0; j < newArray.length; j++) {
                newArraySum += newArray[j];
            }
                missingInt = newArraySum - arraySum;
                return missingInt;
            
                }
            
        
        
    public static int secondMaxValue(int [] array) {
        int maxValue = 0; int secondMaxValue = 0;

        for(int i=0; i<array.length; i++){
    
            if(maxValue < array[i]){
                maxValue = array[i];
            }
                if( maxValue > secondMaxValue && secondMaxValue < i){
                    secondMaxValue = array[i];
                }
            }
            return secondMaxValue;
        }
        
    

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
         boolean k = false;
         for(int i= 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    k = true;
                }
                    else{
                       k = false;
                    }
            } 
            i++;
                }
            
                return k;
            }
    

    public static boolean isSorted(int [] array) {
        boolean k = false;
        for(int i= 0; i < (array.length-1); i++) {
               if(array[i] > array[(i +1)]){
                   k = true;
               }
                   else{
                      break;
                   }
                   i++;
           } for(int i = 0; i < (array.length-1); i++){
                if(array[i] < array[(i+1)]){
                    k = true;
            }
            else{
                break;
            }
           }
           return k;
               }
           
               
           }

