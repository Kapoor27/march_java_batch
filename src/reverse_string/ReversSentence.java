package reverse_string;

public class ReversSentence {
    public static void main(String[] args) {

        String str="Welcome to the my world";
        String splitArray[]=str.split(" ");

        for(int i=splitArray.length-1;i>=0;i--){
            System.out.println(splitArray[i]);

        }


    }
}
