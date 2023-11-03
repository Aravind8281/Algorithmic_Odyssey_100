import java.util.*;
class Main{
    static boolean Search(int[][] A,int A_size,int target){
        for(int i=0;i<A_size;i++){
            for(int j=0;j<A_size;j++){
                if(target==A[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A_size=sc.nextInt();
        int[][] A=new int[A_size][A_size];
        for(int i=0;i<A_size;i++){
            for(int j=0;j<A_size;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        System.out.print(Search(A,A_size,target));
        
        
    }
}
