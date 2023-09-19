package JavaBasicsStepik;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArraysClass3 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int[] arr = new int [scan.nextInt()]; 
         long seed = scan.nextLong();
         Random rand = new Random(seed);   
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10, 21);
        }
        
        String str = Arrays.toString(arr);
        System.out.println(str);
        int begin = scan.nextInt();
        int end = scan.nextInt();
        Arrays.sort(arr, begin, end+1);
        System.out.println(Arrays.toString(arr));
    }    
}


/*
Пользователь вводит размер массива и начальное значение генератора случайных чисел. 

Создать массив  целых чисел заданного размера и заполнить его случайными числами от 10 до 20 (включительно). Распечатать исходный массив, используя метод toString() - в квадратных скобках, элементы через запятую.

Затем вводятся два индекса (индексы в тестах корректные). Отсортировать по возрастанию часть массива между двумя этими индексами (включая оба).

С новой строки вывести преобразованный массив на консоль методом toString().

Тестовые данные
Sample Input:

10 85
1 4
Sample Output:

[20, 14, 10, 19, 18, 18, 20, 20, 16, 11]
[20, 10, 14, 18, 19, 18, 20, 20, 16, 11]

*/
/*
The user enters the size of the array and the initial value of the random number generator.

Create an array of integers of the given size and fill it with random numbers from 10 to 20 (inclusive). Print the original array using the toString() method - in square brackets, elements separated by commas.

Then two indexes are entered (the indexes in the tests are correct). Sort in ascending order the part of the array between these two indices (including both).

From a new line, output the converted array to the console using the toString() method.

test data
sample input:

10 85
14
sample output:

[20, 14, 10, 19, 18, 18, 20, 20, 16, 11]
[20, 10, 14, 18, 19, 18, 20, 20, 16, 11]
*/