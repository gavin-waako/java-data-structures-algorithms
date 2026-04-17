import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("WORKING WITH STACKS");
        System.out.println("--------------------");
        System.out.println();

        // Create a stack of strings using the Stack class
        Stack<Integer> stacks = new Stack<>();

        // Check if the stack is empty        
        System.out.println();  
        System.out.println("Is the stack empty? " + stacks.isEmpty());

        // Add items to the stack using the push() method
        System.out.println();  
        stacks.push(100);
        stacks.push(200);
        stacks.push(300);

        // Check if the stack is empty     
        System.out.println();   
        System.out.println("Is the stack empty? " + stacks.isEmpty());

        // Display the stack
        System.out.println();  
        System.out.println("Stack: " + stacks);

        // View top most item inside the stack using peek() method
        System.out.println();  
        System.out.println("Top most item in the stack: " + stacks.peek());

        // Remove top most item from the stack using pop() method
        System.out.println();  
        System.out.println("Stack before popping: " + stacks);
        System.out.println();  
        System.out.println("Popped item from the stack: " + stacks.pop());
        System.out.println();  
        System.out.println("Stack after popping: " + stacks);
    }
}
