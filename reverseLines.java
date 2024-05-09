package lab_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reverseLines {
    public static void reverseLines(Scanner inputSc) {
        while (inputSc.hasNextLine()) {
            String line = inputSc.nextLine();
            String reversedLine = new StringBuilder(line).reverse().toString();
            System.out.println(reversedLine);
        }
    }

    public static void main(String[] args) {
        try {
            File inputFile = new File("reverseLine.txt"); 
            Scanner sc = new Scanner(inputFile);
            reverseLines(sc);
            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
    }
}

