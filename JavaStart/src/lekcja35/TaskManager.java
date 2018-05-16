package lekcja35;

import java.util.PriorityQueue;
import java.util.Queue;

public class TaskManager {

    public static void main(String[] args) {
        Queue<Task> queue = new PriorityQueue<>();
        queue.offer(new Task("zadanie", "nowe zadanie", Priority.HIGH));

    }
}
