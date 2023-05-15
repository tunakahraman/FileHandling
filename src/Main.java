import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    }

    public static void createFile() {
        File file = new File("C:\\Users\\gorbu\\Desktop\\java\\stud\\filesCRUD\\src\\files.txt");
        try {
            if(file.createNewFile()) {
                System.out.println( "File created");
            }else {
                System.out.println("File is already exist!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public static void getFileInfo() {
        File file = new File("C:\\Users\\gorbu\\Desktop\\java\\stud\\filesCRUD\\src\\files.txt");
        if(file.exists()) {
            System.out.println("File name: " + file.getName() + "\n" + "File path: " + file.getAbsolutePath()
                    + "\n" + "File size: " + file.length());
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\gorbu\\Desktop\\java\\stud\\filesCRUD\\src\\files.txt");

        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void writeFile() {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Please write something: ");
        String input = scanner.nextLine();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\gorbu\\Desktop\\java\\stud\\filesCRUD\\src\\files.txt" ,true));
            writer.newLine();
            writer.write(input);
            System.out.println("Successfully changed!");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}