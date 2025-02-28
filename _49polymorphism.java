public class _49polymorphism {
    public static void main(String[] args) {
        //method overloading
        Calculator calc=new Calculator();
        System.out.println(calc.sum(5,2));
        System.out.println(calc.sum(5.3f,2.7f));
        System.out.println(calc.sum(5,2,4));
        //method over-riding
        Deer obj=new Deer();
        Animal obj2=new Animal();
        obj.eat();
        obj2.eat();
    }
}
// method OVERLOADING
class Calculator{
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a , float b){
        return a+b;
    }
    int sum(int a , int b,int c){
        return a+b+c;
    }
}
// method over-riding
class Animal{
    void eat(){
        System.out.println("Eating anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eating Grass");
    }
}