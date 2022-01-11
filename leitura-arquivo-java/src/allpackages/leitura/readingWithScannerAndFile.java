package allpackages.leitura;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class readingWithScannerAndFile {
    public static void main(String[] args) {

        File file = new File("C:\\Repositories\\allpackages.leitura-de-arquivo-java.txt");
        Scanner reader = null;
        try {
            reader = new Scanner(file);
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

    }
}
