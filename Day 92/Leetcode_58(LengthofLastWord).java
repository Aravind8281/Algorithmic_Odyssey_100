class Solution {
    public int lengthOfLastWord(String s) {
        String[] stringArray = s.split("\\s+");
        int i=stringArray.length-1;
        String len=stringArray[i];
        return len.length();
    }
}
