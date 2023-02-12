package pl.javasolution.szkolenie4.zadania;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctFuel = "25000";
        String answerFuel = "";
        final int correctAstro = 3;
        String answerAstro = "";
        final int flightAltitude = 200;


        while (!answerFuel.equals(correctFuel)) {
            System.out.println("This message is displayed until you enter a valid answer.");
            System.out.println("What is the level of fuel ? ");
            answerFuel = scanner.nextLine();
        }
        System.out.println("You entered the correct amount of fuel. ");

        while (!answerAstro.equals(correctAstro)) {
            System.out.println("This message is displayed until you enter a valid answer.");
            System.out.println("How many astronauts are on board ?");
            answerAstro = scanner.nextLine();

            System.out.println("Counting...");
            for (int i = 1; i <= correctAstro; i++) {
                System.out.println(i);
            }
            System.out.println("You entered correct number of astronauts.");
            break;
        }
        System.out.println("Counting the distance...");

    }


}

