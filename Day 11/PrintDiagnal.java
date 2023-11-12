class Main{
    static void Diagnol(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i]);
        }
    }
    public static void main(String [] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        Diagnal(arr);
    }
}
