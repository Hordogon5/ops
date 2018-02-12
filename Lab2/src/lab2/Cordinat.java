/*
Координатные четверти 
Ввести с клавиатуры два целых числа, которые будут координатами точки, 
не лежащей на координатных осях OX и OY. 
Вывести на экран номер координатной четверти, в которой находится данная точка.
 */
package lab2;
import java.util.Scanner;
public class Cordinat {
    public static void main(String[] args) {
        int x, y;
        while(true) {
            System.out.print("Введите число X: ");
            Scanner sc = new Scanner(System.in);
            try {
                x = sc.nextInt();
                if(x<0 || x>0)
                break; 
                else 
                   System.out.println("Число X не должно равнятся 0!"); 
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        while(true) {
            System.out.print("Введите число Y: ");
            Scanner sc = new Scanner(System.in);
            try {
                y = sc.nextInt();  
                if(y<0 || y>0)
                break; 
                else
                    System.out.println("Число Y не должно равнятся 0!");
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
        if (x>0)
            if(y>0)
                System.out.println("Точка находится в первой четверти");
            else System.out.println("Точка находится в четвертой четверти");
        else 
            if (y>0)
                System.out.println("Точка находится во второй четверти");
            else System.out.println("Точка находится в третьей четверти");          
    }   
}
