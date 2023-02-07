package pl.javasolution.szkolenie4.zadania;

public class zad11 {
    public static void main(String[] args) {
        String password = "yCef";
        char[] passArr = password.toCharArray();

        String brutePass = "";
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'r', 's', 't', 'u', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'W', 'X', 'Y', 'Z'};
        Boolean solved = false;
        StringBuilder forcedPass = new StringBuilder(brutePass);
        while (solved != true) {
            for (int j = 0; j < passArr.length; j++) {
                for (int i = 0; i < alphabet.length; i++) {

                    if (alphabet[i] == passArr[j]) {
                        forcedPass.append(passArr[j]);
                        System.out.println(forcedPass.toString());
                        solved = true;
                    }

                }

            }
        }
    }
}
