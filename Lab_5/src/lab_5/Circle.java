
package lab_5;
import java.util.Scanner;
public class Circle {
    double x;
    double y;
    double r;
    public Circle() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Введите x: ");
                this.x = sc.nextDouble();
                System.out.print("Введите y: ");
                this.y = sc.nextDouble(); 
                System.out.print("Введите r: ");
                this.r = sc.nextDouble(); 
            break;    
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
    }
    //вывод.
    public void get() {
        System.out.println("x="+x+"; y="+y+"; r="+r);
    }
    //находим длину окружности.
    public double Circumference() {
        return Math.floor(2 * Math.PI * this.r);
    }
    // перемещаем центр.
    public void moveCircle() {
        x = (Math.floor(Math.random()*198)-99);
        y = (Math.floor(Math.random()*198)-99);
        System.out.println("["+x+";"+y+"]");
    }
    //находим расстояние от центров.
    public static double distance(Circle o1, Circle o2){
       double a = (o2.x - o1.x);
       double b = (o2.y - o1.y); 
       return Math.sqrt(a*a+b*b);
    }
    //касаются ли?
    public static boolean touch(Circle o1, Circle o2){
        double dist = distance(o1, o2);
        if ((dist>o1.r) && (dist>o2.r)) {
            if (dist-(o1.r+o2.r)==0)
                return false;
            else return true;     
        }else{
            if (o1.r>o2.r){
                if(o1.r-(o2.r+dist)==0)
                    return true;
                else return false;
            }else{
                if(o2.r-(o1.r+dist)==0)
                    return true;
                else return false;
            }            
        }    
    }
    public static void main(String[] args) {
        Circle o1 = new Circle();
        System.out.print("Координаты центра и радиус первой окружности: ");
        o1.get();
        double length = o1.Circumference();
        System.out.println("Длина окружности:"+length);
        System.out.print("Новый центр окружности:");
        o1.moveCircle();
        Circle o2 = new Circle();
        System.out.print("Координаты центра и радиус второй окружности: "); 
        o2.get();
        double dist = distance(o1, o2);
        System.out.println("Расстояние между центрами двух окружностей:"+dist);
        if (touch(o1, o2)) 
            System.out.println("Окружности касаются");
        else
            System.out.println("Окружности не касаются");
    } 
}
