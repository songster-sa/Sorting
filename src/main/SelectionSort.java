package main;

/**
 * find min and swap
 * in place and after one round, one element is at the right place
 * best case  = worst case = O(n x n)
 */
public class SelectionSort {

    public void sort(int[] input) {

        for (int i = 0; i < input.length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }

            // swap i and minIndex
            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
            print(input);

        }
    }

    private void print(int[] input) {
        for (int i : input) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
