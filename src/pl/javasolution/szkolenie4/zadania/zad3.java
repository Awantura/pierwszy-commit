package pl.javasolution.szkolenie4.zadania;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolna liczbe :");
        int value = scanner.nextInt();
        System.out.println("Twoje liczby : ");
        for (int i = 0; i < value; i++) {
            System.out.println(i);
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe :");
        int value = scanner.nextInt();
        int i = 0;
        System.out.println("Twoje liczby :");
        while (i < value){
            System.out.println(i);
            i++;
        }
    }
}
