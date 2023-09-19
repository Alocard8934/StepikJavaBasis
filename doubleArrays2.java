package JavaBasicsStepik;

import java.util.Scanner;
import java.util.Random;
public class doubleArrays2 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int rows = scan.nextInt();
       int cols = scan.nextInt();
       int[][] array = new int[rows][cols];
       Random rand = new Random(scan.nextLong());
  
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < cols; j++) {
                array[i][j] = rand.nextInt(-10, 11);
                System.out.print(array[i][j] + "\t");                
            }

            System.out.println(); 
        }

        System.out.println(); 
            
        for(int j = 0; j < cols; j++){
            int sum = 0;
            for (int k = 0; k < rows; k++) {
                
                if(array[k][j]>0){
                    sum +=array[k][j];                    
                }
                
            }
            System.out.print(sum + " ");  
        }
    }
}

/*
Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение генератора случайных чисел. Создать массив целых чисел указанной размерности и инициализировать его случайными числами от -10 до 10. Массив вывести на консоль в виде таблицы, элементы которой отделяются знаками табуляции. Знак табуляции должен быть и  в конце каждой строки.

Вывести пустую строку после двумерного массива.

Для каждого столбца найти сумму положительных элементов и вывести на консоль, отделяя пробелами.

Тестовые данные
Sample Input:

4 5 89
Sample Output:

-3	-9	8	-6	2	
9	1	-4	-4	-5	
-10	5	-6	3	-3	
-2	7	-4	1	-4	

*/

/*
The user enters the number of rows and columns of the two-dimensional array, followed by the initial value of the random number generator. Create an array of integers of the specified dimension and initialize it with random numbers from -10 to 10. Output the array to the console as a table, the elements of which are separated by tabs. A tab character must also be at the end of each line.

Output an empty string after the two-dimensional array.

For each column, find the sum of positive elements and print to the console, separating with spaces.

test data
sample input:

4 5 89
sample output:

-3 -9 8 -6 2
9 1 -4 -4 -5
-10 5 -6 3 -3
-2 7 -4 1 -4
*/
