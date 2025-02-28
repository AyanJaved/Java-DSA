public class _35strpalindrome {
    public static boolean palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("NOT a palindrome");
                return false;
            }
        }
        System.out.println("its a palindrome");
        return true;
    }
    public static void main(String args[]){
        String str="madam";
        palindrome(str);
    }
}
