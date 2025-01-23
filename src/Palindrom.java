import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите предложение: ");
            String sentence = scanner.nextLine().toLowerCase();

            String cleanedSentence = sentence.replaceAll("[^a-zA-Z0-9]", "");

            String reversedSentence = new StringBuilder(cleanedSentence).reverse().toString();
            if (cleanedSentence.equals(reversedSentence)) {
                System.out.println("Это палиндром!");
            } else {
                System.out.println("Это не палиндром.");
            }
    }
}
