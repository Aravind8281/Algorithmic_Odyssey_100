public class Main
{
    public static void ArrowPrint(int num){
        int mid=num/2;
        int row=2;
        int column=3;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if((i+j==mid+1 && i!=0) ||(i==num-2)){
                    System.out.print(" * ");
                }
                else if(i==row && j==column){
                    row++;
                    column++;
                    System.out.print(" * ");
                }
                else
                    System.out.print("   ");
            }
            System.out.println("\n");
        }
        
    }
	public static void main(String[] args) {
		ArrowPrint(5);
	}
}
