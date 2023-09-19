package JavaBasicsStepik;

import java.util.Scanner;
public class sumOfLeastDivisors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 0;

        
        for (int i = num; i <= num2; i++){
            for(int y = 2; y <= num2; y++){
                if(i%y == 0){
                    sum+=y;
                    break;
                }  
                continue;
            }
            
        }
        System.out.println(sum);
    }
}


/*
The user enters a range of integers. The range bounds in the tests are correct (no need to check if the first bound is less than or equal to the second).

You need to find the sum of the smallest divisors of all numbers in this range (divisors are considered, starting with 2).

For example, for the range 8...11:

the smallest divisor of 8 is 2

the smallest divisor of 9 is 3

the smallest divisor of 10 is 2

the smallest divisor of 11 is 11

Sum 2+3+2+11=18

*/