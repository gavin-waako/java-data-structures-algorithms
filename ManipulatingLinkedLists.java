import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class ManipulatingLinkedLists {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person("John", 30));
        linkedList.add(new Person("Jane", 25));
        linkedList.add(new Person("Bob", 35));

        // Add to the beginning of the list
        linkedList.addFirst(new Person("Alice", 28));

        System.out.println("Linked List: " + linkedList);

        System.out.println("\nIterating forward through the linked list:");
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        // Fixed: Iterating backwards requires moving to the end first
        System.out.println("\nIterating backwards through the linked list:");
        ListIterator<Person> personListIterator2 = linkedList.listIterator(linkedList.size());
        while (personListIterator2.hasPrevious()) {
            System.out.println(personListIterator2.previous());
        }
    }

    public static void queues() {
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
