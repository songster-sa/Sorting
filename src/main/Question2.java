package main;

/**
 * sort an array of strings so that all anagrams are next to each other
 * Example:
 * Input : ats, bat, cat, sat, tab
 * Output : ats, sat, bat, tab, cat
 * <p>
 * is input in any order?
 * does output needs to follow any order?
 */
public class Question2 {

// pick one - check if any of the rest are an anagram, if yes, swap next with it - O(n x n)

    /**
     * to check anagram - sort both comparators.. result must look same
     * OR
     * maintain hash with all the anagrams
     */

    public void solutionOne(String[] input) {

        int i = 0;
        while (i < input.length) {
            String key = input[i];

            for (int j = i + 1; j < input.length; j++) {
                if (isAnagram(key, input[j]) && j != i + 1) {
                    String temp = input[i + 1];
                    input[i + 1] = input[j];
                    input[j] = temp;
                    //i++;
                    print(input);

                }
            }
            i++;
        }
    }

    private boolean isAnagram(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }
        // else if length is same then either count characters OR sort and compare
        int[] charCount = new int[255];

        for (char ch : one.toCharArray()) {
            charCount[ch]++;
        }

        for (char ch : two.toCharArray()) {
            charCount[ch]--;
            if (charCount[ch] < 0) {
                return false;
            }
        }

        for (int i : charCount) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    private void print(String[] input) {
        for (String i : input) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
