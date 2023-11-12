class Main{
    static void MatrixSearch(int[][] arr,int target){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==target){
                    System.out.print("Found at "+i+" "+j);
                }
            }
        }
    }
    public static void main(String [] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        MatrixSearch(arr,5);
    }
}
