package algorithm;
//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
class Squared {
    public int[] sortedSquares(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int index = nums.length -1;
        while (left < right) {
            if (nums[left]*nums[left] < nums[right]*nums[right]){
                result[index--] = nums[right]*nums[right];
                right--;
            }else{
                // 正数的相对位置是不变的， 需要调整的是负数平方后的相对位置
                result[index--] = nums[left]*nums[left];
                left++;
            }
        }
        return result;
    }
}
