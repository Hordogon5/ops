
package lab6_2;

public class Cat extends Pet{
    public String name;
    public Cat(double weight, String gender,int age,String name) {
        super(weight,gender,age);
        this.name=name;
    }
    public void vivod() {
        System.out.println("Вес:"+weight);   
        System.out.println("Возраст:"+age);
        System.out.println("Пол:"+gender);
        System.out.println("Имя:"+name);
        
    }
    
}
