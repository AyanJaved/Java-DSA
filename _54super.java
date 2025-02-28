public class _54super {
    public static void main(String[] args) {
        Horse h=new Horse();
    }
}
class Animal{
    Animal(){
        System.out.println("Animal is called");
    }
}
class Horse extends Animal {
    Horse(){
        super();//it is also called by default
        System.out.println("Horse is called");
    }
}
