public class Main{
    static void RotateElements(int[] arr, int i) {
        if (i == arr.length - 1) {
            return;
        }
        RotateElements(arr, i + 1);
        arr[i + 1] = arr[i];
    }
    static void Rotate(int[] arr) {
        int temp = arr[arr.length - 1];
        RotateElements(arr, 0);
        arr[0] = temp;
    }
    public static void main (String[] args) {
        int[] arr={2,3,4,5,6,7};
        Rotate(arr);
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+"  ");
        }
    }
}
