import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface MathOperation {
    int operate(int a, int b);
}

class MathOp {
    public static void main(String[] args) {
        // 1
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> b != 0 ? a / b : 0;

        System.out.println("Addition: " + addition.operate(7, 3));
        System.out.println("Subtraction: " + subtraction.operate(7, 3));
        System.out.println("Multiplication: " + multiplication.operate(7, 3));
        System.out.println("Division: " + division.operate(9, 3));

        // 2
        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 55);
        Predicate<Integer> isOdd = num -> num % 2 != 0;
        List<Integer> oddNumbers = new ArrayList<>();
        numbers.forEach(num -> {
            if (isOdd.test(num)) {
                oddNumbers.add(num);
            }
        });

        System.out.println("Odd Numbers: " + oddNumbers);

        // 3
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.sort((a, b) -> b.compareTo(a));
        System.out.println("Sorted Names: " + names);

        // 4
        List<String> words = Arrays.asList("hello", "java", "lambda");
        Function<String, String> transform = s -> new StringBuilder(s.toUpperCase()).reverse().toString();
        List<String> transformedWords = new ArrayList<>();
        for (String word : words) {
            transformedWords.add(transform.apply(word));
        }
        System.out.println("Transformed Strings: " + transformedWords);

        // 5
        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        Consumer<String> printCity = city -> System.out.println(city);
        cities.forEach(printCity);

        // 6
        List<String> citiess = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        citiess.forEach(System.out::println);

        // 7
        int a = 25, b = 40;
        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}



