class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int cur = 0;
        if (strs.length == 0) {
            return result;
        }
        while (true) {
            for (int i = 0; i < strs.length; i++) {
                if (cur >= strs[i].length() || cur >= strs[0].length() || strs[i].charAt(cur) != strs[0].charAt(cur)) {
                    return result;
                }
            }
            result = result + strs[0].charAt(cur);
            cur += 1;
        }
    }
}
