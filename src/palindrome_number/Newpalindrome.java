package palindrome_number;

import java.util.Scanner;

public class Newpalindrome {

    public static void main(String[] args) {

        int a,b,r,x=0;
        System.out.println("enter new number ");
        Scanner obj= new Scanner(System.in);
        a=obj.nextInt();
        b=a;
        while(a>0){

            r=a%10;
            x=(x*10)+r;
            a=a/10;

        }
        if(b==x)
            System.out.println("Palindrome number");
        else
            System.out.println("Not palindrome");
    }
}
