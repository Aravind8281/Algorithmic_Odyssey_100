public class Main
{
    public static boolean hasBad(String str){
        int count=0;
        char[] chr=str.toCharArray();
        for(int i=0;i<chr.length;i++){
            if(chr[i]=='b'||chr[i]=='a'||chr[i]=='d')
                count++;
            else 
                continue;
        }
        if(count!=3){
            return true;
        }
        return true;
        
    }
	public static void main(String[] args) {
		String str="xxxxxbadxxxxx";
		System.out.print(hasBad(str));
	}
}
