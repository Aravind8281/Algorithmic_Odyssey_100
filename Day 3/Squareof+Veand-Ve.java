class Main{
    static void Square(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]*arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={-4,-2,-1,3,5};
        Square(arr);
    }
}
