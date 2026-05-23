class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            hm.put(nums[i], i);
        }
        
        for(int j = 0; j < nums.length; j++)
        {
            int comp = target - nums[j];
            if(hm.containsKey(comp) && j != hm.get(comp))
            {
                return new int[]{j, hm.get(comp)};
            }
        }
        return new int[]{};
    }
}
