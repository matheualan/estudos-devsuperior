package allpackages.leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readingWithBufferedAndFileReader {
    public static void main(String[] args) {

        String path = "C:\\Repositories\\allpackages.leitura-arquivo-java.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
