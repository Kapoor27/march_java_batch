package duplicate_string_character;

public class totalduplicatecharcount {

    public static void main(String[] args) {

        String s="saabasko";

        int totalcount=s.length();
        int totalcount_afterRemove = s.replace("a","").length();
        int count=totalcount-totalcount_afterRemove;

        System.out.println("Total number of a is: "+count);
    }

}
