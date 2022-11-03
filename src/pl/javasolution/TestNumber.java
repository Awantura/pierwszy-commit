package pl.javasolution;

import java.util.Scanner;

public class TestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolna liczbe: ");
        int value = scanner.nextInt();
        if (value % 2 == 0) {
            System.out.println("Twoja liczba jest parzysta.");
        }
        else {
            System.out.println("Twoja liczba jest nieparzysta.");
        }
    }
}
