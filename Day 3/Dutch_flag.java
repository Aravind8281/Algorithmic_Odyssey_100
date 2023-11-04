class Dutch{
    void dutch_flag(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            switch(arr[mid]){
                case 0:{
                    int temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
                }
            }
        }
        for(int num:arr){
            System.out.print(num);
        }
    }
    
}
public class Main
{
	public static void main(String[] args) {
        Dutch execute=new Dutch();
        int[] arr={1,0,0,1,2,2};
        execute.dutch_flag(arr);
	}
}
