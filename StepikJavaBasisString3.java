package JavaBasicsStepik;

import java.util.Scanner;
public class StepikJavaBasisString3 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String str1 = scan.nextLine();
         String str2 = scan.nextLine();
         String str3 = scan.nextLine();
        
        int findFirst1 = str1.indexOf(';');      
        int findLast1 = str1.lastIndexOf(';'); 
        int findFirst2 = str2.indexOf(';');
        int findLast2 = str2.lastIndexOf(';');  
        int findFirst3 = str3.indexOf(';');
        int findLast3 = str3.lastIndexOf(';'); 

        
        String sub1 = str1.substring(findFirst1+1, findLast1);
        String sub2 = str2.substring(findFirst2+1, findLast2);
        String sub3 = str3.substring(findFirst3+1, findLast3);
        System.out.println(sub1 + "" + sub2 + "" + sub3);
        
    }
}


/*
Пользователь вводит три строки, которые содержат части кодового слова. Каждая вводимая строка может содержать пробелы и заканчивается символом перехода на новую строку ('\n').

Части кодового слова выделены внутри строки знаками ';'. Нужно соединить эти части в одну строку и вывести эту строку на консоль. 

Замечание: поскольку предполагается, что кодовое слово будет как-то использовано в дальнейшем, недостаточно его просто вывести на консоль по частям. Нужно именно сформировать его в виде одной строки, а затем уже выводить!

Тестовые данные
Sample Input:

To be or ;not; to be?
tes;ting; is good
I like ;ham; more then eggs
Sample Output:
*/

/*
The user enters three lines that contain parts of the code word. Each line you enter may contain spaces and ends with a newline character ('\n').

Parts of the code word are highlighted within the line with ';' signs. You need to combine these parts into one line and output this line to the console.

Note: since the codeword is expected to be used in some way later, it is not enough to simply print it to the console in parts. You just need to form it in the form of one line, and then print it out!

Test data
Sample Input:

To be or ;not; to be?
tes;ting; is good
I like ;ham; more then eggs
sample output:
*/