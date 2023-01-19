package pl.javasolution.szkolenie4.zadania;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe ");
        int pow = scanner.nextInt();
        int number = 2;
        for (int i = 0; i <= pow; i++) {
            double pow1 = Math.pow(number, i);
            System.out.println(pow1);
        }
    }
}
