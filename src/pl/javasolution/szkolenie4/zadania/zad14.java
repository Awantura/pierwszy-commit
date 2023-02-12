package pl.javasolution.szkolenie4.zadania;

import java.util.Random;
import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int positive = 0;
        int negative = 0;
        int biggestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        int number = 0;
        do {
            System.out.println("Wpisz ile liczb wygenerowac :");
            number = scanner.nextInt();
        } while (number < 2);
        for (int i = 0; i < number; i++) {
            int randomNumber = rand.nextInt(200) - 100;
            if (randomNumber > 0) {
                positive++;
                if (randomNumber > biggestNumber) {
                    biggestNumber = randomNumber;
                }
            }
            if (randomNumber < 0) {
                negative++;
                if (randomNumber < smallestNumber) {
                    smallestNumber = randomNumber;
                }
            }
        }
        System.out.println("Najwieksza liczba to " + biggestNumber);
        System.out.println("Najmniejsza liczba to " + smallestNumber);
        System.out.println("Ilosc dodatnich liczb to " + positive);
        System.out.println("Ilosc ujemnych liczb to " + negative);
    }
}

