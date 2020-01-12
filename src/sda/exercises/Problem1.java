package sda.exercises;
/*
Problem1: extract conditions from an expression
Example: if(a>b&& b<c||d<e) extract a>b and b<c ...
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myString = myScanner.nextLine();

        //System.out.println(Arrays.toString(new String[]{"||"}));

        String[] myStringArray = myString.split("<|&&|>|'", 10);
        for (String a: myStringArray)
            System.out.println(a);


    }


}
