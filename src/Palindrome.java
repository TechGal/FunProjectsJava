import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {
        Scanner user_input = new Scanner(System.in);
        boolean found = false;

            System.out.println("What's your name?");
            String name = user_input.next();
            System.out.println("Hello " + name);

            while (found == false) {
                System.out.println("Enter a palindrome");
                String word = user_input.next();
                word = word.toLowerCase();
                String reverse = new StringBuffer(word).reverse().toString();
                if (word.equals(reverse)) {
                    System.out.println("You entered a palindrome!");
                    found = true;
                } else {
                    System.out.println(word + " is not a palindrome!");
            }
        }
    }
}

