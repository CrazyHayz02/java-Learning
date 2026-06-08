import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    static void TestWrite () {
         try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello World\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        }
    }

    static void TestRead () {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            String line;

            // readLine() returns null when it reaches the end of the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close(); // Always close your readers!
        } catch (IOException e) {
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestWrite();
        TestRead();
    }

}
