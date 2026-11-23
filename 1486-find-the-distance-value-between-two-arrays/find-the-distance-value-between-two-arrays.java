import java.util.Arrays;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int farCount = 0;

        for (int x : arr1) {
            long low = (long) x - d;
            long high = (long) x + d;

            int idx = lowerBound(arr2, low);
            if (idx == arr2.length || arr2[idx] > high) {
                farCount++;
            }
        }

        return farCount;
    }

    // Returns the first index where arr[i] >= target, or arr.length if none exists
    private int lowerBound(int[] arr, long target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}