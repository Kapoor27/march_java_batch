package reverse_string;

import java.util.Scanner;

public class Reversnumber {

    public static void main(String[] args) {

        int n,r;
        System.out.println("Enter any number");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();

        while (n>0){
            r=n%10;
            System.out.println( r );
            n=n/10;
        }
    }
}
