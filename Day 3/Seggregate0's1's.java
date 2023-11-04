class Main {
    static void Seggregate(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            while(left<arr.length-1 && arr[left]==0)
                left++;
            while(right>0 && arr[right]==1)
                right--;
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        for(int nums:arr){
            System.out.print(nums);
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,0,1,0};
        Seggregate(arr);
    }
}
