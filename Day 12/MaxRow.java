public class Main {
    static void Maxrow(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0]; 
            for (int j = 1; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Maxrow(arr);
    }
}

