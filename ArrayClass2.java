package JavaBasicsStepik;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArrayClass2 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int size = scan.nextInt();
         double[] arr = new double [size]; 
         long seed = scan.nextLong();
         Random rand = new Random(seed);
        
         for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextDouble() * 2; // zahl von 2 bis 15    
         }
        
        double max = 0.00;
        double min = 1;
        String str=Arrays.toString(arr);
        System.out.println(str);
        
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        double sum = max + min;
        System.out.print(sum);
        
    }    
}


/*
Пользователь вводит размер массива и начальное значение генератора случайных чисел. 

Создать массив  вещественных чисел заданного размера и заполнить его случайными числами от 0 до 2. Распечатать исходный массив, используя метод toString() - в квадратных скобках, элементы через запятую.

С новой строки вывести на консоль сумму максимального и минимального элементов массива.

Тестовые данные
Sample Input:

5 25
Sample Output:

[1.4631897195641836, 0.10745131965527377, 1.2906709676610488, 0.14895347726291952, 0.012141832026828503]
1.4753315515910121
*/
/*
The user enters the size of the array and the initial value of the random number generator.

Create an array of real numbers of a given size and fill it with random numbers from 0 to 2. Print the original array using the toString() method - in square brackets, elements separated by commas.

On a new line, output the sum of the maximum and minimum elements of the array to the console.

test data
sample input:

5 25
sample output:

[1.4631897195641836, 0.10745131965527377, 1.2906709676610488, 0.14895347726291952, 0.012141832026828503]
1.4753315515910121
*/