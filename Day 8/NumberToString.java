import java.util.*;
public class Main
{
    public static void wordlist(int[] arr){
        String[] str={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.print("Zero");
            }
            else if(arr[i]>0 && arr[i]<10)
                System.out.print(str[arr[i]-1]+" ");
            else{
                System.out.print("Invalid");
            }
        }
    }
	public static void main(String[] args) {
		int[] arr={9,8,9,4,9,3,6,2,2,8,0};
		wordlist(arr);
	}
}
