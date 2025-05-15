package IFELSE;

import java.util.Scanner;

public class EvenOddwithscaner {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Entering the number");
        int user_input = sc.nextInt();
        //4System.out.println(user_input);

       if(user_input%2==0){
           System.out.println("Even");
       }else
           System.out.println("odd");

    }

}
