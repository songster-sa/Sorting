package main;

/**
 * 2 sorted arrays, A and B, A is large enough to hold B as well
 * merge the two in sorted order
 */
public class Question1 {

    public void solutionOne(int[] A, int[] B, int lastIndexA, int lastIndexB) {

        int lastAB = lastIndexA + lastIndexB + 1;
        int currA = 0, i = 0;

        while (i <= lastIndexB && currA <= lastAB) {
            if (A[currA] >= B[i]) {
                System.out.print("A before shift : ");
                print(A);
                // shift A
                for (int j = lastAB; j >= currA + 1; j--) {
                    A[j] = A[j - 1];
                }
                A[currA] = B[i];
                System.out.print("A after shift : ");
                print(A);
                i++;
            }
            currA++;
        }

        if (i <= lastIndexB) {
            // B is greater than A
            for (int j = i + lastIndexA + 1; j <= lastAB && i <= lastIndexB; j++, i++) {
                A[j] = B[i];
            }
        }
        System.out.print("A : ");
        print(A);

    }

    private void print(int[] input) {
        for (int i : input) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    //TODO
    public void solutionTwo() {
        // merge from end of the arrays rather than from beginning
    }
}
