package pl.javasolution.szkolenie4.zadania;

import java.util.Scanner;

public class materiały {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbe: ");
            int value = scanner.nextInt();
            if (value < 0) {
                System.out.println("Podales wartosc ujemna! Ignoruje...");
                continue;}
            sum += value;
        }
        System.out.println("Suma podanych liczb to " + sum);

    }
}
