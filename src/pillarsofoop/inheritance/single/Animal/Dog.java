package pillarsofoop.inheritance.single.Animal;

public class Dog extends Animal {
    String breed;
    
    public Dog (String s, String b){
        super(s);
        breed =b;
    }

    public void makeSound(){
        System.out.println(breed+ " barks: " + sound);
    }
};