import java.util.HashSet;

public class HashSetExercises {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Melon");
        fruits.add("lemon");

        //Напишите Java-программу для клонирования хэш-набора в другой хэш-набор.
        HashSet<String> new_fruits = new HashSet<>();
        new_fruits = (HashSet) fruits.clone();
        System.out.println(new_fruits);

        //Напишите Java-программу для сравнения двух наборов хэшей.
        HashSet<String> fruits2 = new HashSet<String>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Kiwi");
        fruits2.add("Tom");

        for (String element : fruits) {
            System.out.println(fruits2.contains(element) ? "Yes" : "No");
        }

        //Напишите Java-программу для сравнения двух наборов и сохранения одинаковых элементов.
        System.out.println(fruits);
        System.out.println(fruits2);
        fruits.retainAll(fruits2);
        System.out.println(fruits2);

        // Напишите Java-программу для удаления всех элементов из хэш-набора
        fruits2.clear();
        System.out.println(fruits2);

        //Напишите Java-программу для получения количества элементов в хэш-наборе
        System.out.println(fruits.size());
        System.out.println(fruits);

        //Напишите программу на Java для проверки того, пуст ли набор хэшей или нет.
        System.out.println(fruits.isEmpty());
    }
}