public class _64recursion10 {
    public static void removeduplicate(String str, boolean map[], StringBuilder newstr , int index){
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(index);
        if(map[currchar-'a']== true){
            removeduplicate(str,map,newstr,index+1);
        }
        else{
            map[currchar-'a'] = true;
            removeduplicate(str,map,newstr.append(currchar),index+1);
        }
    }
    public static void main(String[] args) {
        String str="apnacollege";
        removeduplicate(str,new boolean[26],new StringBuilder(""),0);
    }
}
