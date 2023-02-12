package pl.javasolution.szkolenie4.zadania;

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userChoice;
        int students = 70;
        String companyName = "Devs-Mentoring.pl";
        int rise = 2021;

        do {
            System.out.println("Wybierz opcje : ");
            System.out.println("1. Wyswietl liczbe kursantow.");
            System.out.println("2. Wyswietl nazwe firmy");
            System.out.println("3. Wyswietl rok zalozenia firmy");
            System.out.println("4. Wyjdz.");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Liczba kursantow : " + students);
                    break;
                case 2:
                    System.out.println("Nazwa firmy : " + companyName);
                    break;
                case 3:
                    System.out.println("Rok zalozenia firmy : " + rise);
                    break;
                case 4:
                    System.out.println("Koniec programu.");
                    break;
                default:
                    System.out.println("Brak informacji.");
            }
        } while (userChoice != 4);

    }
}
