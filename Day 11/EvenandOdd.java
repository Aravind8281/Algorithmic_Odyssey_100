class Main{
    static void EvenandOdd(int[][] arr){
        int count=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
              if(count==0){
                  arr[i][j]=1;
                  count++;
              }
              else{
                  arr[i][j]=2;
                  count--;
              }
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String [] args){
        int[][] arr=new int[5][5];
        EvenandOdd(arr);
    }
}
