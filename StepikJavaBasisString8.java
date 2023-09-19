package JavaBasicsStepik;

import java.util.Scanner;
public class StepikJavaBasisString8 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.trim();
        String[] words = str.split("\\s+");
        StringBuilder resultText = new StringBuilder();
        for(String word:words){
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1);
                resultText.append(firstChar).append(restOfWord).append(" ");
            }
        }
        String outputText = resultText.toString().trim();
        System.out.println(outputText);
    }
}


/*
Введите строку, состоящую из слов, отделенных ровно одним пробелом.

Замените первую букву каждого слова на прописную. Выведите полученную строку.

Тестовые данные
Sample Input:

one apple a day keeps a doctor away
Sample Output:

One Apple A Day Keeps A Doctor Away
*/

/*
Enter a string consisting of words separated by exactly one space.

Replace the first letter of each word with a capital letter. Output the resulting string.

Test data
Selective input:

one apple a day scares the doctor away
Selective output:

One Apple a Day scares the Doctor away
*/