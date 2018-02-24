/*
Создать метод, который будет выводить указанный массив на экран в строку.
С помощью созданного метода и метода из предыдущей задачи
заполнить 5 массивов из 10 элементов каждый случайными числами
и вывести все 5 массивов на экран, каждый на отдельной строке.
 */
package lab4;
import java.util.Scanner;

public class Lab4_2 {
    public static int[][] vivod(int[][]arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
       
               System.out.println();  
        } 
        return arr;
    }
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
        int arr[][] = new int[5][10];
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr[i].length; j++){
                    arr[i][j]=(int)(random(a,b)); 
                }
            }
            vivod(arr);
    }   
}