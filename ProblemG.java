import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 *
 * @author Amanda Jason
 *
 */
public final class ProblemG {

    private ProblemG() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        int numErrors = in.nextInt();
        Queue<Integer> numbers = new LinkedList<Integer>();
        int numCorrect = lines - numErrors;
        for (int m = 1; m < lines + 1; m++) {
            numbers.add(m);
        }

        int[] errors = new int[numErrors];
        for (int i = 0; i < numErrors; i++) {
            errors[i] = in.nextInt();
        }
        int[] correct = new int[numCorrect];
        for (int n = 0; n < errors.length; n++) {
            numbers.remove(errors[n]);
        }
        for (int p = 0; p < correct.length; p++) {
            correct[p] = numbers.poll();
        }
        int k = 0;
        Queue<String> outputError = new LinkedList<String>();
        Queue<String> outputCorr = new LinkedList<String>();
        for (int j = 0; j < numErrors - 1; j++) {
            if (errors[j] == (errors[j + 1] - 1)) {
                k = j + 1;
                while (k < numErrors - 1 && errors[k] == (errors[k + 1] - 1)) {
                    k++;
                }
                if (k == numErrors - 1) {
                    outputError.add("" + errors[j] + "-" + errors[k]);
                } else {
                    outputError.add(errors[j] + "-" + errors[k]);
                }
                j = k;
            } else if (j == numErrors - 2) {
                outputError.add(errors[j] + "");
                outputError.add("" + errors[j + 1]);
            } else {
                outputError.add(errors[j] + "");
            }
        }
        if (k == numCorrect - 2) {
            outputCorr.add(correct[k + 1] + "");
        }
        System.out.print("Errors: ");
        if (numErrors == 1) {
            System.out.print(errors[0]);
        }
        while (outputError.size() > 2) {
            System.out.print(outputError.poll() + ", ");
        }
        System.out.print(outputError.poll() + " and ");
        System.out.print(outputError.poll());
        System.out.println();
        int q = 0;
        for (int o = 0; o < numCorrect - 1; o++) {
            if (correct[o] == (correct[o + 1] - 1)) {
                q = o + 1;
                while (q < numCorrect - 1
                        && correct[q] == (correct[q + 1] - 1)) {
                    q++;
                }
                if (q == numCorrect - 1) {
                    outputCorr.add("" + correct[o] + "-" + correct[q]);
                } else {
                    outputCorr.add(correct[o] + "-" + correct[q]);
                }
                o = q;
            } else if (o == numCorrect - 2) {
                outputCorr.add(correct[o] + "");
                outputCorr.add("" + correct[o + 1]);
            } else {
                outputCorr.add(correct[o] + "");
            }
        }
        if (q == numCorrect - 2) {
            outputCorr.add(correct[q + 1] + "");
        }
        System.out.print("Correct: ");
        if (numCorrect == 1) {
            System.out.print(correct[0]);
        }
        while (outputCorr.size() > 2) {
            System.out.print(outputCorr.poll() + ", ");
        }
        System.out.print(outputCorr.poll() + " and ");
        System.out.print(outputCorr.poll());
    }

}
