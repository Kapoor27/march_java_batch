package number_array;

public class RemoveDuplicateNumber {

    public static void main(String[] args) {

        int[]arr = new int [] {1,2,3,2,3,4,5,6,7};

        for (int i=0;i<arr.length;i++)

            System.out.println("\t" +arr[i]);

            for (int i=0;i<arr.length;i++){

                for(int j= i+1;j<arr.length;j++){

                    if (arr[i]==arr[j]){

                        arr[i]=-1;
                    }
                }
            }
            System.out.println("remove duplicate number");
            for(int i=0; i<arr.length;i++)
                if (arr[i]!=-1){
                    System.out.print("\t" +arr[i]);
                }
        }
    }

