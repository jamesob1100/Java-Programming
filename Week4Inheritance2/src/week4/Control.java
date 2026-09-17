package week4;

import java.time.LocalDate;

public class Control {

    public static void main(String[] args) {

        System.out.println("\nCreating Person");
        Person p1 = new Person("John", LocalDate.of(2000, 9, 1), 2022, "21 Clontarf");

        System.out.println("\nCreating Student");
        Student s1 = new Student("Mary", LocalDate.of(2002, 4, 3), 2023, "22 Glasnevin", "BSc Computer Science");
        s1.setName("Jane");
        System.out.println(s1.getName());

        System.out.println("\nCreating Staff");
        Staff a1 = new Staff("Jay", LocalDate.of(1995, 9, 21), 2018, "18 Drumcondra", "Lecturer", "School of Computer Science");

        // Upcasting example: Student -> Person
        Person ps = s1; // implicit and safe

        // Array of Person references holding mixed objects (demonstrates polymorphism)
        Person[] people = {
            p1,
            s1,
            a1,
            new Student("Hannah", LocalDate.of(2002, 4, 3), 2023, "22 Glasnevin", "BSc Computer Science")
        };

        for (Person p : people) {
            System.out.println(p); // each prints its own overridden toString()
        }
    }
}