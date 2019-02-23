package test;

import main.*;

public class SortTest {

    public static void main(String arg[]) {

        testInsertionSort();

        testSelectionSort();

        testBubbleSort();

        testMergeSort();

        testCountingSort();

    }

    private static void testCountingSort() {
        CountingSort obj = new CountingSort();

        obj.sort(new int[]{6, 5}, 7);
        System.out.println("---------------------");
        obj.sort(new int[]{5, 4, 4, 3, 1}, 7);
        System.out.println("---------------------");
        obj.sort(new int[]{1, 6, 5, 4, 5}, 7);
        System.out.println("---------------------");
        obj.sort(new int[]{1, 1, 4, 1, 5}, 7);
        System.out.println("---------------------");
        obj.sort(new int[]{5, 4, 3, 2, 1}, 6);
        System.out.println("---------------------");
        obj.sort(new int[]{1, 2, 3, 4, 5}, 6);
        System.out.println("---------------------");
        obj.sort(new int[]{3, 2, 4, 1, 5}, 5);
    }

    private static void testMergeSort() {
        MergeSort obj = new MergeSort();

        obj.mergeSort(new int[]{6, 5}, 0, 1);
        System.out.println("---------------------");
        obj.mergeSort(new int[]{5, 4, 3, 2, 1}, 0, 4);
        System.out.println("---------------------");
        obj.mergeSort(new int[]{1, 2, 3, 4, 5}, 0, 4);
        System.out.println("---------------------");
        obj.mergeSort(new int[]{3, 2, 4, 1, 5}, 0, 4);
        System.out.println("---------------------");
        obj.mergeSort(new int[]{5, 4, 4, 3, 1}, 0, 4);
        System.out.println("---------------------");
        obj.mergeSort(new int[]{1, 6, 5, 4, 5}, 0, 4);
        System.out.println("---------------------");
        obj.mergeSort(new int[]{1, 1, 4, 1, 5}, 0, 4);
    }

    private static void testBubbleSort() {
        BubbleSort obj = new BubbleSort();
        obj.sort(new int[]{5, 4, 3, 2, 1});
        System.out.println("---------------------");
        obj.sort(new int[]{1, 2, 3, 4, 5});
        System.out.println("---------------------");
        obj.sort(new int[]{3, 2, 4, 1, 5});
        System.out.println("---------------------");
        obj.sort(new int[]{5, 4, 4, 3, 1});
        System.out.println("---------------------");
        obj.sort(new int[]{1, 6, 5, 4, 5});
        System.out.println("---------------------");
        obj.sort(new int[]{1, 1, 4, 1, 5});
    }

    private static void testSelectionSort() {
        SelectionSort obj = new SelectionSort();
        obj.sort(new int[]{5, 4, 3, 2, 1});
        System.out.println("---------------------");
        obj.sort(new int[]{1, 2, 3, 4, 5});
        System.out.println("---------------------");
        obj.sort(new int[]{3, 2, 4, 1, 5});
        System.out.println("---------------------");
        obj.sort(new int[]{5, 4, 4, 3, 1});
        System.out.println("---------------------");
        obj.sort(new int[]{1, 6, 5, 4, 5});
        System.out.println("---------------------");
        obj.sort(new int[]{1, 1, 4, 1, 5});
    }

    private static void testInsertionSort() {
        InsertionSort obj = new InsertionSort();
        obj.sort(new int[]{5, 4, 3, 2, 1});
        System.out.println("---------------------");
        obj.sort(new int[]{1, 2, 3, 4, 5});
        System.out.println("---------------------");
        obj.sort(new int[]{3, 2, 4, 1, 5});
        System.out.println("---------------------");
        obj.sort(new int[]{5, 4, 4, 3, 1});
        System.out.println("---------------------");
        obj.sort(new int[]{1, 6, 5, 4, 5});
        System.out.println("---------------------");
        obj.sort(new int[]{1, 1, 4, 1, 5});
    }
}
