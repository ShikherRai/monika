// we are using all the string features of java
public class StringExample {
    public static void main(String[] args) {
        // Creating a string
        String str = "Hello, World!";
        
        // Getting the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Converting to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);
        
        // Checking if the string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
        
        // Replacing a substring
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
        
        // Splitting the string
        String[] words = str.split(", ");
        System.out.println("Splitted words:");
        for (String word : words) {
            System.out.println(word);
        }
        
        // Trimming whitespace
        String strWithSpaces = "   Hello, Java!   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }
    
}