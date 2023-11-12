class Main{
    static void MatrixSum(int[][] arr){
        int min=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j]<min){
                min=arr[i][j];
            }
        }
        }
        System.out.print(min);
    }
    public static void main(String [] args){
        int[][] arr={{9,2,3},{4,5,6},{7,8,1}};
        MatrixSum(arr);
    }
}
