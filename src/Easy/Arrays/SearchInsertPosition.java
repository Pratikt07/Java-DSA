package Easy.Arrays;

//Given a sorted array of distinct integers and a target value, return the
//index if the target is found. If not, return the index where it would be if it were
//inserted in order.
//
// You must write an algorithm with O(log n) runtime complexity.
//
//
// Example 1:
//
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//
//
// Example 2:
//
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//
//
// Example 3:
//
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 10⁴
// -10⁴ <= nums[i] <= 10⁴
// nums contains distinct values sorted in ascending order.
// -10⁴ <= target <= 10⁴
//
// Related Topics Array Binary Search 👍 8482 👎 434


import java.util.Arrays;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
//        int index = Arrays.binarySearch(nums,target);
//        if(index < 0){
//            index = 0;
//            for(int elem: nums){
//                if(elem>target)
//                    break;
//                else
//                    index++;
//            }
//        }
//        return index;

        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
       int index =  searchInsert(nums,target);
        System.out.println(index);
    }
}
