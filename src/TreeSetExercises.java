import java.util.TreeSet;

public class TreeSetExercises {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Apple");
        tree_set.add("Banana");
        tree_set.add("Kiwi");
        tree_set.add("Mango");

        //Напишите Java-программу для перебора всех элементов в наборе дерева
        for (String element : tree_set) {
            System.out.println(element);
        }

        //Напишите Java-программу для получения первого и последнего элементов в наборе дерева.
        System.out.println(tree_set.getFirst());
        System.out.println(tree_set.getLast());

        //Напишите Java-программу для клонирования списка наборов дерева в другой набор деревьев.
        TreeSet<String>treeSet2=new TreeSet<>();
        treeSet2=(TreeSet)tree_set.clone();
        System.out.println(treeSet2);

        //Напишите Java-программу, чтобы получить количество элементов в наборе дерева.
        System.out.println(tree_set.size());

        //Напишите Java-программу для сравнения двух наборов деревьев
        for (String element : treeSet2) {
            System.out.println(tree_set.contains(element) ? "Yes" : "No");
        }

        //Напишите Java-программу для удаления данного элемента из набора дерева.
        System.out.println(tree_set.remove("Kiwi"));
        System.out.println(tree_set);
    }
}
