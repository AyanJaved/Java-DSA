import java.util.ArrayList;

public class _79mulal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);
        for(int i = 0  ; i< mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        } 
        System.out.println(mainList);

        // table storing
        ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();   
        ArrayList<Integer> List3 = new ArrayList<>();   
        
        for(int i = 1 ; i<=5 ; i++){
            List1.add(i*1);
            List2.add(i*2);
            List3.add(i*3);
        }
        // adding element in main list
        mainList2.add(List1);
        mainList2.add(List2);
        mainList2.add(List3);
        for(int i = 0; i<mainList2.size();i++){
            ArrayList<Integer> currList2 = mainList2.get(i);
            for(int j = 0;j<currList2.size();j++){
                System.out.print(currList2.get(j)+" ");
            }
            System.out.println();
        }
    }
}
