package frequency_of_numbers;

public class DuplicateElements {

    public static void main(String[] args) {

        int arr[] = new int[]{2, 5, 2, 5, 3};
        System.out.println("Duplicate element in given array");

        for (int i = 0; i < arr.length; i++) {

            for (int j=i+1; j< arr.length; j++){

                if (arr[i]==arr[j]){

                    System.out.println(arr[j]);
                }
            }

        }
    }
}
