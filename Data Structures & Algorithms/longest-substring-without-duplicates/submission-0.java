class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++)
        {
            char x = s.charAt(right);
            while(hs.contains(x))
            {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(x);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
