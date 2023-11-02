class Main {
    static void sum(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=count+arr[i];
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 4, 3, 3, 2, 1 };
        sum(arr);
    }
}
