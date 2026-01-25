package application;

import entities.Room;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        Room[] rooms = new Room[10];

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Rent #%d:%n", i+1);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            rooms[room] = new Room(room, name, email);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(rooms[i]);
            }
        }

        // Outra maneira de utilizar o for
        for (Room rents : rooms) {
            if (rents != null) {
                System.out.println(rents);
            }
        }

        sc.close();
    }
}
