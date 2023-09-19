package JavaBasicsStepik;

import java.util.Scanner;
import java.util.Random;
public class Array1 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a = new int[size];
        long seed = scan.nextLong();
        Random rand = new Random(seed);
        int sum = 0;
        int mal = 1;
        for(int i = 0; i < size; i++){
             a[i] = rand.nextInt(-5, 6); //числа от -5 до 5
               if(a[i] >= 0){sum +=a[i];}
                if(a[i] < 0){mal *=a[i];}
                 System.out.print(a[i] + " ");
        }System.out.println();
            System.out.print(sum + " " +(double)mal);
        
    }
}


/*
Массив из целых чисел заполнить случайными значениями от -5 до 5 (включая обе границы) Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.

Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами. Пробел должен быть в том числе и после последнего элемента массива.

Найти сумму положительных элементов массива и произведение отрицательных элементов. Произведение быстро растет, поэтому оно должно иметь тип double.

C новой строки вывести результаты программы через пробел (сначала сумму, а потом произведение). 

Тестовые данные
Sample Input:

10 7
Sample Output:

-3 5 5 -3 1 -1 0 2 5 5 
23 -9.0

*/

/*
Array of integers filled with random values ​​from -5 to 5 (including both boundaries) The user enters the size of the array, and then the initial value of the random number generator.

Print the original array to the console on one line, separating the elements with spaces. The space must also be after the last element of the array.

Find the sum of the positive elements of an array and the product of the negative elements. The product grows rapidly, so it must be of type double.

From a new line, output the results of the program separated by a space (first the sum, and then the product).

test data
sample input:

10 7
sample output:

-3 5 5 -3 1 -1 0 2 5 5
23-9.0
*/