class Main{
    static boolean PairWise(int[] arr,int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]*arr[j]==sum){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int sum=16;
        System.out.print(PairWise(arr,sum));
    }
}
