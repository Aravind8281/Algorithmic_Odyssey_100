import java.util.*;
public class Main
{
    static void Activity_selection(int[] start,int[] finish){
        int i, j;
        int n=start.length;
        i=0;
        System.out.print(i +"  ");
        for(j=1;j<n;j++){
            if(start[j]>=finish[i]){
                System.out.print(j+"  ");
                i=j;
            }
        }
        
    }
	public static void main(String[] args) {
		int[] start={10, 12, 20};
		int[] finish={20, 25, 30};
		Activity_selection(start,finish);
	}
}
