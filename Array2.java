package JavaBasicsStepik;

import java.util.Scanner;
import java.util.Random;
public class Array2 {
      public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int size = scan.nextInt();
       double[] a = new double [size];
       long seed = scan.nextLong();
       Random rand = new Random(seed);
       double sum = 0;

        for(int i = 0; i < size; i++){
             a[i] =  rand.nextDouble() * 5.0; //числа от 0 до 5
            sum +=a[i];
                 System.out.printf("%.2f", a[i]); System.out.print(" ");
        }   
        
        double sred = sum/size; 
        System.out.println();
        System.out.printf("%.2f", sred);
        System.out.println();

        for(int i = 0; i < size; i++){  
            if(sred <= a[i]){a[i] = sred;}
                 System.out.printf("%.2f", a[i]); System.out.print(" ");
    }
}
}


/*
Массив из вещественных чисел заполнить случайными значениями от 0 до 5 (не включая). Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.

Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами. Пробел должен быть в том числе и после последнего элемента массива. 

Найти среднее арифметическое элементов массива и вывести его с новой строки. Заменить все элементы, большие среднего, его значением.

C новой строки вывести преобразованный массив. Элементы отделяются пробелами. 

Все вещественные числа при выводе округляются до двух знаков после десятичной точки.

Тестовые данные
Sample Input:

10 45
Sample Output:

3.63 4.35 1.50 3.77 1.29 3.07 2.09 4.80 4.70 3.77 
3.30
3.30 3.30 1.50 3.30 1.29 3.07 2.09 3.30 3.30 3.30
*/

/*
Massive in Western countries is considered from 0 to 5 (not including). The user enters the size of the array and then the initial value of the random number generator.

Output the original array on the console in one line, separating the ELEMENTS with spaces. The problem must be in the chip itself and possibly the mass element.

Namely, these are mass elements and strong enough to be present in the new structure. Replace all elements, big, big, with its value.

C new result outputs the converted array. Elements are separated by spaces.

All real numbers are rounded to two decimal places when output.

test data
sample input:

10 45
output example:

3.63 4.35 1.50 3.77 1.29 3.07 2.09 4.80 4.70 3.77
3.30
3.30 3.30 1.50 3.30 1.29 3.07 2.09 3.30 3.30 3.30
*/