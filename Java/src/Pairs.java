import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pairs {
    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int pairs(int k, List<Integer> arr) {
        java.util.Collections.sort(arr);
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (Integer value : arr) {
            if(hashMap.containsKey(value-k)){
                hashMap.put(value, true);
            } else {
                hashMap.put(value, false);
            }
        }

        return Collections.frequency(hashMap.values(), true);
    }
}
