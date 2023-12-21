class Main{
    static int Search(int[] arr,int target,int i){
        if(arr.length==i){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        i++;
        return Search(arr,target,i);
    }
    public static void main (String[] args) {
        int[] arr={1,2,3,4,5,6};
        int i=0;
        int target=10;
        System.out.print(Search(arr,target,i));
    }
}
