public class Main
{
    
    static int remove(int[] arr,int target){
        int newsize=arr.length;
        for(int i=0;i<newsize;i++){
            if(arr[i]==target){
                for(int j=i;j<newsize-1;j++){
                    arr[j]=arr[j+1];
                }
                newsize--;
                i--;
            }
        }
        return newsize;
    }
    public static void main(String[] args){
        int[] arr={6,5,3,6,2,2,8};
        int target=2;
        int newsize=remove(arr,target);
        for (int i = 0; i < newsize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
