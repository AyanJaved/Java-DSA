public class _37stringcomp {
    public static void main(String args[]){
        String s1="Rahul";
        String s2="Rahul";
        String s3= new String("Rahul");// a new object is created so its not equal
        if(s1==s2){
            System.out.println("equal");
        }
        else{
            System.out.println(" Not equal");
        }
        if(s1==s3){
            System.out.println("equal");
        }
        else{
            System.out.println(" Not equal");
        }
        if(s1.equals(s3)){
            System.out.println("equal");
        }
        else{
            System.out.println(" Not equal");
    
        }
    }
}
