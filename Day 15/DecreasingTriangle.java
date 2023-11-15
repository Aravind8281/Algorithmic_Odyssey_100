public class Main
{
    static void DecreasingTrianglePattern(int size){
        for(int i=size;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
	public static void main(String[] args) {
		DecreasingTrianglePattern(5);
	}
}
