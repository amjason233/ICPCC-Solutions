import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 *
 * @author Amanda Jason
 *
 */
@SuppressWarnings("unused")
public final class ProblemA {

    private ProblemA() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String n = String.valueOf(input);
        char num = ' ';
        Set<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        boolean possible = true;
        for (int j = 0; j < n.length(); j++) {
            possible = possible
                    && numbers.contains(Character.getNumericValue(n.charAt(j)));
        }
        if (!possible) {
            System.out.print("Impossible");
        }

        int output = 0;

        if (input % 5 == 0) {

        } else {
            output = input;
        }

    }

}
