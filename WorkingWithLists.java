import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        
        // Create a list of strings using the List interface and ArrayList class
        List<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        // Check size of the list
        System.out.println();
        System.out.println("Size of the list: " + colors.size());

        // Check if list contains a certain color
        System.out.println();
        System.out.println("Does the list contain 'blue'? " + colors.contains("blue"));
        System.out.println("Does the list contain 'yellow'? " + colors.contains("yellow"));

        // Display the list of colors
        System.out.println();
        System.out.println("Display Array List of colors: " + colors);

        // Loop through ArrayList using enhanced for loop
        System.out.println();
        System.out.println("Loop through colors using enhanced for loop:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Loop through array list using foreach
        System.out.println();
        System.out.println("Loop through colors using forEach method:");
        colors.forEach(System.out::println);

        // Loop through array list using for loop
        System.out.println();
        System.out.println("Loop through colors using for loop:");
        for (int i = 0; i < colors.size(); ++i) {
            System.out.println(colors.get(i));
        }

        // Immutable list of integers using List.of() method
        List<String> immutableListOfColors = List.of(
            "purple", 
            "orange", 
            "yellow"
        );
        System.out.println();
        System.out.println("Immutable list of colors: " + immutableListOfColors);

        // Add new color to the immutable list of colors
        // immutableListOfColors.add("pink"); // This will throw an UnsupportedOperationException  
        immutableListOfColors.add("green"); // This will throw an UnsupportedOperationException
    }
}
