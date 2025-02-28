public class _36shortdis {
    public static float displacement(String str){
        int x2=0;
        int y2=0;
        for(int i=0;i<str.length();i++){
            char dir= str.charAt(i);
            if(dir == 'N'){
                y2++;
            }
            else if(dir == 'S'){
                y2--;
            }
            else if(dir == 'W'){
                x2++;
            }
            else{//if(str.charAt(i)== 'E')
                x2--;
            }
        }
        int X=x2*x2;//(x-0)^2 can be written as
        int Y=y2*y2;
        
        return (float)Math.sqrt(X+Y);
    }
    public static void main(String args[]){
        String str = "WNEENESENNN";
        System.out.println("Shortest distance is :"+ displacement(str));
    }
}
