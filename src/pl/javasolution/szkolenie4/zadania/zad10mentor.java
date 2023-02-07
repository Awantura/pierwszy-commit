package pl.javasolution.szkolenie4.zadania;

import java.util.Scanner;

public class zad10mentor {
    public static void main(String[] args) {
        int fuel = 0;
        int astronauts = 0;
        int flightAltitude = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the fuel level between 5000 and 30000L");
            fuel = scanner.nextInt();
        } while (fuel < 5000 || fuel > 30000);

        do {
            System.out.println("Enter the correct number of astronauts.");
            astronauts = scanner.nextInt();
        } while (astronauts > 7 || astronauts < 1);

        while (fuel > 0) {
            flightAltitude+=100;
            fuel -= 300+(100*astronauts);
            System.out.println("Actual flight distance is " + flightAltitude + ". Your fuel level is " + fuel);
        }
        if (flightAltitude > 2000) {
            System.out.println("Your ship arrived to orbit");
        }
        else {
            System.out.println("Your ship crashed.");
        }
    }
}
