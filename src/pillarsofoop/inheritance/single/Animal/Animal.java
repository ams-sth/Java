package pillarsofoop.inheritance.single.Animal;

public class Animal {

    String sound;
    
    public Animal (String s){
        sound = s;
    }

    public void makeSound () {
        System.out.println("Sound : " + sound);
    }
}