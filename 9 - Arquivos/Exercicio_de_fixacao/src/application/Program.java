package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        String path = "C:\\Users\\erikc\\Desktop\\teste/in.csv";

        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");

                String name = campos[0].trim();
                double value = Double.parseDouble(campos[1].trim());
                int quantity = Integer.parseInt(campos[2].trim());

                products.add(new Product(name, value, quantity));
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try (BufferedWriter brWriter = new BufferedWriter(new FileWriter("C:\\Users\\erikc\\Desktop\\teste/out.csv"))) {

            for (Product product : products) {
                brWriter.write(
                        product.getName() + ","
                        + String.format("%.2f", product.totalValue())
                );
                brWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
