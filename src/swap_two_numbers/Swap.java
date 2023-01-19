package swap_two_numbers;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a;
        int b;

        System.out.println("Please enter A value");
        Scanner obj= new Scanner(System.in);
        a=obj.nextInt(); //a=10

        System.out.println("Please enter B value");
        Scanner obj1= new Scanner(System.in);
        b=obj.nextInt(); //b=20

        System.out.println("before swapping" +a+" "+b); //a=10 b=20
        a=a+b; //10+20=30
        b=a-b;//30-20=10
        a=a-b;//30-10=20

        System.out.println("After swapping" +a+" "+b); //b=10 a=20





    }
}
