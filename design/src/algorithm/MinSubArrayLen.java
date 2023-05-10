package algorithm;

//给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0
//滑动窗口
class MinSubArrayLen {
    public int SbuArrayLen(int[] nums,int s){
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            //这个时候sum第一次大于s,然后滑动窗口的经典就是让左侧向右靠拢，找到最短数组，便有了sum -= nums[left++];
            //找到最小数组之后，便是跳出了这个循环，紧接着向右滑动找下一组大于s的数组，接着上面的操作
            while (sum >= s) {
                result = Math.min(result,right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE? 0 : result;
    }
}
