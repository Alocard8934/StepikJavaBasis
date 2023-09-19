package JavaBasicsStepik;


public class Metod4 {
     public static void main(String[] args) {
        int start = 530;
        int end = 545;

        int result = maxNumberDivider(start, end);
        System.out.println(result);
    }

    public static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            } 
        }
        return count;
    }

    public static int maxNumberDivider(int start, int end) {
        int maxDivisors = -1;
        int numberWithMaxDivisors = -1;

        for (int i = start; i <= end; i++) {
            int divisors = countDivisors(i);
            if (divisors > maxDivisors) {
                maxDivisors = divisors;
                numberWithMaxDivisors = i;
            }
        }

        return numberWithMaxDivisors;
    }}



/*
Напишите статический метод maxNumberDivider(), который в заданном диапазоне находит число с наибольшим количеством делителей.

Метод main() менять нельзя!

Совет: сделайте отдельный  метод, который подсчитывает количество делителей числа, а затем вызывайте его в методе maxNumberDivider().

Тестовые данные
Sample Input:

530 545
Sample Output:

540
*/

/*
Write a static maxNumberDivider() method that finds the number with the most divisors in a given range.

The main() method cannot be changed!

Tip: make a separate method that counts the number of divisors of a number, and then call it in the maxNumberDivider() method.

test data
sample input:

530 545
sample output:

540
*/