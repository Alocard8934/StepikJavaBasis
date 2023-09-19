package JavaBasicsStepik;

import java.util.Scanner;
import java.util.Random;
public class doubleArrays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[scan.nextInt()][scan.nextInt()];
        Random rand = new Random(scan.nextLong());
        int kol = Integer.MIN_VALUE;
        int max =0;

        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(-5, 5);
                System.out.print(array[i][j] + "\t");
                
                if(max<array[i][j]){
                    max = array[i][j];
                    kol = 1;
                }else if(array[i][j] == max){kol++;}
            }
            
        System.out.println();      
        }
        System.out.println(max + " " + kol);
    }  
}

/*
Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение генератора случайных чисел. Создать целочисленный массив указанной размерности и инициализировать его случайными числами от -5 до 4. Массив вывести на консоль в виде таблицы, элементы которой отделяются знаками табуляции. Знак табуляции должен быть и  в конце каждой строки.

Найти максимальный элемент и подсчитать, сколько раз он встречается в массиве. Вывести максимальный элемент и найденное количество с  новой строки через пробел.

Тестовые данные
Sample Input:

4 5 100
Sample Output:

0	-5	-1	3	-4	
1	1	3	-2	-2	
-3	2	1	2	-3	
4	-5	3	-2	4	
4 2
*/
/*
The user enters the number of rows and columns of the two-dimensional array, followed by the initial value of the random number generator. Create an integer array of the specified dimension and initialize it with random numbers from -5 to 4. Output the array to the console as a table, the elements of which are separated by tabs. A tab character must also be at the end of each line.

Find the maximum element and count how many times it occurs in the array. Output the maximum element and the found quantity on a new line separated by a space.

test data
sample input:

4 5 100
sample output:

0 -5 -1 3 -4
1 1 3 -2 -2
-3 2 1 2 -3
4 -5 3 -2 4
4 2
*/
