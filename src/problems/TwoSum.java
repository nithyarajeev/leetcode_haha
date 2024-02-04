package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String args[]) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("result:" + Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0,0};
        Map<Integer, Integer> _map = new HashMap<Integer, Integer>();
        for (int i = 0; i< nums.length; i++) {
            int difference = target - nums[i];
            if (_map.containsKey(difference))
                result = new int[]{i, _map.get(difference)};
            _map.put(nums[i], i);
        }
        return result;
    }
    public int[] twoSum_brutForce(int[] nums, int target) {
        int[] result = new int[]{0,0};
        for (int i = 0; i< nums.length; i++) {
            for (int j = i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[]{i,j};
                    return result;
                }
            }
        }
        return result;
    }
}
