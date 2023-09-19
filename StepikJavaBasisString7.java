
package JavaBasicsStepik;

import java.util.Scanner;
public class StepikJavaBasisString7 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String kontWord = scan.nextLine();
        str =str.trim();     
        String[] words = str.split(" +");
        StringBuilder resultText = new StringBuilder();
        for(String word:words){ 
            if(!word.equals(kontWord)){
                resultText.append(word).append(" ");
            }
          }
        String output = resultText.toString().trim();
        System.out.println(output);
    }
}


/*
Ввести текст из слов, разделенных пробелами. Между словами может быть любое количество пробелов. Также пробелы могут быть перед первым и после последнего слова.

Также ввести контрольное слово.

Удалить из текста все появления данного слова (но не как части другого слова!)

Также удалить все лишние пробелы между словами и в начале и в конце строки.

Тестовые данные
Sample Input:

A good    dog deserves a    good bone or goodness
good
Sample Output:

A dog deserves a bone or goodness
*/

/*
Enter text from words separated by spaces. There can be any number of spaces between words. There can also be spaces before the first and after the last word.

Also enter a control word.

Remove all occurrences of this word from the text (but not as parts of another word!)

Also remove all extra spaces between the words and at the beginning and end of the line.

Test data
Selective input:

A good dog deserves a good bone or a good mood.

Selective output:

A dog deserves a bone or something delicious
*/