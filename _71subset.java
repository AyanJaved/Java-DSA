public class _71subset {
    public static void subset(String str, String ans, int i){
        if(i==str.length()){
            if((ans.length()==0)){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }    
            return;
        }
        // if we use i++ it wil give error
        subset(str, (ans+str.charAt(i)) , i+1);// choice 1 => add with string //
        subset(str, ans , i+1);// choice 2 => don't add with string
    }
    public static void main(String[] args) {
        String str="abc";
        subset(str,"", 0);
    }
}