import java.util.HashMap;
public class TwoSumHash {
    int[] answer = new int[2];
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if(hash.get(target - nums[i]) == (target - nums[i])) {
                answer[0] = nums[i];
                answer[1] = target - nums[i];
                break;
            }
        }
        return answer;
    }
}
