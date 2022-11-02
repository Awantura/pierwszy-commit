package pl.javasolution;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek: ");
        int value = scanner.nextInt();
        System.out.println("Masz " + value + " lat.");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        String name = scanner1.nextLine();
        System.out.println("Masz na imie " + name +".");
    }
}
