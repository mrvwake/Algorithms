package com.vivek.hackerrank;

import java.util.*;

/**
 John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

 For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

 Function Description

 Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.

 sockMerchant has the following parameter(s):

 n: the number of socks in the pile
 ar: the colors of each sock
 Input Format

 The first line contains an integer , the number of socks represented in .
 The second line contains  space-separated integers describing the colors  of the socks in the pile.

 Constraints

 where
 Output Format

 Return the total number of matching pairs of socks that John can sell.

 Sample Input

 9
 10 20 20 10 10 30 50 10 20
 Sample Output

 3
 */

public class WarmUp_SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int count = 0;
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < n; i++) {
            int a = ar[i];
            if(set.contains(a)) {
                set.remove(a);
                count++;
            } else {
                set.add(a);
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

        scanner.close();
    }
}