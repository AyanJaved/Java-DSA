public class _48inherit {
    public static void main(String[] args) {
        
    }
}
// animal-mamal sinle level. whole multi level inheritance . animal-fish-mammal hierarchy
class Animal{
    public void eat(){
        System.out.println("eating");
    }
}
class fish extends Animal {
    public void swim(){
        System.out.println("swimming");
    }
}
class Mamal extends Animal{
    public void walk(){
        System.out.println("walking");
    }
}
class Dog extends Mamal{
    public void speak(){
        System.out.println("Bark");
    } 
}