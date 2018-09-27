public class ArrayDemo {
  public static void main(String[] args) {
System.out.println("0a.");
    int[] ary = {1, 2, 3, 4};
    printArray(ary);
System.out.println("0b.");
   int[][] ary2 = new int[][] {
      {1, 2, 3, 4},
      {4, 5, 6, 7},
    };
    printArray(ary2);
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
  public static void printArray(int[][] ary){
    for (int i = 0; i < ary.length; i = i + 1) {
      printArray(ary[i]);
    }
  }
}