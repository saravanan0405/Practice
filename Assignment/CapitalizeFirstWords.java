public class CapitalizeFirstWords {

    public static void main(String[] args) {
        String input = "java is object oriented";
        String capitalizedString = capitalizeWords(input);
        System.out.println("Original String: " + input);
        System.out.println("Capitalized String: " + capitalizedString);
    }

    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        String str = "";

        
        boolean capitalized = true;
        
        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                capitalized = true;
                str += ch; 
                
            } else if (capitalized) {
                str += Character.toUpperCase(ch);
                capitalized = false;
                
            } else {
                str += ch;
            }
        }

        return str;
    }
}
