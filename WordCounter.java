import java.util.Scanner;

public class WordCounter {

    // this how to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine().trim(); // Read input and trim leading/trailing spaces
    }

    // this is to count the number of words in a sentence
    public static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0; // Return 0 if the sentence is empty
        }
        String[] words = sentence.split("\\s+"); // Split by one or more spaces
        return words.length; // Return the number of words
    }

    // Main method to execute the program
    public static void main(String[] args) {
        String sentence = getSentenceInput(); // Get user input
        int wordCount = countWords(sentence); // Count words in the sentence
        System.out.println("The sentence has " + wordCount + " words."); // Display result
    }
}
