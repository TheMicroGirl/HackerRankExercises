/*
HackerRank solution to finding a count of highest number in
an array
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {

      long max = 0;
      int candles = 0;

  		for(int i = 0; i<n; i++){
  			long temp = ar[i];
  			if (temp > max ){
  				max = temp;
                  candles = 1;
  			} else if (temp ==max){
                  candles++;
              }
  		}

      return candles;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
