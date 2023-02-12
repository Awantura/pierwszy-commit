package pl.javasolution.szkolenie4.zadania;

public class zad11mentor {
    public static void main(String[] args) {
        String password = "jUla";
        bruteForce(password);
    }

    private static void bruteForce(String password) {
        long tries = 0;
        for (int i = 65; i <= 122; i++) {
            if (i > 90 && i < 97) {
                continue;
            }
            for (int j = 65; j <= 122; j++) {
                if (j > 90 && j < 97) {
                    continue;
                }
                for (int k = 65; k <= 122; k++) {
                    if (k > 90 && k < 97) {
                        continue;
                    }
                    for (int l = 65; l <= 122; l++) {
                        if (l > 90 && l < 97) {
                            continue;
                        }
                        String solution = String.valueOf((char) i) + String.valueOf((char) j) + String.valueOf((char) k) + String.valueOf((char) l);
                        if (password.equals(solution)) {
                            System.out.println("Congrats. You solved password in " + tries + " tries. Password is " + solution);
                            return;
                        }
                        else {
                            System.out.println("You didnt solved password yet." + solution);
                            tries++;
                        }
                    }
                }

            }
        }
    }
}