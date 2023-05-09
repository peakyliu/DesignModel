package algorithm;

import sun.java2d.pipe.RegionIterator;

//二分法需要注意的点是左右区间到底是关闭还是开放，当左右区间都是关闭的时候，while(left <= rignt)是有意义的，
// nums[middle]大于目标的时候，right更新为middle，由于nums[middle]大于target，所以right更新为middle-1；
class Dichotomy {
    //左闭右闭的解法
//    public int search(int[] nums,int target){
//        //避免target<nums[0]时候的多次循环
//        if (target<nums[0] || target > nums[nums.length -1]){
//            return -1;
//        }
//
//        int left = 0;
//        int right = nums.length-1;
//        while (left <= right){
//            int mid = left + ((right - left) >> 1);
//            if (nums[mid] == target) {
//                return mid;
//            } else if (nums[mid] <= target) {
//                left = mid + 1;
//            } else if (nums[mid] >= target) {
//                right = mid -1;
//            }
//        }
//        return -1;
//    }
    public int search(int[] nums,int target){
        //这种情况是左闭右开区间，
        if (target < nums[0] || target >= nums[nums.length -1]){
            return -1;
        }
        int left = 0;
        int right = nums.length -1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return target;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        return -1;
    }
}
