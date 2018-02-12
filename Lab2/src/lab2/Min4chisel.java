/*
Минимум четырех чисел 
Написать функцию, которая вычисляет минимум из четырёх чисел. 
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b).
 */
package lab2;
import java.util.Scanner;
public class Min4chisel {
    public static void main(String[] args) {
        int one, two, three, four;
        while(true) {
            Scanner sc = new Scanner(System.in); 
            try {
                System.out.print("Введите первое число: ");
                one = sc.nextInt(); 
                System.out.print("Введите второе число: ");
                two = sc.nextInt();
                System.out.print("Введите третье число: ");
                three = sc.nextInt();
                System.out.print("Введите четвертое число: ");
                four = sc.nextInt();
            break;    
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        System.out.println("Минимальное число:"+min(one,two,three,four));
    }
     public static int min(int a, int b, int c, int d) {
          int temp = min(a, b);
        if (c < temp && c < d)
            return c;
        else if (d < temp && d < c)
            return d;
        else
            return temp;
     }
     public static int min(int a, int b)
    {
        if (a < b)
            return a;
        else
            return b; 
    }   
}
