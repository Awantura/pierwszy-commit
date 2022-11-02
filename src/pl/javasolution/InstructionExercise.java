package pl.javasolution;

public class InstructionExercise {
    public static void main(String[] args) {
        int value = 11;
        if (value % 2 == 0) {
            System.out.println("Parzysta");
        }
        else{
            System.out.println("Nieparzysta");
        }


        double percentage = 20.0;
         if (percentage >= 0 && percentage < 20){
             System.out.println("Ocena niedostateczna.");
         }
         else if (percentage >= 20 && percentage < 40){
             System.out.println("Ocena dopuszczajaca.");
         }
         else if (percentage >= 40 && percentage < 60){
             System.out.println("Ocena dostateczna.");
         }
         else if (percentage >= 60 && percentage < 80){
             System.out.println("Ocena dobra.");
         }
         else if (percentage >= 80 && percentage < 90){
             System.out.println("Ocena bardzo dobra.");
         }
         else if (percentage >= 90 && percentage < 100){
             System.out.println("Ocena celujaca.");
         }
         else {
             System.out.println("Bledne dane.");
         }
    }
}
