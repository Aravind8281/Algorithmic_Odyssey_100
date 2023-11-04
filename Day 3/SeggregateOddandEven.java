class Main {
    static void Seggregate(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,5,8,7};
        Seggregate(arr);
    }
}
