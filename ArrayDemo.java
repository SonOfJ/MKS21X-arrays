public class ArrayDemo {
  public static void main(String[] args) {
System.out.println("0a.");
    int[] ary = {1, 2, 3, 4};
    printArray(ary);
System.out.println("0b.");
   int[][] ary2 = new int[][] {{1, 2, 3, 4},{4, 5, 6, 7}};
    printArray(ary2);
System.out.println("1.");
   int[][] ary3 = new int[][] {{0, 2, 3, 0},{4, 0, 0, 7}};
    System.out.println(countZeros2D(ary3));
}
  public static void printArray (int[] ary) {
    for (int i = 0; i < ary.length; i = i + 1) {
      if (i == ary.length - 1) {
        System.out.print(ary[i] + "\n");
      } else {
        System.out.print(ary[i] + " ");
      }
    }
  }
  public static void printArray(int[][] ary) {
    for (int i = 0; i < ary.length; i = i + 1) {
      printArray(ary[i]);
    }
  }
  public static int countZeros2D(int[][] nums) {
    int count = 0;
    int i = 0;
    for (; i < nums.length; i = i + 1) {
      for (int k = 0; k < nums[i].length; k = k + 1) {
        if (nums[i][k] == 0) {
          count = count + 1;
        }
      }
    }
    return count;
  }
}