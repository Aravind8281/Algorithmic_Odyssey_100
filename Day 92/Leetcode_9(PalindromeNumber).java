class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
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
