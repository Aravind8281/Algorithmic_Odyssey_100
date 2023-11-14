public class Main
{
    public static void BoxPrint(int num){
        int row=num;
        int column=num;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==0 || j==0){
                    System.out.print(" * ");
                }
                else if(i==row-1||j==column-1){
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
