public class Main {
    static void Moreoccurancecheck(int[][] arr) {
        int[] b=new int[10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                b[arr[i][j]]++;
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i]>1){
                System.out.print(b[i]);
            }
        }
        
        
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 2}, {4, 5, 6}, {7, 8, 9}};
        Moreoccurancecheck(arr);
    }
}
