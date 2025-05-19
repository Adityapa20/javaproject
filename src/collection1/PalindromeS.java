package collection1;

public class PalindromeS {
    public static void main(String[] args) {
    	//palindorome means amma, madam, both side same
        String name = "amma";  // Example input (Palindrome)
        boolean isPalindrome = true; 
        
        // Loop to check characters from both ends
        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {
                isPalindrome = false; // Found a mismatch
                break; // Exit loop early (optimization)
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("String is a palindrome: " + name);
        } else {
            System.out.println("String is not a palindrome: " + name);
        }
    }
}
