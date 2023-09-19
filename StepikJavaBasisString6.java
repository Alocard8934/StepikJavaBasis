package JavaBasicsStepik;

import java.util.Scanner;
public class StepikJavaBasisString6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scanner initialization
        String str = scan.nextLine();          // input string
        str =str.trim();                       // removing space
        String[] words = str.split(" +");      // iterate over words into an array
        String result = "";                    // creating an empty line
        int max = 0;                           // initialization of max variable
        String langWord = "";                  // initializing a long word variable
        for(String word:words){                // a loop for defining a long word
            if(word.length() > max){
                max = word.length();
                langWord = word;

            } 
        }System.out.println(langWord);         // output of a long word to the console
         
    }
}


/*
Ввести строку из слов, разделенных пробелами. Между словами может быть любое количество пробелов. Также пробелы могут быть перед первым и после последнего слова.

Найти и распечатать первое слово максимальной длины.

Тестовые данные
Sample Input:

   Свиристелки прилетели     и    запели в унисон   
Sample Output:

Свиристелки
*/

/*
Enter a string of words separated by spaces. There can be any number of spaces between words. Spaces can also be before the first and after the last word.

Find and print the first word of maximum length.

Test data
Sample Input:

   The pipers flew in and sang in unison   
Sample Output:

Pipes
*/