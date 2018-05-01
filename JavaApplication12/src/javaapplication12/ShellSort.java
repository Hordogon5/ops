
package javaapplication12;

import java.util.Timer;
import java.util.TimerTask;

public class ShellSort {
    public GraphPanel gpanel;
    Timer myTimer=new Timer();
    TimerTask task;
    public ShellSort(GraphPanel gp){
        gpanel=gp;
        
    }
    public void sort(int[]arr) {
        //ЗАПИХНУТЬ СЮДА 
        int h = 1;
        while (h*3 < arr.length)
            h = h * 3 + 1;

        while(h >= 1) {
            hSort(arr, h);
            h = h/3;
        }
    }

    private void hSort(int[] arr, int h) {
    
        for (int i = h; i < arr.length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (arr[j] < arr[j - h]){
//                    long before = System.currentTimeMillis();
//                    long after = System.currentTimeMillis();
//                    while (after-before<10)
//                        after = System.currentTimeMillis();
        
                    int temp = arr[j];
                    arr[j] = arr[j-h];
                    arr[j-h] = temp;
                    gpanel.setArr(arr);
                    //gpanel.repaint();
                    task=new TimerTask(){
            public void run(){
                gpanel.repaint();
            }
            };  
             myTimer.schedule(task, 1000);
                }else
                    break;                
            }
        }
    }
    
    
}
