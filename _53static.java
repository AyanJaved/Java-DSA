public class _53static {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.Schoolname="SFPS";
        Student s2=new Student();
        System.out.println(s2.Schoolname);
    }
}
class Student{
    int rollNo;
    String name;
    static String Schoolname;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    
}