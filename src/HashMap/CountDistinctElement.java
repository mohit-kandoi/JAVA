package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountDistinctElement {
    public static void main(String[] args) {
        int[] a = {1,3,2,1,2,5,2,3};
        frequencyOfElements(a);

    }

    static void frequencyOfElements(int[] a){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int e : a){
            if(map.containsKey(e)){
                map.put(e, map.get(e)+1);
            }else{
                map.put(e, 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("Frequency of "+entry.getKey() + " -> " +entry.getValue());
        }
    }
    static int distinctElements(int[] a){
        HashSet<Integer> set = new HashSet<>();
        for(int e : a){
            set.add(e);
        }
        return set.size();
    }
}
