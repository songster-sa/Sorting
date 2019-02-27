package test;

import main.Question1;

public class Question1Test {

    public static void main(String args[]) {
        Question1 obj = new Question1();

        int[] A = new int[]{2, 4, 6, 8, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] B = new int[]{1, 3, 5, 7, 9, 10, 0, 0};
        obj.solutionOne(A, B, 3, 5);
        System.out.println("-----------------------------------------------");
        A = new int[]{11, 44, 77, 99, 0, 0, 0, 0, 0, 0, 0, 0};
        B = new int[]{1, 3, 5, 7, 9, 100, 0, 0};
        obj.solutionOne(A, B, 3, 5);
        System.out.println("-----------------------------------------------");

    }
}
