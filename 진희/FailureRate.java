import java.util.*;

public class FailureRate {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};

//        float[] fail = new float[N];
        Map<Integer,Float> map = new HashMap<>();
        int mom = stages.length;
        int nextMom = mom;
        int count;
        for(int i=1;i<=N;i++){
            mom = nextMom;
            count=0;
            for (int numbers:stages) {
                if(i==numbers){
                    count++;
                    nextMom--;
                }
            }
            float rate = (float)count/ mom;
            if(count==0){
                rate = 0;
            }

            map.put(i,rate);
//            fail[i - 1]= (float) (count*1.0/ mom);
        }
        List<Integer> list = new ArrayList<Integer>(map.keySet());
        Collections.sort(list, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
        for(Integer key : list){
            System.out.println(key);

        }

        System.out.println(map.toString());
    }
}
