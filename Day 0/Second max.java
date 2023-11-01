public class Main
{
    static int Second_Max(int[] arr){
        int firstmax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>firstmax){
                secondmax=firstmax;
                firstmax=num;
            }
            else if(num>secondmax && num<firstmax){
                secondmax=num;
            }
        }
        return secondmax;
    }
	public static void main(String[] args) {
		int[] arr={5,4,3,2,1};
		System.out.println(Second_Max(arr));
	}
}

