package pl.javasolution;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoja liczbe: ");

        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 4 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (number % 4 == 0) {
            System.out.println("Buzz");
        }
        else if (number % 3 == 0) {
            System.out.println("Fizz");
        }
        else {
            System.out.println("N/A");
        }
    }
}
