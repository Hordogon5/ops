/*
Создать метод, который будет сортировать указанный массив 
по возрастанию любым известным вам способом.
 */
package lab4;

public class Lab4_3 {
    public static int[] bubbleSort(int[]a) {
        for (int i=a.length-1; i>1; i--)
            for (int j=0; j<i; j++)
                if (a[j] > a[j+1]) {
                int tmp=a[j];
                a[j]=a[j+1];
                a[j+1]=tmp;
            }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        return null;
    }      
    public static void main(String[] args) {
        int[]arr=new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i]=(int)(Math.random()*9);
        }
        bubbleSort(arr);    
    }  
}
