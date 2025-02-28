import java.util.*;
public class _117galgo6 {
    static class Job{
        int deadLine;
        int profit;
        int id;

        Job(int i,int d ,int p){
            id = i;
            deadLine = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int a[][] ={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i = 0;i<a.length;i++){
            jobs.add(new Job(i,a[i][0], a[i][1]));
        }
        Collections.sort(jobs,(x,y) -> y.profit-x.profit);
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i =0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadLine>time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Macimum jobs that can be performed :"+seq.size());
        for(int i =0;i<seq.size();i++){
            System.out.println("At index : "+seq.get(i));
        }
    }
}
