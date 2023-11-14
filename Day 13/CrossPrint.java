public class Main
{
    public static void CrossPrint(int num){
        int count=num;
        for(int i=0;i<num;i++){
            for(int j=4;j>=0;j--){
                if(i==j || i+j==count-1){
                    System.out.print(" * ");
                }
                
                else
                    System.out.print("   ");
            }
            System.out.println("\n");
        }
        
    }
	public static void main(String[] args) {
		CrossPrint(5);
	}
}
