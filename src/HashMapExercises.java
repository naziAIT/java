import java.util.HashMap;

public class HashMapExercises {
    public static void main(String[] args){
        HashMap< String, Integer > hash_map = new HashMap < String, Integer > ();
        hash_map.put("Red", 1);
        hash_map.put("Green", 2);
        hash_map.put("Black", 3);
        hash_map.put("White", 4);
        hash_map.put("Blue", 5);
        System.out.println(hash_map);

        //Напишите Java-программу для проверки того, содержит ли карта отображение для указанного ключа.
        if (hash_map.containsKey("Green")) {
            System.out.println("yes! - " + hash_map.get("Green"));
        } else {
            System.out.println("no!");
        }

        //Напишите Java-программу для получения коллекционного представления значений, содержащихся в этой карте
        System.out.println(hash_map.values());

        //Напишите Java-программу для получения значения указанного ключа в карте.
        System.out.println(hash_map.get("Red"));

        //Напишите Java-программу для проверки того, содержит ли карта сопоставления ключ-значение (пусто) или нет.
        boolean result= hash_map.isEmpty();
        System.out.println(result);

        //Напишите Java-программу для получения поверхностной копии экземпляра HashMap.
        HashMap<String, Integer> new_hash_map= new HashMap<>();
        new_hash_map = (HashMap<String, Integer>)hash_map.clone();
        System.out.println(new_hash_map);

        //Напишите Java-программу для удаления всех отображений с карты.
        hash_map.clear();
        System.out.println(hash_map);

    }
}
