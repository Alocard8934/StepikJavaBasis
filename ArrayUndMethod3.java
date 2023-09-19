package JavaBasicsStepik;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class ArrayUndMethod3 {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int[] b = reduceAfterMax(ar);
        print(b);
    }
    public static void init(int [] ar, long seed) {
        Random rand = new Random(seed);
        for(int i = 0; i < ar.length; i++){
            ar[i] = rand.nextInt(-3, 6);
        }
    }
    public static void print(int[] ar){
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        } System.out.println();
    }
    
     public static int findMax(int[] ar){
         int max = 0;
         int ind = 0;
         for(int i = 0; i < ar.length; i++){
            if(max < ar[i]) {
                max = ar[i];
                ind = i;
            }
        }return ind;
     } 
    
     public static int[] reduceAfterMax(int[] ar){
         int ind  = findMax(ar);
           return Arrays.copyOf(ar, ind + 1);
     } 

}


/*
Удаление после максимума
Напишите четыре статических метода  для работы с одномерным массивом целых чисел:

1) init()  - заполнение массива случайными числами от -3 до 5;

2) print() - вывод массива на консоль в строку, отделяя элементы пробелами;

3) findMax() - поиск индекса первого максимального элемента в одномерном массиве.

4) reduceAfterMax() - создает новый массив, удаляя все элементы после первого максимума.

Первые три метода уже были созданы на шаге 2.

В main() пользователь вводит количество элементов одномерного массива и начальное значение генератора случайных чисел. 

Выводится на консоль сформированный массив, и затем с новой строки  - сформированный массив с удаленной частью.

Код метода main() менять нельзя!

Тестовые данные
Sample Input:

10 99
Sample Output:

1 2 3 3 0 5 4 5 2 5 
1 2 3 3 0 5 
*/
/*
Removal after maximum
Write four static methods to work with a one-dimensional array of integers:

1) init() - filling the array with random numbers from -3 to 5;

2) print() - output the array to the console as a line, separating elements with spaces;

3) findMax() - search for the index of the first maximum element in a one-dimensional array.

4) reduceAfterMax() - creates a new array, removing all elements after the first maximum.

The first three methods have already been created in step 2.

In main(), the user enters the number of elements of the one-dimensional array and the initial value of the random number generator.
The generated array is displayed on the console, and then on a new line - the generated array with the deleted part.

The code of the main() method cannot be changed!

Test data
Sample Input:

10 99
Sample Output:

1 2 3 3 0 5 4 5 2 5
1 2 3 3 0 5



*/