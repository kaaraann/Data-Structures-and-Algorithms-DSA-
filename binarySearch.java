/*  Given a sorted integer array nums = {-1, 0, 3, 4, 5, 9, 12} and
an integer target = 12, write a program to implement Binary Search 
and return the index of the target element.
If the target element is not found in the array, return -1.  */


public class binarySearch {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 4, 5, 9, 12 };
        int target = 12;

        int result = binarysearch(nums, target);

        if (result != -1) {
            System.out.println("Target found at index :" + result);
        } else {
            System.out.println("Target not found");
        }

    }

    public static int binarysearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // found
            } else if (nums[mid] < target) {
                start = mid + 1; // Move Right
            } else {
                end = mid - 1; // Move Left
            }
        }
        return -1;

    }

}
