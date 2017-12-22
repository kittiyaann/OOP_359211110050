package ooplab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myArray20 {
    public static void main (String [] args) throws IOException {
//   Array 20
        int [][]number = new  int[2][3];
            InputData(number);
            showData(number);

    }//main

    private static void showData(int[][] number) {
        System.out.print("Data in array 2D ");
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number[i].length;j++)
                System.out.print(number[i][j]+" ");
        }
    }

    private static void InputData(int[][] number) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer:  ");
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number[i].length;j++){
                System.out.print("number["+i+"]["+j+"]: ");
                number[i][j] = Integer.parseInt(reader.readLine());

            }
        }
    }


}//class
