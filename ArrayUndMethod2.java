package JavaBasicsStepik;

import java.util.Scanner;
import java.util.Random;
public class ArrayUndMethod2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        printMaxIndex(mas);
    }
    public static void initArray(int [][] mas, long seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j <  mas[i].length; j++) {
                mas[i][j] = rand.nextInt(0, 11);
            } 

        }
    }
    public static void printArray(int [][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j <  mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t"); 
            } 
            System.out.println(); 
        }
    }
    public static void printMaxIndex(int [][] mas){
             
         for (int i = 0; i < mas.length; i++) {
             int max = 0;
             int ind = 0;
             
            for (int j = 0; j <  mas[i].length; j++) {
               if(max < mas[i][j]) {
                   max = mas[i][j];
               ind = j;

           }
          }System.out.print(ind + " ");
        }
     } 
    
}


/*
Напишите три статических метода для работы с двумерным массивом:

1) initArray() - инициализирует двумерный массив случайными числами от 0 до 10;

2) printArray() - выводит двумерный массив на консоль в виде таблицы (элементы строках отделяются знаками табуляции, и знак табуляции должен быть в конце каждой строки)

3)  printMaxIndex() - для каждой строки двумерного массива выводит индекс первого максимального элемента. Элементы отделяются пробелами.

В методе main() вводятся три целых числа: количество строк и количество столбцов массива, а затем начальное значение генератора случайных чисел.

Двумерный массив создается и выводится, а затем выводятся индексы максимальных элементов. Код метода main() менять нельзя!

P.S. Желательно при реализации метода printMaxIndex() использовать вызов метода findMax(), который был написан на предыдущем шаге.

Тестовые данные
Sample Input:

3 4 88
Sample Output:

1	10	2	8	
9	8	2	9	
3	2	9	0	

1 0 2 
*/
/*
Write three static methods to work with a two-dimensional array:

1) initArray() - initializes a two-dimensional array with random numbers from 0 to 10;

2) printArray() - outputs a two-dimensional array to the console in the form of a table (line elements are separated by tab characters, and a tab character must be at the end of each line)

3) printMaxIndex() - for each row of a two-dimensional array, prints the index of the first maximum element. Elements are separated by spaces.

In the main() method, three integers are entered: the number of rows and the number of columns of the array, and then the initial value of the random number generator.

A two-dimensional array is created and printed, and then the indices of the maximum elements are printed. The code of the main() method cannot be changed!
P.S. When implementing the printMaxIndex() method, it is advisable to use a call to the findMax() method, which was written in the previous step.

Test data
Sample Input:

3 4 88
Sample Output:

1 10 2 8
9 8 2 9
3 2 9 0

1 0 2
*/