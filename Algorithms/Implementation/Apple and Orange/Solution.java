import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int apples = 0;
        int oranges = 0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();

            if (apple[apple_i]>=s-a && apple[apple_i] <= t-a){ //if  it is a positive
              //value and within limits
                apples++;
            }
        }
        System.out.println(apples);
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();

            if (orange[orange_i]<=t-b && orange[orange_i]>=s-b){
              //if  it is a negative
                //value and within limits
                oranges++;
            }
        }
        System.out.println(oranges);

    }
}
