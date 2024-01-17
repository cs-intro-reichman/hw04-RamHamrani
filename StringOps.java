public class StringOps {
    static String inputString;
    static String resultString;
    static char character;
    static int[] indicesArray;

    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest(String str) {
        resultString = "";
        for (int i = 0; i < str.length(); i++) { 
            char currentChar = str.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar = (char) (currentChar + 32);
                switch (currentChar) {
                    case 'a', 'e', 'i', 'o', 'u':
                        currentChar = (char) (currentChar - 32);
                        break;
                }
                resultString += currentChar;
            } else {
                switch (currentChar) {
                    case 'a', 'e', 'i', 'o', 'u':
                        currentChar = (char) (currentChar - 32);
                        break;
                }
                resultString += currentChar;
            }
        }
        return resultString;
    }

    
    public static String camelCase(String str) {
        resultString = "";
        character = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character && i == 0) { // Checks if the first character is a space.
                while (str.charAt(i) == character) { // Skips all consecutive spaces.
                    i++;
                }
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) { // Checks if the first character after space is uppercase.
                    resultString += (char) (str.charAt(i) + 32);
                }
                if (str.charAt(i) >= 97 && str.charAt(i) <= 122) { // Checks if the first character after space is lowercase.
                    resultString += str.charAt(i);
                }
            } else if (str.charAt(i) == ' ' && i < str.length() - 1) { // Checks if a character between words is a space.
                while (str.charAt(i) == ' ' && i < str.length()) { // Skips all consecutive spaces.
                    i++;
                }
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) { // Checks if the character after space is uppercase.
                    resultString += str.charAt(i);
                } else {
                    resultString += (char) (str.charAt(i) - 32);
                }
            } else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) { // Checks if the character is uppercase.
                resultString += (char) (str.charAt(i) + 32); // Converts to lowercase.
            } else {
                resultString += str.charAt(i);
            }
        }
        return resultString;
    }

    public static int[] allIndexOf(String str, char chr) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                count++;
            }
        }
        indicesArray = new int[count];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                int temp = i;
                while (temp <= i && index < indicesArray.length) {
                    indicesArray[index] = temp;
                    index++;
                    temp++;
                }
            }
        }
        return indicesArray;
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
