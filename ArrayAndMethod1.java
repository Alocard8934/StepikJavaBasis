package JavaBasicsStepik;

import java.util.Scanner;
import java.util.Random;
public class ArrayAndMethod1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar,seed);
        print(ar);
        int ind = findMax(ar);
        System.out.println(ind);
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
}


/*
Индекс максимума
Напишите три статических метода  для работы с одномерным массивом целых чисел:

1) init()  - заполнение массива случайными числами от -3 до 5;

2) print() - вывод массива на консоль в строку, отделяя элементы пробелами;

3) findMax() - поиск индекса первого максимального элемента в одномерном массиве.

Пользователь вводит количество элементов одномерного массива и начальное значение генератора случайных чисел. 

Выводится на консоль сформированный массив, и затем с новой строки - найденный индекс первого максимального элемента  в массиве.

Код метода main() менять нельзя!

Тестовые данные
Sample Input:

10 15
Sample Output:

0 -1 -2 0 -2 2 2 4 2 -2 
7
*/

/*
High Index
Name three static methods that are random with one mass of cells:

1) init() - filling the array with random numbers from -3 to 5;

2) print() - by volume on the console in a column, including problem items;

3) findMax() - selects the index of the maximum element in one mass.

The user enters the number of elements of the one-dimensional array and the initial value of the random number generator.

The formed array is displayed on the console, and then, from a new line, the found index of the first maximum element by mass.

The code of the main() method cannot be changed!

test data
sample input:

10 15
example output:

0 -1 -2 0 -2 2 2 4 2 -2
7
*/