package find_first_and_last_position;

public class Shortearray {



    public static int[] find(int[] arr, int target) {
        int[] ans = {-1, -1};

        int lo = 0;
        int hi = arr.length - 1;

        //find first index here

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (arr[mid] == target) {
                ans[0] = mid;
                //con searching in left side
                hi = mid - 1;
            } else if (arr[mid] > target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;

            }
        }
        lo = 0;
        hi = arr.length - 1;

        //find first index here

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (arr[mid] == target) {
                ans[1] = mid;
                //con searching in right side
                lo = mid + 1;
            } else if (arr[mid] > target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;

            }
        }
        return ans;
    }



}