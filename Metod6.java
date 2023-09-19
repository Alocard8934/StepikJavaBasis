package JavaBasicsStepik;

import java.util.Scanner;
public class Metod6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl = scanner.nextInt();
        if(zahl == 1){
            double side = scanner.nextDouble();
            double square = square(side);
            System.out.printf("%.2f%n", square);
        } else if(zahl == 2){
            double leight = scanner.nextDouble();
            double widht = scanner.nextDouble();
            double square = square(leight, widht);
            System.out.printf("%.2f%n", square);
        }
        
    }
    public static double square(double side){
        return side * side;
    }
    public static double square(double leight, double widht){
        return leight * widht;
    }
    
}


/*
Напишите две перегрузки статического  метода square() для вычисления площади прямоугольника. В одном случае в метод передаются две стороны прямоугольника, а в другом - одна сторона квадрата (все - вещественные числа).

В методе main() вводится сначала целое число:

1 означает, что нужно вычислить площадь квадрата. И затем следует ввод одного вещественного числа (стороны квадрата)
2 означает, что нужно вычислить площадь прямоугольника. Затем следует ввод двух сторон прямоугольника.
Выводимую площадь нужно представить с двумя знаками после десятичной точки.

Тестовые данные
Sample Input 1:

2 4.4 3.2
Sample Output 1:

14.08
Sample Input 2:

1 5.5
Sample Output 2:

30.25
*/

/*
Write two overloads of the static square() method to calculate the area of ​​a rectangle. In one case, two sides of a rectangle are passed to the method, and in the other, one side of a square (all are real numbers).

In the main() method, an integer is entered first:

1 means you need to calculate the area of ​​the square. And then follows the input of one real number (the side of the square)
2 means to calculate the area of ​​the rectangle. This is followed by the input of the two sides of the rectangle.
The displayed area must be presented with two digits after the decimal point.

test data
Sample Input 1:

2 4.4 3.2
Sample Output 1:

14.08
Sample Input 2:

1 5.5
Sample Output 2:

30.25

*/