/*
Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок. 
 */
package lab2;
import java.util.Scanner;
public class RisPryam {
    public static void main(String[] args) { 
        int m,n;
        while(true) {
            System.out.print("Введите число m: ");
            Scanner sc = new Scanner(System.in);
            try {
                m = sc.nextInt();
                if (m>0)               
                break;
                else
                System.out.println("Число m должно быть больше 0!");    
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        while(true) {
            System.out.print("Введите число n: ");
            Scanner sc = new Scanner(System.in);
            try {
                n = sc.nextInt();
                if (n>0)               
                break;
                else
                System.out.println("Число n должно быть больше 0!");    
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        for (int i=0; i<m ; i++) {
            for (int j=0; j<n; j++){ 
                System.out.print(8);
            }   
            System.out.println();
        }
    }  
}
