package JavaBasicsStepik;

import java.util.Scanner;
public class StepikJavaBasisStringBuilder4 {
 public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
       int sum = 0;
       StringBuilder result = new StringBuilder();
       boolean foundDigit = false;
       for (char ch : str.toCharArray()) {
           if (Character.isDigit(ch)) {
               int digit = ch - '0';
               sum += digit;
               result.append(digit).append("+");
               foundDigit = true;
            }
        }         
        if (!foundDigit) {
            System.out.println("ERROR"); 
        }else{
            result.deleteCharAt(result.length() - 1);
            result.append("=").append(sum);
            System.out.println(result.toString());}
    }
}


/*
Пользователь вводит строку, в которой среди других символов содержатся символы цифр. Сформируйте строку, которая "представляет" сумму этих цифр. Выведите полученную строку на консоль. 

Если в исходной строке цифр нет, то должно быть выведено ERROR.

Р.S.  Преобразовать символ в число можно вычитанием кода символа '0'

Тестовые данные
Sample Input:

ab34c#5i02k tolkien25
Sample Output:

3+4+5+0+2+2+5=21
*/

/*
The user enters a string that contains numeric characters among other characters. Form a string that "represents" the sum of these digits. Print the resulting line to the console.

If there are no numbers in the source string, then ERROR should be output.

P.S. You can convert a character to a number by subtracting the character code '0'

Test data
Sample Input:

ab34c#5i02k tolkien25
Sample Output:

3+4+5+0+2+2+5=21
*/