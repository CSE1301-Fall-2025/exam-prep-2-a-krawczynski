package exam.codewriting.xtraPractice;

public class ehe {
/*
We wish to write a recursive method that returns the sum of all digits in a positive integer.
For example:
    sumDigits(1234) → 10
    sumDigits(905)  → 14
Your task: write this method recursively, without using any loops.
*/
public static int sumDigits(int n) {
    if (n < 0) {
        n = -n;
    }

    return (1) + sumDigits(n/10);
}

  public static void main(String[] args) {
    System.out.println(sumDigits(1267));

  }  
}
