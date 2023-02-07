package pl.javasolution.szkolenie4.zadania;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        int count;
        float sum = 0, mean;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        count = scanner.nextInt();

        System.out.println("Enter " + count + " Elements");
        for (int i = 0; i < count; i++) {
            sum += scanner.nextInt();
        }
        mean = sum/count;
        System.out.println("Mean is " + mean);
    }
}
