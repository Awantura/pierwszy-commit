package pl.javasolution.szkolenie4.zadania;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbe : ");
//        int k = scanner.nextInt();
//        for (int i = 50; i < 100; i++) {
//            if (i % k == 0) {
//                System.out.println(i);
//            }
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj przedzial liczb do dzielenia : ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("Podaj dzielnik : ");
        int k = scanner.nextInt();
        for (int i = firstNumber; i < secondNumber; i++) {
            if (i % k == 0) {
                System.out.println(i);
            }
        }
    }
}
