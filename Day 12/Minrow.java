public class Main {
    static void Minrow(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0]; 
            for (int j = 1; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            System.out.print(min + " ");
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Minrow(arr);
    }
}
