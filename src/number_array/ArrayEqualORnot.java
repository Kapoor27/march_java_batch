package number_array;

import java.util.Arrays;

public class ArrayEqualORnot {

    public static void main(String[] args) {

        int[] arrayOne = {21, 57, 11, 37, 24};
        int[] arrayTwo = {21, 57, 10, 37, 24};

        boolean status = Arrays.equals(arrayOne, arrayTwo);
        if (status == true) {

            System.out.println("arrays are equal ");
        } else {
            System.out.println("Arrays are equal or not");
        }
    }
}