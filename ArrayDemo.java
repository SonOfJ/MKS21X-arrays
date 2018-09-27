public class ArrayDemo {
    public static void main(String[] args) {
	public static void printArray(int ary[]) {
		for(int i = 0; i < ary.length; i = i + 1) {
			printArray(ary[i]);
		}
	}
    }
}
		
		