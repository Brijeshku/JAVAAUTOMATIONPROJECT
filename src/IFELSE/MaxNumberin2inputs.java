package IFELSE;

import java.util.Scanner;

public class MaxNumberin2inputs {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1");
        int input1= sc.nextInt();

        System.out.println("Enter number 2");
        int input2= sc.nextInt();

        System.out.println(Math.max(input1,input2));

//        if(input1>input2){
//            System.out.println("Max number ");
//        }else
//            System.out.println("Min number");


    }
}
