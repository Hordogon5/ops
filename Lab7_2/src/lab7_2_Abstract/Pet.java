
package lab7_2_Abstract;
public abstract class Pet {
    public String name;
    public int age;
    public boolean hungry;
    public abstract void voice();
    
    public static void main(String[] args) {
        PatrolDog Marshal=new PatrolDog();
        Marshal.voice();      
    }
    
}

