package palindrome_number;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n,c,r,s=0;
        System.out.println("Enter any number");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        c=n;
        while (n>0){

            r=n%10;
            s=(s*10)+r;
            n=n/10;

        }
        if(c==s)
            System.out.println("Palindrome number");
        else
            System.out.println("Not Palindrome number");


    }
}
