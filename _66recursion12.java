public class _66recursion12 {
    public static void printbinarystrings(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        // if(lastplace == 0){
        //     //str.append("0");
        //     printbinarystring(n-1, 0, str.append("0"));
        //     printbinarystring(n-1, 1, str.append("1"));
        // }
        // else{
        //     printbinarystring(n-1, 0, str.append("0"));
        // }
        printbinarystrings(n-1, 0, str+"0");
        if(lastplace == 0){
            printbinarystrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printbinarystrings(3, 0, "");
    }
}
