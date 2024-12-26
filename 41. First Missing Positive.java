class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max_val = Integer.MIN_VALUE;
        for(int num : nums) {
            max_val = Math.max(max_val, num);
            if(map.containsKey(num)) {
                map.put(num, map.getOrDefault(num, 0) + 1); 
            } else {
                map.put(num, 1);
            }
        }

        for(int i = 1; i <= max_val || i <= nums.length; i++) {
            if(!map.containsKey(i)) {
                return i;
            }
        }

        return max_val + 1;
    }
}
