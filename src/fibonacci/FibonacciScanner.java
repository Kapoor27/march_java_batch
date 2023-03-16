package fibonacci;

import java.util.Scanner;

public class
FibonacciScanner {

    public static void main(String[] args) {

        int num,a= 0,b= 1,c;
        System.out.println("Enter Num");
        Scanner r= new Scanner(System.in);
        num =r.nextInt();

        for (int i=1; i<=num; i++){

            System.out.println(a);
            c=a+b;
            a=b;
            b=c;

        }
    }
}
