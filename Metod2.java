package JavaBasicsStepik;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
    }
    
    static int simpleInRange(int a, int b){
        int sum = 0;
            if(a > b){
            int temp = a;
            a = b;
            b = temp;}
                
            for(int num = a; num <= b; num++){
                
            if(num <= 1) {continue;
                         }
            boolean j = true;
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num%i==0){
                    j = false;
                    break;
                }
            }
            
            if(j){
                sum++;
            }
            
        }

      return sum;
    
    }
}

/*
Напишите статический метод simpleInRange(), который подсчитывает количество простых чисел в заданном диапазоне. Если границы диапазона введены неверно (первое число больше второго), то в методе нужно их переставить местами. 

В методе main продемонстрировано использование  simpleInRange() (этот код менять нельзя!)

P. S. Используйте метод isSimple(), уже реализованный в предыдущем задании!
*/
/*
Write a static simpleInRange() method that counts the number of primes in a given range. If the range boundaries are entered incorrectly (the first number is greater than the second), then they need to be rearranged in the method.

The main method demonstrates the use of simpleInRange() (this code cannot be changed!)

P.S. Use the isSimple() method already implemented in the previous task!
*/