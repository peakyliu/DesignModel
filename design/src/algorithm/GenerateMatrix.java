package algorithm;

class GenerateMatrix {
    public int[][] matrix(int n){
        int loop = 0; //定义循环次数
        int[][] res =new int[n][n];
        int start = 0; //定义起始点
        int count = 1; //定义填充数
        int i,j;

        //定义循环边界
        while (loop++ < n / 2) { //判断边界之后loop从1开始
            //模拟从左到右
            for (j = start; j < n - loop; j++) {
                res[start][j] = count++;
            }
            //模拟从上到下
            for (i = start;  i<n - loop ; i++) {
                res[i][j] = count++;
            }
            //模拟从右到左
            //这里循环边界刚刚好减到下次循环的边界
            for (;  j>= loop ; j--) {
                res[i][j] = count++;
            }
            //模拟从下到上
            for (; i >= loop ; i--) {
                res[i][j] = count++;
            }
            //经历了一次循环之后start要+1；
            start++;
        }
        if (n % 2 == 1) {
            res[start][start] = count;
        }
        return res;
    }
}
