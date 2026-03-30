package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String filePath = "C:\\temp\\in.txt";

        Map<String, Integer> votosUrna = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");

                String name = fields[0];
                Integer numero = Integer.parseInt(fields[1]);

                if (votosUrna.containsKey(name)) {
                    votosUrna.put(name, numero + votosUrna.get(name));
                }
                else {
                    votosUrna.put(name, numero);
                }

                line = br.readLine();
            }

            for (String key : votosUrna.keySet()) {
                System.out.println(key + ": " + votosUrna.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
