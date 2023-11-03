import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A_size=sc.nextInt();
        int[][] A=new int[A_size][A_size];
        int[][] B=new int[A_size][A_size];
        for(int i=0;i<A_size;i++){
            for(int j=0;j<A_size;j++){
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<A_size;i++){
            for(int j=0;j<A_size;j++){
                B[i][j]=sc.nextInt();
            }
        }
        int[][] C=new int[A_size][A_size];
        for(int i=0;i<A_size;i++){
            for(int j=0;j<A_size;j++){
                C[i][j]=A[i][j]*B[i][j];
            }
        }
        for(int i=0;i<A_size;i++){
            for(int j=0;j<A_size;j++){
                System.out.print(C[i][j]);
            }
            System.out.print("\n");
        }
        
    }
}
