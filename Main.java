
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO A1: Create a File object for "grades.txt"
        File myFile = new File("grades.txt");
        // TODO A2: Use try-catch to handle FileNotFoundException
        try {

            // TODO B1: Create a Scanner to read the file
            Scanner input = new Scanner(myFile);

            // TODO B2: Print "Student Grades:"
            System.out.println("Student Grades:");

            // TODO B3: Read and print each line from the file
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }

            input.close();

        }
        // TODO C1: Catch FileNotFoundException
        catch (FileNotFoundException e) {

            // TODO C2: Print "File not found!"
            System.out.println("File not found!");
        }
    }
}
