import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExercises {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Blue");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("Green");

        // Напишите Java-программу, чтобы получить первое и последнее вхождение указанных элементов в связанном списке.
        System.out.println(l_list);
        Object first_element = l_list.getFirst();
        System.out.println(first_element);

        Object last_element = l_list.getLast();
        System.out.println(last_element);

        //Напишите Java-программу для удаления указанного элемента из связанного списка.
        String elementToRemove = "Pink";
        if (l_list.remove(elementToRemove)) {
            System.out.println(elementToRemove+" удален");
        } else {
            System.out.println(elementToRemove + "не найден");
        }
        System.out.println(l_list);

        // Напишите Java-программу, которая меняет местами два элемента в связанном списке.
        Collections.swap(l_list, 1,2);
        System.out.println(l_list);

        //Напишите Java-программу для извлечения, но не удаления первого элемента связанного списка.
        String first = l_list.getFirst();
        System.out.println(first);

        //Напишите Java-программу для извлечения, но не удаления последнего элемента связанного списка.
        String last = l_list.getLast();
        System.out.println(last);

        //Напишите Java-программу для замены элемента в связанном списке.
        l_list.set(0, "Apple");
        System.out.println(l_list);
    }
}
