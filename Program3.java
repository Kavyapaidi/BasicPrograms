import java.util.*;
public class Program3 {
    public static List<Integer> sortBasedOnFrequencyAndValue(List<Integer> list)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<list.size();i++)
        {
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }
        Collections.sort(list,(n1,n2)->{
            int freq1=map.get(n1);
            int freq2=map.get(n2);
            if(freq1!=freq2)
                return freq2-freq1;//-ve value-do not swap
            return n1-n2;//ascending order
        });
        return list;
    }
    public static void main(String[] args) {
        int[] arr={1,4,5,6,6,5,3,5,1,6,4,6};
        //converts array to list
        List<Integer> list = new ArrayList<>();
        for (int t : arr) {
            list.add(t);
        }
        System.out.println(sortBasedOnFrequencyAndValue(list));
    }
}

