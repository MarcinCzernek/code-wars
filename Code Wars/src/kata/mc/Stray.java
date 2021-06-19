package kata.mc;

/**
 * You are given an odd-length array of integers, in which all of them are the same, except for one single number.
 *
 * Complete the method which accepts such an array, and returns that single different number.
 *
 * The input array will always be valid! (odd-length >= 3)
 */

public class Stray {

    public static void main(String[] args) {

        int[]numbers = { 3, 3, 6, 4, 4 };
        stray(numbers);
    }

    static int stray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum ^ numbers[i];
        return sum;
    }

}