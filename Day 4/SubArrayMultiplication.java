public class Main {
    static void Multiplication(int[] arr,int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]*arr[j])==target){
                    System.out.print(i+" "+j);
                    return;
                }
            }
        }   
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target=6;
        Multiplication(arr,target);
    }
}
