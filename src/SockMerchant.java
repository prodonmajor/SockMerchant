import java.util.*;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        if (n <= 0){
            return 0;
        }
        boolean pair_found = false;
        int total_match = 0;
        Map<Integer,Integer> pairs = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!pairs.containsKey(ar[i])){
                pairs.put(ar[i],1);
            }else{
                pairs.put(ar[i],pairs.get(ar[i])+1);
            }
        }
        Iterator it = pairs.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            Integer map_key = (Integer) entry.getKey();
            Integer map_value = (Integer) entry.getValue();
            if(map_value >= 2){
                int one_match = map_value / 2;
                total_match += one_match;
            }
        }
        return total_match;
    }

    public static void main(String[] args){
        int count = sockMerchant(9,new int []{10, 20, 20, 10, 10, 30, 50, 10, 20});
        System.out.println(count);
    }
}
