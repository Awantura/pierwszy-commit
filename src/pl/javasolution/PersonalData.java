package pl.javasolution;

import java.util.Scanner;

public class PersonalData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie i nazwisko: ");
        String name = scanner.nextLine();
        System.out.println("Podaj swoj wiek: ");
        int age = scanner.nextInt();
        System.out.println("Podaj swoj wzrost: ");
        int height = scanner.nextInt();

        System.out.println("Hello " + name + "! Thank you for joining us. You are " + age + " years old and your height is " +
                height + ".");
    }
}
