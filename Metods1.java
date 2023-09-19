
package JavaBasicsStepik;
import java.util.Scanner;

public class Metods1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            System.out.print(isSimple(number) + " ");
            
            
        }
    }
    
     public static boolean isSimple(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}


/*
Напишите статический метод isSimple(), который возвращает true, если аргумент является простым числом, и false - в противном случае.

Простым называется целое положительное число, которое не имеет других делителей, кроме единицы и себя самого.

Отрицательные числа не могут быть простыми (поэтому функция должна возвращать false). Простыми также не являются числа 0 и 1.

В методе main продемонстрировано использование метода isSimple(). Этот код менять нельзя!
*/

/*
Write a static isSimple() method that returns true if the argument is a simple number and false otherwise.

A prime number is a positive integer that has no other divisors other than one and itself.

Negative numbers cannot be prime (so the function must return false). The numbers 0 and 1 are also not prime.

The main method demonstrates the use of the isSimple() method. This code cannot be changed!
*/