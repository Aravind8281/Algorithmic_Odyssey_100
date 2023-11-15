public class Main
{
    static void ButterFlyPattern(int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j || i+j==size-1 || j==0 || j==size-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println("\n");
        }
    }
	public static void main(String[] args) {
		ButterFlyPattern(5);
	}
}
