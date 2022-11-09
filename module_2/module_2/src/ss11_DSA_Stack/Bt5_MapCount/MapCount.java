package ss11_DSA_Stack.Bt5_MapCount;

import java.util.Map;
import java.util.TreeMap;

public class MapCount {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        String s = "aBc xyZ Ghz abc uio Abc jkl abc xyz asd xyz abc";

        String arr[] = s.toLowerCase().split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int index = map.get(arr[i]);
                index++;
                map.replace(arr[i], index);
            }
        }

        System.out.println(map);


//        for (int i = 0; i < arr.length; i++) {
//            if (!map.containsKey(arr[i])) {
//                map.put(arr[i], count);
//            } else {
//                map.put(arr[i], count++);
//            }
//        }



    }
}
