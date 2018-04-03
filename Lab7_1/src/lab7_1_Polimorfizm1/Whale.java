
package lab7_1_Polimorfizm1;

public class Whale extends Cow {
    public void getName(){   
        System.out.println("Я не корова, я кит");
    }
    public static void main(String[] args) {
    Whale whale=new Whale(); 
    whale.getName();
    } 
}