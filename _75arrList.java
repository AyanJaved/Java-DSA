import java.util.ArrayList;

public class _75arrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        // adding element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        
        // adding at certain index
        list.add(3, 10);

        // getting element at index
        int element = list.get(2);
        System.out.println(element);
        
        // removing element from index
        list.remove(3);
        System.out.println(list); 

        // set element
        list.set(2,10);
        System.out.println(list);

        // checking presence of element
        System.out.println(list.contains(1));
        System.out.println(list.contains(5));

        //getting size and iteration
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
