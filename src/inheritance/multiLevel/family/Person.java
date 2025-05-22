package inheritance.multiLevel.family;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void introduce(){
        System.out.println(" Hi, I'm " + getName() + " and I am " + getAge() + " years old.");
    }
}