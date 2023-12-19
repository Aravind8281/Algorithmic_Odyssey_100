class Main {
    static int[] InsertionSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        int[] sort = InsertionSort(arr);
        for (int i : sort) {
            System.out.print(i + " ");
        }
    }
}
