package JavaBasicsStepik;

import java.util.Scanner;
public class StepikJavaBasisString5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delCom(str));        
    } 
    public static String delCom(String str){
        String str2 = ".com";  
        int findLast = str.lastIndexOf(str2);  
        if (findLast >= str.length() -4){
            String sub = str.substring(0, findLast);
            return sub;
        } return str;           
    }
}
/*
Напишите статический метод, который проверяет, есть ли в конце строки подстрока ".com". Если да, то он возвращает часть строки без этого фрагмента. Если нет, то он возвращает строку без изменения.

Тестовые данные
Sample Input 1:

intel.com.think.com
Sample Output 1:

intel.com.think
Sample Input 2:

stepik.org
Sample Output 2:

stepik.org
*/
/*
Write a static method that checks whether there is a ".com" substring at the end of a string. If yes, then it returns the part of the string without that fragment. If not, then it returns the string unchanged.

Test data
Sample Input 1:

intel.com.think.com
Sample Output 1:

intel.com.think
Sample Input 2:

stepik.org
Sample Output 2:

stepik.org
*/