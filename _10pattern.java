
public class _10pattern {
    public static void main(String args[]){
        for (int i = 1; i<=4 ; i++){
            for ( int j = 1 ; j <= i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i<=4 ; i++){
            for ( int j = 1 ; j <= 4-i+1 ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        // Half Pyramid of numbers 
        for (int i = 1; i<=4 ; i++){
            for ( int j = 1 ; j <= i ; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
        // Charecter but without repeat
        char ch = 'A';
        for (int i = 1; i<=4 ; i++){
            for ( int j = 1 ; j <= i ; j++ ){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
