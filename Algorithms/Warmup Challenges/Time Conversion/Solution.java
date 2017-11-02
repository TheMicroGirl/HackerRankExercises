/*
HackerRank solution to converting 12h clock to a 24h.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
       	int n = s.length();
		    String converted = "";

        if(s.substring(n-2,n).equals("AM")){
        	int hour = Integer.parseInt(s.substring(0,2));
        	if (hour == 12){
        		String time = "00";
        		converted = "" + time + s.substring(2,n-2);
        	}   else {
        		converted = s.substring(0,n-2);
        	}
        } else {
        	int hour = Integer.parseInt(s.substring(0,2));
        	if (hour <12){
        		hour = hour +12;
        	}
        	converted = "" + hour + s.substring(2,n-2) ;
        }
        return converted;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
