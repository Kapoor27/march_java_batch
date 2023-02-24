package duplicate_string_character;

public class totalnumberofcountstring {

        public static void main(String[] args) {
      String s = "my name is nitin kapoor";
      int count = 0;

      System.out.println("lenght of thr given string " +s.length());  //for count space

      for(int i=0; i<s.length(); i++){

          if(s.charAt(i)!= ' '){
              count++;
          }
      }
        System.out.println("count the given String " +count); //for count without space

        }
    }




