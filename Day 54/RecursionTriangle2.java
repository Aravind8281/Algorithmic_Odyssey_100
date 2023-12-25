public class Main{
    static void printTriangle(int row,int count){
        if(count==row){
            return;
        }
        for(int i=0;i<count;i++){
            System.out.print("* ");
        }
        System.out.println();
        printTriangle(row,count+1);
    }
    public static void main (String[] args) {
        int row=4;
        printTriangle(row,1);
    }
}
