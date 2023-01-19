package number_array;

import java.util.Arrays;

public class Secondlargestnum {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6};

        //Approach 1

        //  Arrays.sort(a);
        //  System.out.println(a[a.length - 2 ]);


        //Approach 2

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (largest < a[i]) {
                secondlargest = largest;
                largest = a[i];
            }
            if(a[i]> secondlargest && a[i]< largest){
                secondlargest=a[i];
            }
        }
        System.out.println(secondlargest);
    }
}