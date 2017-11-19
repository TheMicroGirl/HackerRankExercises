import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
         if (v1 <= v2) { //if the jump is smaller or the same kangaroos will
           //never meet at the same location at the same time
            return "NO";
        } else {
          //if the difference in the jump / difference in location is even
          //then they will meet 
            boolean meet = (x2 - x1) % (v2 - v1) == 0;
            if(meet == true){
                return "YES";
            }else{
                return "NO";
            }

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
