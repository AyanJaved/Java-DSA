import java.util.*;
public class _38substring{
    public static String substring(String str,int si,int ei){
        String sstring="";
        for(int i=si;i<ei;i++){
            sstring+=(str.charAt(i)+" ");
        }
        return sstring;
    }
    public static void main(String args[]){
        String str="Hello World";
        int si=0;//starting index
        int ei=4;//excluding index
        System.out.println(str.substring(0,4));//inbuilt function
        System.out.println(substring(str,si,ei));
    }
}