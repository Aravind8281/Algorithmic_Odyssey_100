public class Main{
    static void printTriangle(int row){
        if(row==0){
            return;
        }
        for(int i=0;i<row;i++){
            System.out.print("* ");
        }
        System.out.println();
        printTriangle(row-1);
    }
    public static void main (String[] args) {
        int row=4;
        printTriangle(row);
    }
}
