class student{
    String name;
    int rollno;
    static String college="Reva";
    static String street="Banglore";

    public student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    void display(){
        System.out.println(name+" "+rollno+" "+college+""+street);
    }
}
public class TestStaticVariable {
    public static void main(String[] args) {
        student s=new student("Sai Kumar",7889);
        student s1=new student("Nikhil",566);
          s.display();
          s1.display();

    }
}
