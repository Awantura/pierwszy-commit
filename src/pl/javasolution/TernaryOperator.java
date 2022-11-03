package pl.javasolution;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek: ");
        int age = scanner.nextInt();
        System.out.println(age >= 18 ? "Jestes pelnoletni!" : "Do pelnoletnosci brakuje Ci " + (18 - age) + " lat!");
    }
}
