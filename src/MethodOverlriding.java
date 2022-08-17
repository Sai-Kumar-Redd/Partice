
class Animal{
    void barking(){
        System.out.println("Animal making Sound");

    }
}
class Dog extends  Animal{
    void barking (){
        System.out.println("Dog is Barking");

    }
}
public class MethodOverlriding {
    public static void main(String[]args){
        Animal obj1=new Animal();
        obj1.barking();


        Animal obj2=new Dog();
        obj2.barking();

    }
}
