class Main{
    static int maximum(int[] arr,int k){
        int max=arr[k];
        for(int i=k;i<arr.length-1;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    static void greater(int[] arr){
        int n=arr.length-1;
        for(int i=1;i<n;i++){
            System.out.print(maximum(arr,i)+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={14,15,8,9,5,2};
        greater(arr);
    }
}
