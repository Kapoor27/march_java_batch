package frequency_of_numbers;

public class NumberFrequency  {

    public static void main(String[] args) {

        int[] a={2, 3, 5, 3, 2, 5, 4, 7, 8};

        for (int i=0; i<a.length; ++i){
            int x=a[i];
            int count=0;

            if(x==-1)continue;

            for (int j=0; j<a.length; ++j){
                if(a[j]==x){
                    ++count;
                    a[j]=-1;

                }
            }
            System.out.println("frequency of" + x + " is " + count);
        }

    }
}
