
package lab6_3;

public class Human extends Ape{
    public String name;
    public Human(double weight,int age, String gender,String color,String name) {
        super(weight, age, gender, color);
        this.name=name;
    }
    public void vivod() {
        System.out.println("Вес:"+weight);   
        System.out.println("Возраст:"+age);
        System.out.println("Пол:"+gender);
        System.out.println("Имя:"+name);
        System.out.println("Цвет:"+color);
    }
    public static void main(String[] args) {
        Human man = new Human(2.6,5,"мужской","черный","Petr");
        man.vivod();       
    }     
    
}
