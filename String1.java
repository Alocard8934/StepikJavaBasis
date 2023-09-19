package JavaBasicsStepik;

import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();
        if(a.compareTo(b) > 0){
           String temp = a;
            a=b;
            b=temp;}
         if(a.compareTo(c) > 0){
            String temp = a;
            a = c;
            c = temp;
        }
        if(b.compareTo(c) > 0){
            String temp = b;
            b = c;
            c = temp;
        }
        


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}


/*
Введите три строки (могут содержать пробелы). Выведите их в порядке возрастания. 

Тестовые данные
Sample Input:

Hello, world!
Hello, sky!
By-by, baby!
Sample Output:

By-by, baby!
Hello, sky!
Hello, world!
*/
/*
Enter three lines (may contain spaces). Print them in ascending order.

Test data
Sample Input:

Hello, world!
Hello, sky!
By-by, baby!
Sample Output:

By-by, baby!
Hello, sky!
Hello, world!
*/