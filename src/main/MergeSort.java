package main;

/**
 * keep dividing into half and then merge in the end
 * not in place
 * best / worst case = O (n log n )
 */
public class MergeSort {

    public void mergeSort(int[] input, int start, int end) {
        if (start < end) {
            int mid = (end + start) / 2;
            mergeSort(input, start, mid);
            mergeSort(input, mid + 1, end);
            merge(input, start, mid, end);
        }
    }

    private void merge(int[] input, int start, int mid, int end) {
        System.out.print("input begin : ");
        print(input);
        // create 2 arrays to store the left and right
        int length1 = mid - start + 1;
        int length2 = end - mid;
        int[] left = new int[length1];
        int[] right = new int[length2];

        // store left
        for (int i = start, j = 0; i <= mid; i++, j++) {
            left[j] = input[i];
        }
        // store right
        for (int i = mid + 1, j = 0; i <= end; i++, j++) {
            right[j] = input[i];
        }
        System.out.print("left : ");
        print(left);
        System.out.print("right : ");
        print(right);

        // merge
        int i = 0, j = 0;
        for (int k = start; k <= end; k++) {

            if (i < length1 && j < length2 && left[i] <= right[j]) {
                input[k] = left[i];
                i++;
            } else if (j < length2) {
                input[k] = right[j];
                j++;
            } else {
                input[k] = left[i];
                i++;
            }
        }

        System.out.print("input end : ");
        print(input);
    }

    private void print(int[] input) {
        for (int i : input) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

}
