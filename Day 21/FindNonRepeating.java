import java.util.*;
public class Main
{
    static void FindNonRepeating(char[] arr){
        HashMap<Character,Integer> map=new HashMap<>();
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])==1){
                q.offer(arr[i]);
            }
            while(!q.isEmpty()){
                char c=q.peek();
                if(map.get(c)==1){
                    break;
                }
                else{
                    q.poll();
                }
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }
    }
	public static void main(String[] args) {
		char[] arr={'a','a','b','c','c','d','b','a'};//a -1 b b b b d d
		FindNonRepeating(arr);
	}
}

