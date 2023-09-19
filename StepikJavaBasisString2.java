package JavaBasicsStepik;
import java.util.Scanner;

public class StepikJavaBasisString2 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String output = str.replace(";", ".,");
        System.out.println(output);
    }
}



/*
Введите строку (в ней возможны пробелы). Замените в ней каждый символ «;»   на пару символов «.,»

Тестовые данные
Sample Input:

hello;; by!; ;;
Sample Output:

hello.,., by!., .,.,
*/

/*
Enter a string (there may be spaces). Replace each ";" character in it. a couple of characters ".,"

Test data
Sample Input:

hello;; by!; ;;
sample output:

hello.,., by!., .,.,
*/