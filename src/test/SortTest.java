package test;

import main.BubbleSort;
import main.InsertionSort;
import main.SelectionSort;

public class SortTest {

    public static void main(String arg[]) {

        testInsertionSort();

        testSelectionSort();

        testBubbleSort();

    }

    private static void testBubbleSort() {
        BubbleSort obj = new BubbleSort();
        obj.sort(new int[]{5, 4, 3, 2, 1});
        System.out.println("---------------------");
        obj.sort(new int[]{1, 2, 3, 4, 5});
        System.out.println("---------------------");
        obj.sort(new int[]{3, 2, 4, 1, 5});
    }

    private static void testSelectionSort() {
        SelectionSort obj = new SelectionSort();
        obj.sort(new int[]{5, 4, 3, 2, 1});
        System.out.println("---------------------");
        obj.sort(new int[]{1, 2, 3, 4, 5});
        System.out.println("---------------------");
        obj.sort(new int[]{3, 2, 4, 1, 5});
    }

    private static void testInsertionSort() {
        InsertionSort obj = new InsertionSort();
        obj.sort(new int[]{5, 4, 3, 2, 1});
        System.out.println("---------------------");
        obj.sort(new int[]{1, 2, 3, 4, 5});
        System.out.println("---------------------");
        obj.sort(new int[]{3, 2, 4, 1, 5});
    }
}
