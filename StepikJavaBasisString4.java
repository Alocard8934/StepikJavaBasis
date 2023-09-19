package JavaBasicsStepik;

import java.util.Scanner;
public class StepikJavaBasisString4 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean isGMailAddress(String str){
        int ind = str.indexOf('@');
        if(ind != -1 && str.indexOf('@', ind + 1) == -1) {
            if (str.endsWith("@gmail.com")) {
                return true;
            }
        }return false; 
    }
}


/*
Напишите метод, который проверяет, что строка является адресом почты gmail.com (т.е. в конце строки "@gmail.com", и знак @ только один).

Метод main()  менять нельзя!

Тестовые данные
Sample Input 1:

petr.ivanov@gmail.com
Sample Output 1:

YES
Sample Input 2:

ivanov@petr@gmail.com
Sample Output 2:

NO
*/

/*
Write a method that checks that the string is a gmail.com email address (that is, there is "@gmail.com" at the end of the string, and there is only one @ sign).

The main() method cannot be changed!

Test data
Sample Input 1:

petr.ivanov@gmail.com
Sample Output 1:

YES
Sample Input 2:

ivanov@petr@gmail.com
Sample Output 2:

NO
*/