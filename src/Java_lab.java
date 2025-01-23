import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Java_lab {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число через пробел ");
        String input =scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] numbers =  new int[inputArray.length];

        for(int i=0; i< inputArray.length; i++){
            numbers[i]=Integer.parseInt(inputArray[i]);
        }
        int sum=0;
        for(int num: numbers){
            sum+=num;
        }
        double averange = (double)sum/ numbers.length;

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        System.out.println("Sum : " + sum);
        System.out.println("Averange : " + averange);
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);

        System.out.print("Введите предложение: ");
        String sentence = scanner.nextLine().toLowerCase();

        String cleanedSentence = sentence.replaceAll("[^a-zA-Z0-9]", "");

        String reversedSentence = new StringBuilder(cleanedSentence).reverse().toString();
        if (cleanedSentence.equals(reversedSentence)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }

   }
}

