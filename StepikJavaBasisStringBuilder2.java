package JavaBasicsStepik;
import java.util.Scanner;
public class StepikJavaBasisStringBuilder2 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            char simb = sb.charAt(sb.length() - 1);
            for (int j = 1; j < words.length; j++) {
                if(words[j].charAt(0) == simb){
                    sb.append(" ").append(words[j]);
                    break;
                }
            }
         }
         System.out.println(sb);
    }
}


/*
Пользователь вводит строку из слов, разделенных одним пробелом. Переставить слова местами так, чтобы каждое следующее слово начиналось с буквы, которой заканчивается предыдущее слово (существование такого слова в тестах гарантируется).

Тестовые данные
Sample Input:

trolli emodji road tiger dog insert game
Sample Output:

trolli insert tiger road dog game emodji
*/

/*
The user enters a string of words separated by one space. Rearrange the words so that each next word begins with the letter that ends the previous word (the existence of such a word in the tests is guaranteed).

Test data
Sample Input:

trolli emodji road tiger dog insert game
Sample Output:

trolli insert tiger road dog game emodji
*/