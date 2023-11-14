public class Main
{
    public static void VerticalPrint(int num){
        int mid=num/2;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(j==mid){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
	public static void main(String[] args) {
		VerticalPrint(5);
	}
}
