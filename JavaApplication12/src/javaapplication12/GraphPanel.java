
package javaapplication12;
import javax.swing.*;
import java.awt.*;

public class GraphPanel extends JPanel{
    int[]arr=new int[0];
    public GraphPanel(){
        setLayout(null);
        setBounds(30,120,300,300);
        setBackground(Color.white);
        
    }
    public void setArr(int[]arr){
        this.arr=arr; 
        //System.out.println(java.util.Arrays.toString(this.arr));
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g); // Рисует панель
        g.setColor(Color.BLUE);
        if(arr.length>0){
            double w=300/arr.length;
            for(int i=0; i<arr.length; i++){
                int x=(int)w*i;
                int y=300-arr[i];
                g.fillRect(x, y, (int) w, arr[i]);
            }
        }
        
    }
    
    
   
}
