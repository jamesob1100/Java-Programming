package week8;

import java.util.ArrayList;
import java.util.List;

/**
 * control with main class to set library items and display: branch code, libraryItems, description 
 * @author James OBrien
 * @param items
 * @return description, branch code
 */
public class LibraryDemo {

    public static void main(String[] args) {

        // Displays the shared branch code (static variable)
        // Observe: no object has been created yet
        System.out.println("Branch Code: " + LibraryItem.BRANCH_CODE);

        // Create a single list to hold both Books and Movies
        List<LibraryItem> items = new ArrayList<>();

        // Add different subclasses to the same list
        items.add(new Book("Clean Code", "Robert C. Martin"));
        items.add(new Movie("Spirited Away", "Hayao Miyazaki"));
        items.add(new Book("The Pragmatic Programmer", "Hunt & Thomas"));
        items.add(new Movie("The Good, The Bad and The Ugly", "Sergio Leone"));

        
        // ============================================
        // TODO 1: Add another Movie object above.
        // Observe the new item’s ID continues the sequence.
        // ============================================


        // ============================================
        // TODO 2: Demonstrate polymorphism.
        // Loop through the list and call describe().
        // Observe which version of describe() executes.
        // What do you notice about the item IDs?
        // ============================================
        System.out.println("\n=== Library Inventory ===");
        for (LibraryItem li : items) {
            System.out.println(li.describe());
        }

        // ============================================
        // TODO 3: Display static field behaviour.
        // Compare access via class name vs. via instance.
        // Uncomment the code below.
        // ============================================
        System.out.println("\n=== Static Field Demonstration ===");
        System.out.println("Accessing branch code via class: " + LibraryItem.BRANCH_CODE);
        System.out.println("Accessing branch code via instance: " + items.get(0).BRANCH_CODE);
        System.out.println("Next available ID: " + LibraryItem.getNextId());

        // ============================================
        // TODO 4: (Optional) Show object type + polymorphic call.
        // Uncomment this loop to display each class type at runtime.
        // ============================================
        System.out.println("\n=== (Optional) Show object type + polymorphic call ===");
        for (LibraryItem li : items) {
        	System.out.println(li.getClass().getSimpleName() + " → " + li.describe());
        }
    }
}