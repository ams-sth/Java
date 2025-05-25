package pillarsofoop.inheritance.multiLevel.family;

;

public class HeadTeacher extends Teacher {
    
    private String department;

    public HeadTeacher(String name, int age, String subject, String department){
        super(name,age,subject);
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public void lead(){
        System.out.println("I lead the " + getDepartment() + " department");
    }
    
    @Override
    public void introduce(){
        System.out.println("Hello, I'm " + getName() + ", " + " Head of " + getDepartment() + ", and I teach " + getSubject() + ".");    
    }
}