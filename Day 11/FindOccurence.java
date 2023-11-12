class Main{
    static void FindOccurence(int[][] arr,int element){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==element){
                    count++;
                }
            }
        }
        
        System.out.print(count);
    }
    public static void main(String [] args){
        int[][] arr={{1,2,3},{4,2,6},{2,8,9}};
        FindOccurence(arr,2);
    }
}
