import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {

        // Create String array of colors
        String[] colors = new String[5];

        // Assign values to each index of the colors array
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "green";
        colors[3] = "yellow";
        colors[4] = "red";

        // Display the entire array of colors
        System.out.println();
        System.out.println("Initial array: ");
        System.out.println(Arrays.toString(colors));

        // Display each individual color on its own line
        System.out.println();
        System.out.println("Individual color on its own line:");
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        // Re-assign contents of a certain index to other color
        System.out.println();
        System.out.println("After reassignment of index 2: ");
        colors[2] = "orange";
        System.out.println(Arrays.toString(colors));

        // Array of integers using short-hand notation
        int[] numbers = {100, 200, 300, 400, 500};

        // Loop through the array above and display the contents
        System.out.println();
        System.out.println("Numbers in order:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Display array of numbers in reverse order
        System.out.println();
        System.out.println("Numbers in reverse order: ");

        // Reverse loop through the array
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // Length of the array
        System.out.println();
        System.out.println("Length of the colors array: " + colors.length);
        System.out.println("Length of the numbers array: " + numbers.length);

        // Looping using the enhanced for loop
        System.out.println();
        System.out.println("Colors using enhanced for loop:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Looping using Streams
        System.out.println();
        System.out.println("Looping through Colors using Streams:");

        // Convert array to stream and loop through it using forEach method
        Arrays.stream(colors).forEach(System.out::println);
        System.out.println();
        System.out.println("Looping through Numbers using Streams:");
        Arrays.stream(numbers).forEach(System.out::println);

        // FINAL NOTES
        // - Arrays is a utility class to keep in mind
    }
}