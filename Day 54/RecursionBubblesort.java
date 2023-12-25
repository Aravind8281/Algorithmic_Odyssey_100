public class Main{
    static void Bubblesort(int[] arr,int row,int count){
        if(count==row){
            return;
        }
        if(count<row-1){
            if(arr[count]>arr[count+1]){
                int temp=arr[count];
                arr[count]=arr[count+1];
                arr[count+1]=temp;
            }
            Bubblesort(arr,row,count+1);
        }
        else{
            Bubblesort(arr,row-1,0);
        }
    }
    public static void main (String[] args) {
       int[] arr = {5, 2, 9, 1, 5, 6};
        int row = arr.length;
        Bubblesort(arr, row, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
