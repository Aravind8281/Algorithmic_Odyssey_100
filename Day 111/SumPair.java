import java.util.*;
public class Main
{
    static List<Integer> SumPair(int target,int sum,int[] arr,int index,List<Integer> indexes){
        if(sum==target){
            return indexes;
        }
        if(index>=arr.length){
            return null;
        }
        List<Integer> includeindexes=new ArrayList<>(indexes);
        includeindexes.add(index);
        List<Integer> include=SumPair(target,sum+arr[index],arr,index+1,includeindexes);
        List<Integer> exclude=SumPair(target,sum,arr,index+1,includeindexes);
        return (include!=null)?include:exclude;
    }
	public static void main(String[] args) {
		int target=9;
		int[] arr={2,7,10,11};
		List<Integer> result = SumPair(target, 0, arr, 0, new ArrayList<>());
        System.out.print(result);
	}
}
