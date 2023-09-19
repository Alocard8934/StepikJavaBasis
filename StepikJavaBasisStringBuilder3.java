package JavaBasicsStepik;

import java.util.Scanner;
public class StepikJavaBasisStringBuilder3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String str = primer(a, b);
        System.out.println(str);
    }
    
    public static String primer(int a, int b){
    StringBuilder result = new StringBuilder();
    result.append(a).append(" + ").append(b).append(" = ").append(a + b);
    return result.toString();
    }
}


/*
Напишите метод primer(), который принимает два целых числа и возвращает строку, представляющую собой пример на сложение (см. тест). Используйте для формирования результата StringBuilder!

Исходный код метода main менять нельзя!

Тестовые данные
Sample Input:

8 11
Sample Output:

8 + 11 = 19
*/


/*
Write a primer() method that takes two integers and returns a string that is an addition example (see test). Use StringBuilder to generate the result!

The source code of the main method cannot be changed!

Test data
Sample Input:

8 11
Sample Output:

8 + 11 = 19
*/