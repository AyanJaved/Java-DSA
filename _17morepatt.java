public class _17morepatt {
    //hollow rectangle
    public static void hollowRECT( int row, int column){
        //outer loop
        for( int i=1; i <= row; i++){
            //inner loop
             for( int j=1; j <= column; j++){
                if (i==1 || i== row || j==1 || j== column ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
             }
             System.out.println();
        }
    }
    //Inverted Pyramid
    public static void invertedPYRAMID(int n){
        for( int i = 1; i<=n; i++){
            //spaces
            for (int j = 1; j<=n-i ;j++){
                System.out.print(" ");
            }
            //stars
            for ( int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //inverted half pyramid numbers
    public static void invertednum(int n){
        for(int i = 1;i<=n;i++){
            for (int j = 1; j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //floyd's triangle
    public static void floydtri(int n){
        int count = 1;
        for (int i =1 ; i<=n ; i++){
            for ( int j = 1; j<=i ; j++){
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }
    }
    // 0-1 triangle
    public static void _01triangle(int n){
        for ( int i = 1; i<=n ; i++){
            for ( int j = 1; j <= i; j++){
                if ((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    //butterfly
    public static void bytterfly(int n){
        for (int i=1 ; i <= n; i++){
            //star
            for ( int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for ( int j = 1; j<=2*(n-i) ; j++){
                System.out.print(" ");
            
            }
            //star
            for ( int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half 
        for (int i=n ; i >= 1; i--){
            //star
            for ( int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for ( int j = 1; j<=2*(n-i) ; j++){
                System.out.print(" ");
            
            }
            //star
            for ( int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // solid rhombus
    public static void rhombus(int n){
        for ( int i = 1; i<=n ; i++){
            for (int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n ; j++ ){
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
    //hollow rohmbus
    public static void hollowrho(int n){
        for ( int i = 1; i <= n ; i++){
            for( int j = 1 ; j <= (n-i) ; j++  ){
                System.out.print(" ");
            }
            for ( int j = 1; j <= n; j++){
                if (i== 1|| i==n|| j==1||j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // diamond pattern
    public static void diamond(int n){
        for (int i = 1 ; i<= n; i++){
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n ; i>= 1; i--){
            for(int j = 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //hollowRECT(5,10);
        //invertedPYRAMID(4);
        //invertednum(5);
        //floydtri(5);
        //_01triangle(5);
        //bytterfly(4);
        //rhombus(5);
        //hollowrho(5);
        diamond(5);

    }
}