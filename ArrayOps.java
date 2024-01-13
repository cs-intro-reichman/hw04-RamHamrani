public class ArrayOps {
    public static void main(String[] args) {
        int userArrayLength = Integer.parseInt(args[0]);
        int[] array = new int[userArrayLength] ;        
        int missingInt = findMissingInt(array);
            System.out.println(missingInt);
           System.out.println(secondMaxValue(array));
           System.out.println(containsTheSameElements(array, array));
           System.out.println(isSorted(array));


            }
        
    public static int findMissingInt(int[] array) {
                // Assuming the first command line argument is the length of the array
        int lengthOfArray = array.length;
        
                // Populate your arrays with some values (this is just an example)
        int[] missingArray = new int[lengthOfArray - 1];
        int[] newArray = new int[lengthOfArray];
        
                // Populate missingArray and newArray with some values
        
        int missingArraySum = 0;
        int newArraySum = 0;
        
            for (int i = 0; i < missingArray.length; i++) {
                    missingArraySum += missingArray[i];
            }
        
            for (int j = 0; j < newArray.length; j++) {
                newArraySum += newArray[j];
            }
            if (newArraySum > missingArraySum) {
                return newArraySum - missingArraySum;
                
            } else {
                  
                    return -1;
                }
            }
        
        
    public static int secondMaxValue(int [] array) {
        int j = 0; int k = 0;

        for(int i=0; i<array.length; i++){
    
            if(j < array[i]){
                j = array[i];
            }
                if( j > k && k < i){
                    k = array[i];
                }
            }
            return k;
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

