package JavaBasicsStepik;

import java.util.Scanner;
public class StepikJavaBasisStringBuilder1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.trim();
        String[] words = str.split(" +");
        StringBuilder resultText = new StringBuilder();
        for(String word:words){
            if(word.contains("z")){
                resultText.append("ERROR ");
            } else {
                resultText.append(word).append(" "); 
            }
        }
        String outputText = resultText.toString().trim();
        System.out.println(outputText);
    }
}


/*
Пользователь вводит строку из слов, разделенных пробелами.  Заменить все слова, которые содержат букву z на слово "ERROR". Также удалить все лишние пробелы в начале и в конце строки. Между словами оставить ровно один пробел. 

Тестовые данные
Sample Input:

   mama   zlobno   myla    puzzle  and    ramy   
Sample Output:
*/

/*
The user enters a string of words separated by spaces. Replace all words that contain the letter z with the word "ERROR". Also remove all extra spaces at the beginning and end of the line. Leave exactly one space between words.

Test data
Sample Input:

   mama zlobno myla puzzle and ramy
Sample Output:
*/