class Main{
    static boolean PairWise(int[] arr,int sum){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==sum){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={0,-1,2,-3,1};
        int sum=2;
        System.out.print(PairWise(arr,sum));
    }
}
