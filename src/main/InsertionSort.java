package main;

/**
 * insertion sort is like sorting a hand of cards
 * its in place
 * best case O(n)
 * worst case O(n x n)
 * Example - 54321
 * 45321 - 34521 - 23451- 12345
 */
public class InsertionSort {

    public void sort(int[] input) {

        for (int j = 1; j < input.length; j++) {
            int key = input[j];
            int i = j - 1;
            while (i >= 0 && input[i] > key) {
                input[i + 1] = input[i];
                i--;
                print(input);
            }
            input[i + 1] = key;
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
