package fibonacci;

public class Fibonacciwithoutscanner {

    public static void main(String[] args) {
        int a=1 ,b=1  ,c=0;
        c=0;
        System.out.print("1 1 ");
        while(c<=50){

            c= a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }



    }
}
