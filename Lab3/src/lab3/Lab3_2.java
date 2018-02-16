/*
Создайте массив из всех нечётных чисел от 1 до 99,
выведите его на экран в строку, а затем этот же массив
выведите на экран тоже в строку, но в обратном порядке
 */
package lab3;
public class Lab3_2 {
    public static void main(String[] args) {
        int arr[]=new int[50];
        for(int i=0,n=1; i<arr.length; n=n+2,i++){
            arr[i]=n;
	}
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
	}
         System.out.println();
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
	}   
    }   
}
