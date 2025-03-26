import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueExercises {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(13);
        pq.add(14);
        pq.add(15);
        pq.add(16);

        //Напишите Java-программу для подсчета количества элементов в очереди с приоритетом
        System.out.println(pq.size());

        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        pq1.add(11);
        pq1.add(13);
        pq1.add(15);
        pq1.add(17);

        //Напишите Java-программу для сравнения двух очередей приоритетов.
        for ( Integer element: pq1){
            System.out.println(pq.contains(element)? "Yes" : "No");
        }

        //Напишите Java-программу для извлечения первого элемента очереди приоритетов
        System.out.println(pq.peek());

        // Напишите Java-программу для извлечения и удаления первого элемента.
        System.out.println(pq.poll());
        System.out.println(pq);

        //Напишите Java-программу для преобразования приоритетной очереди в массив, содержащий все ее элементы.
        List<Integer> arr = new ArrayList<>(pq);
        System.out.println(arr);

        //Напишите Java-программу для удаления всех элементов из приоритетной очереди.
        pq.clear();
        System.out.println(pq);

    }
}
