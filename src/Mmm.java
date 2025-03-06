import java.util.*;

class GenericUtils {
    public static <T> List<T> mergeAlternately(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() || j < list2.size()) {
            if (i < list1.size()) mergedList.add(list1.get(i++));
            if (j < list2.size()) mergedList.add(list2.get(j++));
        }
        return mergedList;
    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

class Task implements Comparable<Task> {
    private String taskName;
    private int priority;
    private int duration;

    public Task(String taskName, int priority, int duration) {
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public int compareTo(Task other) {
        if (this.priority != other.priority) {
            return Integer.compare(other.priority, this.priority);
        }
        return Integer.compare(this.duration, other.duration);
    }

    @Override
    public String toString() {
        return "[Priority " + priority + "] " + taskName + " (Duration: " + duration + " mins)";
    }
}


class TaskScheduler {
    private PriorityQueue<Task> taskQueue = new PriorityQueue<>();
    private Queue<Task> pendingQueue = new LinkedList<>();

    public void addTask(Task task) {
        taskQueue.offer(task);
    }

    public void processTask() {
        if (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing Task: " + task);
        } else {
            System.out.println("No priority tasks available.");
        }
    }

    public void delayTask(String taskName) {
        Iterator<Task> iterator = taskQueue.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getTaskName().equals(taskName)) {
                iterator.remove();
                pendingQueue.offer(task);
                System.out.println("Delaying Task: " + taskName);
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void displayScheduledTasks() {
        if (taskQueue.isEmpty()) {
            System.out.println("(No priority tasks)");
        } else {
            List<Task> tasks = new ArrayList<>(taskQueue);
            Collections.sort(tasks);
            System.out.println("Scheduled Tasks (sorted by priority):");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void displayPendingTasks() {
        if (pendingQueue.isEmpty()) {
            System.out.println("(No pending tasks)");
        } else {
            System.out.println("Pending Tasks (FIFO Order):");
            for (Task task : pendingQueue) {
                System.out.println(task.getTaskName() + " (Priority: " + task.getPriority() + ", Duration: " + task.getDuration() + " mins)");
            }
        }
    }
}


class MainT {
    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(new Task("Code Review", 3, 20));
        scheduler.addTask(new Task("System Update", 5, 45));
        scheduler.addTask(new Task("Database Backup", 2, 30));
        scheduler.addTask(new Task("Deploy New Feature", 5, 50));
        scheduler.addTask(new Task("Bug Fixing", 4, 25));

        System.out.println("\nTasks Added:");
        scheduler.displayScheduledTasks();

        System.out.println();
        scheduler.processTask();

        System.out.println();
        scheduler.delayTask("Code Review");

        System.out.println();
        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        System.out.println();
        scheduler.delayTask("Database Backup");

        System.out.println();
        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        System.out.println();
        scheduler.processTask();

        System.out.println();
        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        System.out.println();
        scheduler.processTask();

        System.out.println();
        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        System.out.println();
        scheduler.processTask();

        System.out.println();
        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();

        System.out.println();
        scheduler.processTask();

        System.out.println();
        scheduler.displayScheduledTasks();
        scheduler.displayPendingTasks();
    }
}
