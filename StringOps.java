public class StringOps {
    static String str;
    static String res;
    static String string;
    static char isWhiteSpace;
    static int i;
    static int[] arr;
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String str) {
        String res = "";
        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar = (char) (currentChar + ('a' - 'A'));
                switch (currentChar) {
                    case 'a', 'e', 'u','i', 'o'  : 
                    currentChar =(char) (currentChar - 32) ;
                        break;
                }
                res += currentChar;
                }  
            }
                return res;

            }


    public static String camelCase (String string) {
        res = "";
        isWhiteSpace = ' ';
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == isWhiteSpace && i == 0) { // checks if the first char is a white space
            while (str.charAt(i) == isWhiteSpace) { // skip all spaces
                i++;
    } 
       
    if (str.charAt(i) >= 65 && str.charAt(i) <= 90) { // check if the first char is uppercase and if so - changes it to lower and adds it
        res += (char) (str.charAt(i) + 32);
    }
    if (str.charAt(i) >= 97 && str.charAt(i) <= 122) { // if the first char is lowercase - add it
        res += str.charAt(i);
    }
} else if (str.charAt(i) == ' ' && i < str.length() - 1) { // if the char between words is space
    while (str.charAt(i) == ' ' && i < str.length()) { // skip all spaces
        i++;
    }
    if (str.charAt(i) >= 65 && str.charAt(i) <= 90) { // checks if the char after the space is uppercase ? if so it adds it
        res += str.charAt(i);
    } else {                                           // if its not, change it to uppercase and then add it.
        res += (char) (str.charAt(i) - 32);
    }
} else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                                                        // check if its uppercase, if so - convert to lowercase and adds
    res += (char) (str.charAt(i) + 32);
} else {
    res += str.charAt(i);
}
}
return res;
}
    
        
            
       


    
    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                count++;
            }
        }
        arr = new int[count];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
        int temp = i;
        while (temp <= i && index < arr.length) {
            arr[index] = temp;
            index++;
            temp++;
        }

    }
}
return arr;
}

public static void printArray(int[] array) {
System.out.print('{');
for (int i = 0; i < array.length; i++) {
    System.out.print(array[i]);
    if (i < array.length && i != array.length - 1) {
        System.out.print(", ");
    }
    if (i == array.length - 1) {
        System.out.print("}");
    }
}
System.out.println();
}
}
