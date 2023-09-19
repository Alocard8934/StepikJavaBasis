package JavaBasicsStepik;
import java.util.Scanner;

public class sumOfDivisors {
      public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 2; i <= num / 2; i += 2) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}



/*
The user enters a non-negative integer. Find the sum of its even divisors (not including itself).

test data
Sample Input 1:

16
Sample Output 1:

14
Sample Input 2:

15
Sample Output 2:

0

*/