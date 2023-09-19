package JavaBasicsStepik;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int[] a = new int [scan.nextInt()];

        
        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
            }
        
        int min = a[0];
        int imin = 0;
        
        for(int i = 1; i < a.length; i++){
            if(a[i] <= min){
                min = a[i];
                imin = i;
            }
        }
            a[imin] = -1;
        
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");}
        }  
}


/*
Массив целых неотрицательных чисел вводится с консоли. Сначала пользователь вводит количество элементов массива, а потом сами элементы.

Найти последний минимальный элемент и заменить его  на -1. 

Преобразованный массив вывести на консоль, отделяя элементы пробелами.

Тестовые данные
Sample Input:

8
2 11 2 15 6 2 20 7
Sample Output:

2 11 2 15 6 -1 20 7
*/
/*
An array of non-negative integers is entered from the console. First, the user enters the number of array elements, and then the elements themselves.

Find the last minimum element and replace it with -1.

Output the converted array to the console, separating the elements with spaces.

test data
sample input:

8
2 11 2 15 6 2 20 7
sample output:

2 11 2 15 6 -1 20 7
*/