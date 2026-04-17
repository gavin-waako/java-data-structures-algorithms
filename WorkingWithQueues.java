import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("WORKING WITH QUEUES");
        System.out.println("--------------------");
        System.out.println();

        // Create queue of people in supermarket using the Queue interface and LinkedList class
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("John", 30));
        supermarket.add(new Person("Jane", 25));
        supermarket.add(new Person("Bob", 35));

        // Display the queue size before removing anyone
        System.out.println();
        System.out.println("Size of the queue before removing anyone: " + supermarket.size());

        // Check first person in queue using peek() method
        System.out.println();
        System.out.println("First person in the queue: " + supermarket.peek());

        System.out.println();
        supermarket.poll(); // Remove first person from the queue
        System.out.println("After removing the first person:");
        System.out.println("Size of the queue: " + supermarket.size());
        System.out.println("First person in the queue: " + supermarket.peek());
    }

    // Create a record class for each individual in the supermarket queue
    static record Person(String name, int age) {}
}
