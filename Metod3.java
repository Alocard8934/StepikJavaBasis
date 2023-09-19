package JavaBasicsStepik;
import java.util.Scanner;

class Metod3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printDivider(number);
    }
    static void printDivider(int number){
         for(int i = 1; i <=number; i++){
            if(number%i == 0){
                System.out.print(i + " ");               
            }
        } 
    }
}

/*
Напишите статический  метод printDivider(), который выводит все делители натурального числа через пробел (включая единицу и само число). Метод не возвращает никакого значения!

Пример использования этого метода в main() менять нельзя!

Тестовые данные
Sample Input:

246
Sample Output:

1 2 3 6 41 82 123 246
*/
/*
Write a static printDivider() method that prints all space-separated divisors of a natural number (including one and the number itself). The method does not return any value!

The example of using this method in main() cannot be changed!

test data
sample input:

246
sample output:

1 2 3 6 41 82 123 246
*/