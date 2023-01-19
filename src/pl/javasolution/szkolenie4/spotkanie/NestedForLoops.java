package pl.javasolution.szkolenie4.spotkanie;

public class NestedForLoops {
    public static void main(String[] args) {
        int week = 4;
        int days = 7;

        //outer loop
        for (int i = 1; i <= week; i++) {
            System.out.println("Week: " + i);
            //inner loop
            for (int j = 1; j <= days; j++) {
                System.out.println(" Day: " + j);
            }
        }

    }
}
