package JavaBasicsStepik;

import java.util.Random;
import java.util.Scanner;
public class ArrayMethod4 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        int ind = scan.nextInt();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        mas = deleteRow(mas, ind);
        printArray(mas);
    }
     public static void initArray(int [][] mas, long seed) {
        Random rand = new Random(seed);
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length;j++){
            mas[i][j] = rand.nextInt(0, 11);
            }
        }
    }
    public static void printArray(int [][] mas){
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[i].length;j++){
                System.out.print(mas[i][j] + "\t"); 
            }
            System.out.println();
        }
    }
       public static int[][] deleteRow(int [][] mas, int ind){
         if(ind < 0 || ind > mas.length){
             return mas;
         }
           int[][] mas1 = new int[mas.length - 1][mas[0].length];
           int newIndex = 0;
          for (int i = 0; i < mas.length; i++) {
            if (i != ind) {
                mas1[newIndex] = mas[i];
                newIndex++;
            }
        
           }return mas1;
        
    }
}


/*
Напишите три статических метода для работы с двумерным массивом:

1) initArray() - инициализирует двумерный массив случайными числами от 0 до 10;

2) printArray() - выводит двумерный массив на консоль в виде таблицы (элементы строках отделяются знаками табуляции, и знак табуляции должен быть в конце каждой строки)

3)  deleteRow() - создает новый двумерный массив из исходного (первый параметр метода), удаляя строку, индекс которой передается в качестве второго параметра. Если индекс неверный (отрицательный или больше последнего индекса строк), то ничего не происходит.

В методе main() вводятся четыре целых числа: количество строк и количество столбцов массива, начальное значение генератора случайных чисел и номер строки для удаления.

Двумерный массив создается и выводится в виде таблицы. Затем выводится новый массив. Код метода main() менять нельзя!

Тестовые данные
Sample Input:

4 3 77 2
Sample Output:

9	6	7	
9	4	2	
6	5	5	
6	0	9	

9	6	7	
9	4	2	
6	0	9
*/
/*
Write three static methods to work with a two-dimensional array:

1) initArray() - initializes a two-dimensional array with random numbers from 0 to 10;

2) printArray() - outputs a two-dimensional array to the console in the form of a table (line elements are separated by tab characters, and a tab character must be at the end of each line)

3) deleteRow() - creates a new two-dimensional array from the original one (the first parameter of the method), deleting the row whose index is passed as the second parameter. If the index is invalid (negative or greater than the last row index), then nothing happens.

Four integers are entered in the main() method: the number of rows and columns of the array, the initial value of the random number generator, and the row number to delete.

A two-dimensional array is created and displayed as a table. Then a new array is output. The code of the main() method cannot be changed!

Test data
Sample Input:

4 3 77 2
Sample Output:

9 6 7
9 4 2
6 5 5
6 0 9

9 6 7
9 4 2
6 0 9
*/