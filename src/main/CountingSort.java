package main;

/**
 * when input numbers are between 1 to k .. non zero ( say ages between 1 to 100 )
 * not in place
 * O(n+k) = O(n)
 */
public class CountingSort {

    public void sort(int[] input, int k) {

        // define array of length k+1
        int[] count = new int[k + 1];

        for (int i = 0; i < input.length; i++) {
            count[input[i]] = count[input[i]] + 1;
        }
        System.out.print("count array: ");
        print(count);

        // fix their index
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i - 1] + count[i];
        }
        System.out.print("count array: ");
        print(count);

        int[] output = new int[input.length];
        for (int i = 0; i < output.length; i++) {
            output[count[input[i]] - 1] = input[i];
            count[input[i]]--;
        }
        System.out.print("output array: ");
        print(output);

    }

    private void print(int[] input) {
        for (int i : input) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
