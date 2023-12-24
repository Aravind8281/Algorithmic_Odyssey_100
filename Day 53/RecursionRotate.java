public class Main{
    static void RotateElements(int[] arr,int i){
        if(i==arr.length){
            return;
        }
        arr[i-1]=arr[i];
        RotateElements(arr,i+1);
    }
    static void Rotate(int[] arr){
        int temp=arr[0];
        RotateElements(arr,1);
        arr[arr.length-1]=temp;
    }
    public static void main (String[] args) {
        int[] arr={2,3,4,5,6,7};
        Rotate(arr);
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+"  ");
        }
    }
}
