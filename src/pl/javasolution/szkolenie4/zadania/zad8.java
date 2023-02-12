package pl.javasolution.szkolenie4.zadania;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.println("Podaj liczbe do dodania : ");
            int nextNumber = number.nextInt();
            if (nextNumber < 1) {
                result+=nextNumber;
                break;
            }
            result+=nextNumber;
        }
        System.out.println("Suma tych liczb to : " + result );
    }
}
