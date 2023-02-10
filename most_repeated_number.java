/*import java.util.ArrayList;
import java.util.HashMap;

public class most_repeated_number {
    static int most_repeated(int n) {
        ArrayList<Integer> li = new ArrayList<>();
        while (n != 0) {
            int r = n % 10;
            li.add(r);
            n=n/10;
        }
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<li.size();i++)
        {
            mp.put(li.get(i), mp.getOrDefault(li.get(i),li.get(i)+1));
        }
    }
    public static void main(String[] args) {
        System.out.println(most_repeated(4524));
    }
}*/
