public class BreakContinue {
  public static void windowPosSum(int[] a, int n) {
    for (int i = 0; i < a.length; i++) {
      // 如果当前元素小于等于0，则跳过
      if (a[i] <= 0) {
        continue;
      }
      
      // 计算从当前位置开始的 n 个元素的和
      int sum = 0;
      for (int j = i; j < Math.min(i + n + 1, a.length); j++) {
        sum += a[j];
      }
      
      // 将当前位置的值替换为计算出的和
      a[i] = sum;
    }
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // 输出结果
    System.out.println(java.util.Arrays.toString(a));
  }
}
