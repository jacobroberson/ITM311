public class Exercise_6b {
	public static void main(String[] args) {
	int[] array = new int [101];
	int a = 0, sum = 0;
	while(a < 100) {
	a++;
	array[a] = a;
	sum +=a;
	System.out.println(array[a]);
		}
	
	System.out.println("The sum of the array is: " + sum);
	}
}
