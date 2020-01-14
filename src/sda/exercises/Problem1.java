package sda.exercises;
/*
Problem1: extract conditions from an expression
Example:  if ( ( a>b) &&( b<c)) extract a>b and b<c ...
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        //new
        Operand myOperand = new Operand("(a>b)");

        System.out.println(myOperand.getOperator());

        System.out.println(myOperand.getLeft());
        System.out.println(myOperand.getRight());


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myString = myScanner.nextLine();

        myString = myString.replace(" ", "");
        myString = myString.replace("if", "");
        myString = myString.substring(1, myString.length() - 1);
        System.out.println(myString);

        //System.out.println(Arrays.toString(new String[]{"&&","||"}));
        String[] myStringArray = myString.split("&&");

        for (String a : myStringArray)
            System.out.println(a);


    }


}
