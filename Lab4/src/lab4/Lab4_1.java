/*
Создать статический метод,
который будет иметь два целочисленных параметра a и b,
и в качестве своего значения возвращать случайное целое число из отрезка [a;b].
C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.
 */
package lab4;
import java.util.Scanner;

public class Lab4_1 {
    public static int random(int a, int b) {
        int c;
        c = (int)(Math.random()*((b+1)-a)+a);
        return c;
    }
    public static void main(String[] args) {
        int a, b;
        while(true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Введите a: ");
                a = sc.nextInt();
                System.out.print("Введите b: ");
                b = sc.nextInt();   
            break;    
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        System.out.print("Отрезок: ["+a+";");
        System.out.println(b+"]");
        int arr[] = new int[20];
        for(int i=0; i<arr.length; i++) {
            arr[i]=(int)(random(a,b)); 
            System.out.print(arr[i]+" ");
        }   
    }  
}
