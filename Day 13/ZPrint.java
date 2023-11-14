public class Main
{
    public static void BoxPrint(int num){
        int row=num;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==0 || i==row-1 || i+j==row-1){
                    System.out.print(" * ");
                }
                else
                    System.out.print("   ");
            }
            System.out.println("\n");
        }
        
    }
	public static void main(String[] args) {
		BoxPrint(5);
	}
}
