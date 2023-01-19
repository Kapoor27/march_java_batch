package armstrong_number;
//armstrong number
//153=   1       5       3
//     1*1*1 + 5*5*5 + 3*3*3
// 1+125+27= 153

public class Armstrong {
    public static void main(String[] args) {

        int n =153;
        int c=n; //c=153
        int r,sum=0;

        while(n>0) {

            r = n % 10; //find reminder
            n = n / 10;
            sum = sum + r * r * r;
        }

        if (c == sum)
            System.out.println("Its an armstrong number");
        else
            System.out.println("its not an armstrong number");




    }

}
