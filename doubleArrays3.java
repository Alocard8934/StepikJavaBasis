package JavaBasicsStepik;

import java.util.Scanner;
import java.util.Random;
public class doubleArrays3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int rows = scan.nextInt();
       int cols = scan.nextInt();
       int[][] array = new int[rows][cols];
       Random rand = new Random(scan.nextLong());
       // -------------------------------------------
           for (int i = 0; i < rows; i++) {
              
               for (int j = 0; j < cols; j++) {
                    array[i][j] = rand.nextInt(-10, 11);
                    System.out.print(array[i][j] + "\t"); 
               } 
               System.out.println(); 
            }
       //--------------------------------------------     
        
            for (int i = 0; i < rows; i++) {
                int min = 0;
                int  index = 0;
                
                for (int j = 0; j < cols; j++) {
               
                    if(min > array[i][j]){
                        min = array[i][j];
                        index = j;
                        break;
                    }                 
                }
                
               if(min >= 0){
                    System.out.println("NO");
               }else{
                    System.out.println(index);  
               }           
          }
     }
}


/*
Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение генератора случайных чисел. Создать массив целых чисел указанной размерности и инициализировать его случайными числами от -10 до 10. Массив вывести на консоль в виде таблицы, элементы которой отделяются знаками табуляции. Знак табуляции должен быть и  в конце каждой строки.

В каждой строке найти первый отрицательный элемент и вывести индекс соответствующего столбца или слово "NO", если он отсутствует.

Тестовые данные
Sample Input:

4 3 100
Sample Output:

6	0	-6	
2	-9	-4	
7	7	3	
0	-9	-8	
2
1
NO
1
*/

/*
The user enters the number of rows and columns of the two-dimensional array, followed by the initial value of the random number generator. Create an array of integers of the specified dimension and initialize it with random numbers from -10 to 10. Output the array to the console as a table, the elements of which are separated by tabs. A tab character must also be at the end of each line.

Find the first negative element in each line and print the index of the corresponding column or the word "NO" if it is missing.

test data
sample input:

4 3 100
sample output:

6 0 -6
2-9-4
7 7 3
0 -9 -8
2
1
NO
1
*/