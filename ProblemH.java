import java.util.Scanner;

/**
 *
 *
 * @author Amanda Jason
 *
 */
public final class ProblemH {

    private ProblemH() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = in.nextInt();
        }
        int point = d[0];
        for (int j = 1; j < d.length - 1; j++) {
            if (d[j] % point == 0) {
                System.out.println(d[j]);
                point = d[j + 1];
                j = j + 2;
            }
        }
        in.close();

    }

}
