public class _27rainwater {
    public static int trappedWater(int height[]){
        int n = height.length;
        //calculate left max boundary - auxillary array
        int leftmax[] = new int[n] ;
        leftmax[0]= height[0];
        for(int i=1; i<n ;i++){
            leftmax[i]= Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary - auxillary array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i= n-2 ; i>=0 ;i--){
            rightmax[i]= Math.max(height[i],rightmax[i+1]);
        }
        int trapwater=0;
        for(int i = 0; i<n ;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            // if width is given [trapwater = (waterlevel - height[i]) * width] ;
            trapwater += waterlevel - height[i];
        }
        return trapwater;
    }
    public static void main(String args[]){
        int height[]= {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}