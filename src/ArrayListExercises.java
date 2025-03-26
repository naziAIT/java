import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrayListExercises {
    public static void main(String[] args) {
        // Напишите Java-программу для создания ArrayList цветов, добавьте дубликаты, затем удалите их и распечатайте уникальную коллекцию.
        List<String> colors=new java.util.ArrayList<>();
        colors.add("Write");
        colors.add("Write");
        colors.add("Red");
        colors.add("Black");
        colors.add("Green");
        colors.remove("Green");
        System.out.println(colors);
        HashSet<String> uniqueColors = new HashSet<>(colors);
        System.out.println("Уникальная коллекция: " + uniqueColors);

        //Напишите Java-программу для удаления третьего элемента из списка массивов.
        System.out.println(colors.remove(3));
        System.out.println(colors);

        //Напишите Java-программу для сортировки заданного списка массивов.
        Collections.sort(colors);
        System.out.println(colors);

        //Напишите Java-программу для извлечения части списка массивов
        List<String> sub_List = colors.subList(0, 2);
        System.out.println(sub_List);

        //Напишите Java-программу для объединения двух списков массивов.
        List<String> colors2=new java.util.ArrayList<>();
        colors2.add("Pink");
        colors2.add("Blue");
        colors2.add("Red");
        List<String> all = new java.util.ArrayList<>();
        all.addAll(colors);
        all.addAll(colors2);
        System.out.println(all);

        //Напишите Java-программу для очистки списка массивов.
        all.clear();
        System.out.println(all);
    }
}




