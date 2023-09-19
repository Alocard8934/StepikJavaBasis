package JavaBasicsStepik;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class ArrayClass1 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int[] arr = new int [scan.nextInt()]; 
         long seed = scan.nextLong();
         Random rand = new Random(seed);  
         int search = scan.nextInt();
        
         for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(2, 16); // zahl von 2 bis 15            
         }
        
         String str=Arrays.toString(arr);
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
         int ind = Arrays.binarySearch(arr, search);
         if(ind < 0) {
             System.out.println("ERROR");
         }else{
            int[] d = Arrays.copyOfRange(arr, 0,ind+1);
         System.out.println(Arrays.toString(d));
             
         }
    }
}


/*
Пользователь вводит размер массива и начальное значение генератора случайных чисел.

Затем он вводит контрольный элемент (целое число).

Создать массив заданного размера и заполнить его случайными числами от 2 до 15. Отсортировать массив по возрастанию. Распечатать отсортированный массив, используя метод toString() - в квадратных скобках, элементы через запятую.

Найти в отсортированном массиве индекс контрольного элемента и удалить все элементы после него (создать новый массив нужного размера).

Если контрольный элемент отсутствовал в массиве, то вывести "ERROR". В противном случае распечатать полученный массив методом toString().

Тестовые данные
Sample Input:

8 11
10
Sample Output:

[5, 6, 7, 10, 11, 13, 14, 15]
[5, 6, 7, 10]
*/

/*
The user enters the size of the array and the initial value of the random number generator.

It then enters a control element (an integer).

Create an array of the given size and fill it with random numbers from 2 to 15. Sort the array in ascending order. Print the sorted array using the toString() method - in square brackets, elements separated by commas.

Find the index of the control element in the sorted array and remove all elements after it (create a new array of the required size).

If the control element was absent in the array, then output "ERROR". Otherwise, print the resulting array using the toString() method.

test data
sample input:

8 11
10
sample output:

[5, 6, 7, 10, 11, 13, 14, 15]
[5, 6, 7, 10]
*/