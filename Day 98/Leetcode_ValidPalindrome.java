class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().trim();
        str=str.replaceAll("[^a-zA-Z0-9]", "");
        char[] ch=str.toCharArray();
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(ch[i]!=ch[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
