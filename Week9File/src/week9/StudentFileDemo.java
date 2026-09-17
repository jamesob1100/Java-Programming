
package week9;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentFileDemo {

    public static void main(String[] args) {
        String fileName = "students.txt";

        // 1. Read students from file into an ArrayList
        ArrayList<Student> students = readStudents(fileName);

        System.out.println("=== Students read from file ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // 2. Append a new student to the file
        Student newStudent = new Student("Ella", 23, "Artificial Intelligence");
        appendStudent(newStudent, fileName);

        // 3. Read again to show the appended student
        ArrayList<Student> studentsAfterAppend = readStudents(fileName);
        System.out.println("\n=== Students after appending ===");
        for (Student s : studentsAfterAppend) {
            System.out.println(s);
        }

        // 4. Add another student in memory and overwrite the file
        studentsAfterAppend.add(new Student("Grace", 24, "Cybersecurity"));
        writeAllStudents(studentsAfterAppend, fileName);
        System.out.println("\nOverwrote file with an extra student (Grace).");

        // 5. Final read to show contents of file now
        ArrayList<Student> finalList = readStudents(fileName);
        System.out.println("\n=== Final contents of " + fileName + " ===");
        for (Student s : finalList) {
            System.out.println(s);
        }
    }

    /**
     * Reads students from the given file into an ArrayList<Student>.
     * Expected line format: name,age,course
     */
    public static ArrayList<Student> readStudents(String fileName) {
        ArrayList<Student> students = new ArrayList<>();

        File file = new File(fileName);

        try (Scanner sc = new Scanner(file)) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();    // e.g. "Alice,21,Computer Science"
                if (line.isEmpty()) {
                    continue; // skip blank lines
                }

                String[] parts = line.split(",");

                // simple defensive check
                if (parts.length == 3) {
                    String name   = parts[0].trim();
                    int age       = Integer.parseInt(parts[1].trim());
                    String course = parts[2].trim();

                    students.add(new Student(name, age, course));
                } else {
                    System.out.println("Skipping malformed line: " + line);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not find file: " + fileName + " (" + e.getMessage() + ")");
        }

        return students;
    }

    /**
     * Appends a single student as a new line at the end of the file.
     * (Does not delete existing contents.)
     */
    public static void appendStudent(Student s, String fileName) {
        try (FileWriter fw = new FileWriter(fileName, true);
             PrintWriter out = new PrintWriter(fw)) {

            // Write student details as a CSV line
            out.println(s.getName() + "," + s.getAge() + "," + s.getCourse());

            System.out.println("Student appended successfully.");

        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }

    /**
     * Overwrites the file with all students from the list.
     * (Deletes old contents and replaces with this list.)
     */
    public static void writeAllStudents(ArrayList<Student> students, String fileName) {
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {

            for (Student s : students) {
                out.println(s.getName() + "," + s.getAge() + "," + s.getCourse());
            }

            System.out.println("File overwritten successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}