import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word, reversedWord;
        System.out.print("Please enter a word: ");
        word = input.next();
        reversedWord = reverse(word);
        if(word.equals(reversedWord))
            System.out.println("it is a palindrome");
        else
            System.out.println("it is not a palindrome");

    }

    public static String reverse(String word){
        String normal = word;
        int i;
        String reversed = "";
        for(i = normal.length();i>0;i--) {
            reversed += word.substring(i - 1, i);
        }
        return reversed;
    }
}
