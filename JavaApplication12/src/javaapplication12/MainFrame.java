
package javaapplication12;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
public class MainFrame extends JFrame {
    JSpinner input;
    JLabel l1,l2;
    int[]arr;
    JButton b1,b2;
    GraphPanel gpanel;
    ShellSort ss;
    public MainFrame() {
        setSize(400, 500);        
        setTitle("ShellSort");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1=new JButton("Create");       
        b1.setBounds(50,40,100,25);
        b1.addActionListener(new ButtonAction());
        add(b1);
        b2=new JButton("Sort");       
        b2.setBounds(50,70,100,25);
        b2.addActionListener(new ButtonAction2());
        add(b2);
        input=new JSpinner();
        input.setBounds(200,20,50,20);
        l1=new JLabel("Введите размер массива:");
        l1.setBounds(50,20,200,20);
        l2=new JLabel();
        l2.setBounds(50,80,200,20);
        gpanel=new GraphPanel();
        
        add(l1);
        add(input);
        add(l2);
        add(gpanel);    
        ss=new ShellSort(gpanel);
    }
    private class ButtonAction implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            int size=(int) input.getValue();
            if ((size<2)||(size>100)) {
                JOptionPane.showMessageDialog(null, "Размер массива должен быть больше 1  и меньше 10."
                        +"\n Пожалуйста, введите корректные данные!","Error", 
                        JOptionPane.ERROR_MESSAGE);
            } else {
                arr=new int[size];
                for(int i=0; i<size; i++)
                    arr[i]=(int) (Math.random()*300);
//                l1.setText(java.util.Arrays.toString(arr));
//                ShellSort.sort(arr);
//                l2.setText(java.util.Arrays.toString(arr));
                gpanel.setArr(arr);
                gpanel.repaint();
            }                   
        }
    }
    private class ButtonAction2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (arr!=null){
                ss.sort(arr);
            }
        }
    }
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
}