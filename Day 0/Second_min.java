public class Main
{
    static int Second_Min(int[] arr){
        int firstmin=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<firstmin){
                secondmin=firstmin;
                firstmin=num;
            }
            else if(num<secondmin && num>firstmin){
                secondmin=num;
            }
        }
        return secondmin;
    }
	public static void main(String[] args) {
		int[] arr={5,4,3,2,1};
		System.out.println(Second_Min(arr));
	}
}
