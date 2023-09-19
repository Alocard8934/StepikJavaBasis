package JavaBasicsStepik;

import java.util.Scanner;
import java.util.Random;
public class Array4 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int[] arr = new int [scan.nextInt()]; 
         long seed = scan.nextLong();
         Random rand = new Random(seed);   
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(-5, 16); // zahl von -5 bis 15
            System.out.print(arr[i] + " ");
        }
        
           int maxIndex = 0;
        int lastNegativeIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < 0) {
                lastNegativeIndex = i;
            }
        }
        
         if (lastNegativeIndex != -1) {
           
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastNegativeIndex];
            arr[lastNegativeIndex] = temp;
        } System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
    }
}


/*
Массив из целых чисел заполнить случайными значениями от -5 до 15 (включая обе границы) Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.

Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами. Пробел должен быть в том числе и после последнего элемента массива.

Поменять местами первый максимальный и последний отрицательный элементы. Если отрицательных элементов нет в массиве, то он должен остаться без изменения.

C новой строки вывести измененный массив, отделяя элементы пробелами.

Тестовые данные
Sample Input:

10 77
Sample Output:

7 -5 -1 5 -3 8 2 -1 -3 -3 
7 -5 -1 5 -3 -3 2 -1 -3 8
*/
/*
Array of integers filled with random values ​​from -5 to 15 (including both boundaries) The user enters the size of the array, and then the initial value of the random number generator.

Print the original array to the console on one line, separating the elements with spaces. The space must also be after the last element of the array.

Swap the first maximum and last negative elements. If there are no negative elements in the array, then it should remain unchanged.

From a new line, output the modified array, separating the elements with spaces.

test data
sample input:

10 77
sample output:

7 -5 -1 5 -3 8 2 -1 -3 -3
7 -5 -1 5 -3 -3 2 -1 -3 8
*/