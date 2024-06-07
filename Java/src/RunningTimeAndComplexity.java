/*
Objective
Today we will learn about running time, also known as time complexity. Check out the Tutorial tab for learning materials and an instructional video.

Task
A prime is a natural number greater than  that has no positive divisors other than  and itself. Given a number, , determine and print whether it is  or .

Note: If possible, try to come up with a  primality algorithm, or see what sort of optimizations you come up with for an  algorithm. Be sure to check out the Editorial after submitting your code.

Input Format

The first line contains an integer, , the number of test cases.
Each of the  subsequent lines contains an integer, , to be tested for primality.

Constraints

Output Format

For each test case, print whether  is  or  on a new line.

Sample Input

3
12
5
7
Sample Output

Not prime
Prime
Prime
Explanation

Test Case 0: n=12.
 is divisible by numbers other than  and itself (i.e.: 2, 3, 4, 5), so we print Not prime on a new line.

Test Case 1: n=5.
 is only divisible 1 and itself, so we print Prime on a new line.

Test Case 2: n=7.
 is only divisible 1 and itself, so we print Prime on a new line.
 */

import java.util.Scanner;

public class RunningTimeAndComplexity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = s.nextInt();
        }
        for (int num : nums) {
            System.out.println(isPrime(num));
        }

    }

    private static String isPrime(int num) {
        if (num == 2) return "Prime";
        else if (num < 3 || num % 2 == 0) {
            return "Not prime";
        } else {
            for (int i = 3; i <= Math.pow(num, 0.5); i++) {
                if (num % i == 0) return "Not prime";
            }
            return "Prime";
        }
    }


}
