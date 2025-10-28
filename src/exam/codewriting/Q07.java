package exam.codewriting;
public class Q07 {

	/*
	We wish to create a method to compute and return a rolling sum of values from 1 to n, where
	n is a positive integer. For example:
			rollingSum(5) would return 15 
			rollingSum(3) would return 6
	Complete the method. You may use either iteration or recursion.
	*/
	
	public static int rollingSum (int n ) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static void main ( String[] args ) {
		System.out.println(rollingSum(5)); //should be 15
		System.out.println(rollingSum(3)); //should be 6
	}

}
