public class Main
{
    static void IncreasingTrianglePattern(int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
	public static void main(String[] args) {
		IncreasingTrianglePattern(5);
	}
}
