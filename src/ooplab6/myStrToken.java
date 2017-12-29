package ooplab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main (String []asgr){
       //StringToKenizer
        String msg ="Hello Welcome MT MTRMUTSV 2017";
        StringTokenizer myToKen = new StringTokenizer(msg);
        //countToKen()
        System.out.println(myToKen.countTokens());

        while (myToKen.hasMoreTokens()){
            StringBuffer buffer = new StringBuffer(myToKen.nextToken());

            System.out.print(buffer.reverse()+" ");

        }//while


    }//main
}//class
