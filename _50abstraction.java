public class _50abstraction {
    public static void main(String[] args) {
        Horse hor=new Horse();
        chicken chik=new chicken();
        hor.walk();
        chik.walk();
        //Animal a=new Animal(); object of abstract class cannot be created.
        System.out.println(hor.color);//constructor of parents class will be called so horse will be printed
    }
}
abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void changecolor(){
        color = "Dark brown";
    }
    void walk(){
        System.out.println("horse walks");
    }
}
class chicken extends Animal{
    void changecolor(){
        color = "White";
    }
    void walk(){
        System.out.println("chicken walks");
    }
}
