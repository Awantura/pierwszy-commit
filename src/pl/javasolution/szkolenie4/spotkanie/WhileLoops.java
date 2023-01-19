package pl.javasolution.szkolenie4.spotkanie;

public class WhileLoops {
    public static void main(String[] args) {
        /*
        while(expression){
        code of block;
        }
         */

        int days = 0;

        while (days <= 10) {
            if (days == 3) {
                System.out.println("Skipping");
                days++;
                continue;
            }
            if (days == 7) {
                System.out.println("breaking");
                break;
            }
            System.out.println("Day: " + days);
            days++;
        }

//        int number = 1;
//        while (number % 9 != 0) {
//            System.out.println("number " + number);
//            number++;
//        }
//
//        boolean isTrue = true;
//        boolean b = !isTrue;

        //boolean isNumberGreater = 50 < 10;
    }
}
