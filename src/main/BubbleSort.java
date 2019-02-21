package main;

/**
 * also called comparison sort or sinking sort
 * swap adjacent repeatedly
 * in place
 * best case = O(n)
 * worst case = O(n x n)
 * <p>
 * large numbers of front = rabbits = quickly move back
 * small numbers of end = turtle = slowly move forward
 */
public class BubbleSort {

    public void sort(int[] input) {

        boolean misorder = false;

        do {
            misorder = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    misorder = true;
                    print(input);
                }
            }
        } while (misorder);
    }

    private void print(int[] input) {
        for (int i : input) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

}
