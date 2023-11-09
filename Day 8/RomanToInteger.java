public class Main {
    static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    public static void RomanToInteger(String rom){
        char[] arr=rom.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            int s1=value(arr[i]);
            if(i+1<arr.length){
                int s2=value(arr[i+1]);
                if(s1>=s2){
                    count=count+s1;
                }
                else{
                    count=count+s2-s1;
                    i++;
                }
            }
            else{
                count=count+s1;
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        String rom="MCMIV";
        RomanToInteger(rom);
    }
}
