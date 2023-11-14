public class Main
{
    public static void HorizontalPrint(int num){
        int mid=num/2;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==mid){
                    System.out.print(" * ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println("\n");
        }
    }
	public static void main(String[] args) {
		HorizontalPrint(5);
	}
}
