
package lab6_3;

public class Animal extends Fish {
    public String gender;
    public Animal(double weight, int age,String gender) {
        super(weight,age);
        this.gender=gender;
    }
    
}
