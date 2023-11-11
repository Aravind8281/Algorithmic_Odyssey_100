class Main{
    static boolean frontAgain(String str){
        char[] chr=str.toCharArray();
        int[] b=new int[26];
        for(int i=0;i<chr.length;i++){
            int k=Math.abs(97-(char)chr[i]);
            b[k]++;
        }
        for(int i=0;i<b.length;i++){
            if(b[i]>1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str="edit";
        System.out.print(frontAgain(str));
    }
}
