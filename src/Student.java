public class Student {
    String CollegeName="Reva University";//Instance Variable
    String Designation="Computer Science";
    int StudentID;


    public void printData(){
        System.out.println("College:"+CollegeName);
        System.out.println("StudentID"+StudentID);
    }


}
class OnlineStudent extends Student{
     String Platform="Coursera";


     public void printData(){
         System.out.println("Platform:"+Platform);

     }
}
class TestStudent {
    public static void main(String[]args){
        Student s=new Student();
        s.StudentID=101;
        s.printData();

        OnlineStudent o=new OnlineStudent();
        o.printData();
    }
}