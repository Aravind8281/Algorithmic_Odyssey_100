public class Main{
    static void RotateElements(int[] arr, int i) {
        if (i == arr.length - 1) {
            return;
        }
        RotateElements(arr, i + 1);
        arr[i + 1] = arr[i];
    }
    static void Rotate(int[] arr,int k,int count) {
        if(count==k){
            return;
        }
        int temp = arr[arr.length - 1];
        RotateElements(arr, 0);
        arr[0] = temp;
        Rotate(arr,k,count+1);
    }
    public static void main (String[] args) {
        int[] arr={2,3,4,5,6,7};
        int k=3;
        int n=k%arr.length;
        Rotate(arr,n,0);
        for(int l=0;l<arr.length;l++){
            System.out.print(arr[l]+"  ");
        }
    }
}
