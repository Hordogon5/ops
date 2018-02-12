/*
Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них
(Поиск минимума выполняется в функции).
 */
package lab2;
import java.util.Scanner;
public class Min2chisel {
    public static void main(String[] args) {
        int one, two;
        while(true) {
            System.out.print("Введите первое число: ");
            Scanner sc = new Scanner(System.in);
            try {
                one = sc.nextInt();            
            break;    
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        while(true) {
            System.out.print("Введите второе число: ");
            Scanner sc = new Scanner(System.in);
            try {
                two = sc.nextInt();            
            break;     
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        System.out.println("Минимальное число:"+min(one,two));  
    }
    public static int min(int a, int b) {
        if (a<b)
            return a;
        else
            return b;
    }   
}
