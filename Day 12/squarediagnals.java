public class Main {
    static void Square(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i][i]=arr[i][i]*arr[i][i];
            System.out.print(arr[i][i]);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 2}, {4, 5, 6}, {7, 8, 9}};
        Square(arr);
    }
}
