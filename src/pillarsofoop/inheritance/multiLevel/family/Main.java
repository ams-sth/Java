package pillarsofoop.inheritance.multiLevel.family;

public class Main {
    public static void main(String[] args){
        HeadTeacher headteacher = new HeadTeacher("John", 30, "Physics", "Science");
        headteacher.introduce();
        headteacher.teach();
        headteacher.lead();
    }
}