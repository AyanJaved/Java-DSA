import java.util.*;
public class _112galgo1 {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int maxAct = 0;
        // sorting
        int activities[][] = new int[stat.length][3];
        for(int i = 0; i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        // lamda function -> short form
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        ArrayList<Integer> ans = new ArrayList<>();
        maxAct =1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i = 0; i<start.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("Max Activities = " + maxAct);
        for(int i = 0; i<ans.size();i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}