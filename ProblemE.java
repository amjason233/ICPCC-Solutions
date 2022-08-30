import java.util.Scanner;

/**
 *
 *
 * @author Amanda Jason
 *
 */
public final class ProblemE {

    private ProblemE() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.nextLine();
        boolean correct = true;
        if (n.length() % 2 == 1) {
            correct = false;
        } else {
            for (int i = 0; i < n.length() / 2 - 1; i++) {
                correct = correct
                        && (n.charAt(i) == n.charAt(n.length() - 1 - i));
            }
            correct = correct && n.charAt(n.length() / 2 - 1) == '('
                    && n.charAt(n.length() / 2) == ')';
        }
        if (correct) {
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }

    }

}
