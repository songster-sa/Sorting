package test;

import main.Question2;

public class Question2Test {

    public static void main(String[] argd) {
        Question2 obj = new Question2();

        String[] input = new String[]{"ats", "bat", "cat", "sat", "tab"};
        obj.solutionOne(input);
        System.out.println("------------------------------------");

        input = new String[]{"ats", "bat", "cat", "sat", "race", "tab", "tue", "web", "acre", "tub", "care", "but"};
        obj.solutionOne(input);
    }
}
