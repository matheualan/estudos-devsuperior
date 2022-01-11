package allpackages;

import allpackages.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//versao recomendada pelo prof em caso de allpackages.leitura de arquivo de texto
public class readingTryWithResourcers {
    public static void main(String[] args) {

        String path = "C:\\Repositories\\in.txt";
        List<Product> productList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            line = bufferedReader.readLine();//readLine 2x para pular o cabeçalho do arquivo, caso exista
            while (line != null) {
                String[] vect = line.split(",");
                String name = vect[0];
                Double price = Double.parseDouble(vect[1]);
                Integer quantity = Integer.parseInt(vect[2]);
                Product prod = new Product(name, price, quantity);
                productList.add(prod);

                line = bufferedReader.readLine();
            }
            System.out.println("PRODUCTS: ");
//            for (Product p : productList) {
//                System.out.println(p);
//            }
            productList.forEach(System.out::println); //Faz mesma coisa do foreach acima
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
