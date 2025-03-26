import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExercises {
    public static void main(String[] args) {
        TreeMap< Integer, String > tree_map = new TreeMap < Integer, String > ();

        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(40, "Black");
        tree_map.put(50, "White");
        tree_map.put(60, "Pink");

        // Напишите Java-программу для удаления и получения сопоставления ключ-значение, связанного с наибольшим ключом в этом сопоставлении.
        System.out.println(tree_map);
        System.out.println(tree_map.pollLastEntry());
        System.out.println(tree_map);

        //Напишите Java-программу для получения части карты, ключи которой варьируются от заданного ключа (включительно) до другого ключа (исключающего).
        SortedMap< Integer, String > sub_tree_map = new TreeMap < Integer, String > ();
        sub_tree_map = tree_map.subMap(20, 40);
        System.out.println(sub_tree_map);

        //Напишите Java-программу для получения части карты, ключи которой варьируются от одного ключа до другого.
        System.out.println(tree_map);
        sub_tree_map = tree_map.subMap(20, true, 40, true);
        System.out.println(sub_tree_map);

        //Напишите Java-программу для получения части карты, ключи которой больше или равны заданному ключу.
        System.out.println(tree_map.tailMap(20));

        //Напишите Java-программу для получения сопоставления ключ-значение, связанного с наименьшим ключом, большим или равным заданному ключу. Возвращаем null, если такого ключа нет.
        System.out.println(tree_map);
        System.out.println( tree_map.ceilingEntry(20));
        System.out.println(tree_map.ceilingEntry(50));

        //Напишите Java-программу для получения наименьшего ключа, большего или равного заданному ключу. Возвращает null, если такого ключа нет.
        System.out.println(tree_map.ceilingKey(50));

        //Напишите Java-программу для получения сопоставления ключ-значение, связанного с наибольшим ключом, строго меньшим, чем данный ключ. Возвращаем null, если такого ключа нет.
        System.out.println(tree_map.lowerEntry(40));

    }
}
