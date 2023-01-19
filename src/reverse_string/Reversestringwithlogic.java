package reverse_string;

public class Reversestringwithlogic {

    public static void main(String[] args) {

        String str="ABCD";
        String rev="";

        int len=str.length();   //4

        //by default as per str.charAt(0) method index will start with 0

        for(int i=len-1;i>=0;i--) //3 2 1 0
        {
            rev=rev+str.charAt(i); //DCBA

        }
        System.out.println("Reverse string is;" + rev);

    }
}
