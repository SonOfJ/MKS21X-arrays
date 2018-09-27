public class ArrayDemo {
  public static void main(String[] args) {
    int[] ary = {1, 2, 3, 4};
    printArray(ary);
}
  public static void printArray(int[]ary) {
    System.out.print("[");
    for (int i = 0; i < ary.length; i = i + 1) {
      if (i != ary.length - 1){
        System.out.print(ary[i] + ",");
      }
      else{
        System.out.print(ary[i]);
      }
    }
    System.out.print("]");
  }
}