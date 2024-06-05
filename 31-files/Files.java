import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    // In Java, files are controlled by importing the java.io.File library.
    // After importing the library, an object needs to be created from the File class.
    // The object can be used to create, read, write, and delete files.
    public static void main(String[] args) throws IOException {
        File myObj = new File("filename.txt");
        // Creating a file
        try {
            myObj.createNewFile(); // If the file already exists, this method will return false.
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing to the file
        FileWriter myWriter = new FileWriter("filename.txt");
        // The write() method is used to write to the file.
        myWriter.write("Hello, I'm Utku"); // Writing to the file
        myWriter.close();
        // Reading the file
        Scanner myScanner = new Scanner(myObj); // The Scanner class is used to read the file.
        while (myScanner.hasNextLine()) { // The hasNextLine() method is used to check if there is a line to read.
            String data = myScanner.nextLine();
            System.out.println(data);
        }
        myScanner.close();
        // Deleting the file
        // myObj.delete();
    }
}
