class Main{
    static void sort(int[] arr,int i){
        if(arr.length==i){
            return;
        }
        for(int j=0;j<arr.length - i - 1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        sort(arr,i+1);
    }
    public static void main (String[] args) {
        int[] arr={2,1,3,4,5};
        sort(arr,0);
        for(int k:arr){
            System.out.print(k + "  ");
        }
    }
}
