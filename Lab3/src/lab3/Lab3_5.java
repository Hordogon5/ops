/*
Создать двумерный массив из 7 строк по 4 столбца 
в каждой из случайных целых чисел из отрезка [-5;5].
Вывести массив на экран.
Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
Если таких строк несколько, то вывести индекс первой встретившейся из них
 */
package lab3;
public class Lab3_5 {
    public static void main(String[] args) {
        int[]arr[]=new int[7][4];
        int max=0;
        int index=0;
        for(int i=0;i<7;i++){ 
            int p=1; 
            for(int j=0;j<4;j++){
                arr[i][j]=(int)(Math.random()*11-5);
                System.out.print(arr[i][j]+" ");
                p*=arr[i][j];
            }
            System.out.println();
            if (max<Math.abs(p)) {
                max=Math.abs(p);
                index=i;
            } 
        }
        System.out.println("Индекс строки с наибольшим произведением: " + index);
    }         
}