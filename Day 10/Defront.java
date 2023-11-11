class Main{
    static void Defront(String str){
        char[] chr=str.toCharArray();
        for(int i=0;i<chr.length;i++){
            if(i==0 && chr[i]=='a'){
                System.out.print("a");
            }
            else if(i>1){
                System.out.print(chr[i]);
            }
        }
    }
    public static void main(String[] args){
        String str="adit";
        Defront(str);
    }
}
