import java.util.*;

public class _122heaps {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x)<arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                //index changing
                x = par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
        private void heapify(int idx){
            int left = 2*idx+1;
            int right = 2*idx+2;
            int minIdx = idx;
            if(left<arr.size() && arr.get(minIdx)>arr.get(left)){//leafNode case
                minIdx = left;
            }
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){//leafNode case
                minIdx = right;
            }
            if(minIdx!=idx){
                //swap
                int temp = arr.get(idx);
                arr.set(idx,arr.get(minIdx));
                arr.set(minIdx,temp);
                heapify(minIdx);
            }
        }
        public int remove(){
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            arr.remove(arr.size()-1);

            heapify(0);
            return data;
        }
    }
    public static void heapify(int arr[],int i,int size){
        int left = 2*i+1;    
        int right = 2*i+2;
        int maxIdx = i;
        if(left<size && arr[left]>arr[maxIdx]){
            maxIdx=left;
        }
        if(right<size && arr[right]>arr[maxIdx]){
            maxIdx=right;
        }
        if(maxIdx!=i){
            int temp = arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;

            heapify(arr, maxIdx, size);
        }    
    }
    public static void heapSort(int arr[]){
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
        }
    }
    public static void main(String[] args){
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
        int arr[]={1,2,4,5,3};
        heapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
