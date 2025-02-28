import java.util.*;

public class _120BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root, int val){
        if (root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        } else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        } else if(root.data<key){
            return search(root.right,key);
        }else{
            return search(root.left,key);
        }
    }
    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right =  delete(root.right,val);
        } else if(root.data>val){
            root.left= delete(root.left,val);
        } else{ // case 1 leaf node
            if(root.right == null && root.left == null){
                return null;
            }
            if(root.left == null){// single child
                return root.right;
            } else if(root.right == null){
                return root.left;
            }
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>= k1 && root.data<= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        } else if(root.data <k1){
            printInRange(root.left, k1, k2);
        } else{
            printInRange(root.right, k1, k2);
        }
    }
    public static void printPath(ArrayList<Integer>path){
        for(int i = 0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void printRootToLeaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){
            printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static boolean isBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!= null && root.data<= min.data){
            return false;
        } else if(max!=null && root.data>= max.data ){
            return false;
        }
        return isBST(root.left, min, root) && isBST(root.right, root, max);
    }
    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    public static Node createBST(int arr[],int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1,end);
        return root;
    }
    public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node creatBST2(ArrayList<Integer> inorder, int st , int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = creatBST2(inorder, st, mid-1);
        root.right = creatBST2(inorder, mid+1, end);
        return root;
    }
    public static Node balancedBST(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        root = creatBST2(inorder, 0, inorder.size()-1);
        return root;
    }
    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;
        public info(boolean isBST,int size,int min,int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = 0;
    public static Info largestBST(Node root){
        if(root==null){
            return Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size +1;
        int min = (Math.min(root.data,Math.min(leftInfo.min,rightInfo.min)));
        int max = (Math.max(root.data,Math.max(leftInfo.max,rightInfo.max)));

        if(root.data<= leftInfo.max || root.data>rightInfo.min){
            return new Info(false,size,min,max);
        }
        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST,size);
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);
    }
    public static Node mergeBST(Node root1,Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        int i=0, j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr.get(i)<= arr2.get(i)){
                finalArr.add(arr1.get(i));
                i++;
            } else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.get(i)){
            finalArr.add(arr2.get(j));
            j++;
        }
        return createBST(finalArr, 0, finalArr.size(-1));
    }
    

    public static void main(String[] args) {
        // int val[] = {5,1,3,4,2,7};
        // Node root=null;
        // for(int i = 0; i<val.length;i++){
        //     root = insert(root, val[i]);
        // }
        // inorder(root);
        // System.out.println();
        // if(search(root, 6)){
        //     System.out.println("found");
        // } else {
        //     System.out.println("not found");
        // }
        // int val[]={8,5,3,1,4,6,10,11,14};
        // Node root = null;
        // for(int i = 0; i<val.length;i++){
        //     root = insert(root, val[i]);
        // }
        // inorder(root);
        // System.out.println();
        // root=delete(root, 1);
        // System.out.println();
        // inorder(root);
        // printInRange(root, 4, 11);

        // printRootToLeaf(root,new ArrayList<>());
        
        // if(isBST(root, null, null)){
        //     System.out.println("valid");
        // } else{
        //     System.out.println("Not");
        // }

        // Node root = new Node(8);
        // root.left = new Node(5);
        // root.right = new Node(10);
        // root.left.left = new Node(3);
        // root.left.right = new Node(6);
        // root.right.right = new Node(11);
        // inorder(root);
        // mirror(root);
        // inorder(root);

        // int arr[]={3,5,6,8,10,11,12};
        // Node root  =createBST(arr, 0, arr.length-1);
        // inorder(root);
    }
}