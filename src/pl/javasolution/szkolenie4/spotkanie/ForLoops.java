package pl.javasolution.szkolenie4.spotkanie;

public class ForLoops {
    public static void main(String[] args) {

       /*
       for (init;expression;incrementation){
       some block of code
       }

       ctrl+alt+L - formatting code (beautify)
       for (int counter = 0; counter <= 5; counter++) {
            System.out.println("number " + counter);
        }
        */

        //shortening of equasion
        int number = 10;
        number = number * 3;
        number *= 3;
        /*
        for (double interest = 2.15; interest < 10; interest += 0.55) {
            double investment = 10000;
            double sum = investment * interest;
            System.out.println("Investment: " + sum);
        }*/

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Skipping");
                continue; // skipping rest of the code inside the loop
            }
            if (i == 8) {
                System.out.println("Breaking out of loop");
                break; // breaking out of the loop
            }
            System.out.println(i);
        }
    }
}
