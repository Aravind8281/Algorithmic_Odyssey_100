public class Main
{
    static int Last_occurance(int[] array,int target){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] array = {5, 2, 7, 8, 2, 3, 4, 2, 9};

        int target = 2;
        System.out.println(Last_occurance(array, target));
	}
}
